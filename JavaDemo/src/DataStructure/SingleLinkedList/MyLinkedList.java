package DataStructure.SingleLinkedList;

public class MyLinkedList<E> {

	private ListNode<E> head;
	private ListNode<E> current;
	private ListNode<E> previous;
	
	
	
	public void insertFirst(E value)
	{
		ListNode<E> newNode=new ListNode<E>(value,null);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.setNext(head);
			head=newNode;
		}
		
	}
	
	public void insertLast(E value)
	{
		ListNode<E> newNode=new ListNode<E>(value,null);
		if(head==null)
		{
			head=newNode;
		}
		else
		{	
			current=head;
			while(current!=null)
			{
				previous=current;
				current=current.getNext();
			}
			
			previous.setNext(newNode);
		}
		
	}
	
	public ListNode<E> deleteFirst()
	{
		ListNode<E> remove=head;
		if(head!=null)
		{
			head=head.getNext();
		}
		return remove;
	}
	
	public ListNode<E> deleteLast()
	{
		
		if(head!=null)
		{
			current=head;
			while(current.getNext()!=null)
			{
				previous=current;
				current=current.getNext();
			}
			
			previous.setNext(null);
			return current;
		}
		return null;
	}
	
	public static void main(String args[])
	{
		MyLinkedList<String> list =new MyLinkedList<String>();
		list.insertFirst("Cherry");
		list.insertFirst("Banana");
		list.insertFirst("Apple");
		System.out.println(list.deleteLast().getValue());
		
	}
	
}

