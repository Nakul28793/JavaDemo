package DataStructure.SingleLinkedList;

public class Test1 {

	public static void main(String args[])
	{
		//ListNode<String> start=new ListNode<String>("Apple",null);
		//System.out.println(start.getValue());
		ListNode<String> start=new ListNode<String>("Apple",
							   new ListNode<String>("Banana",
							   new ListNode<String>("Cherry",null)));
		/*System.out.println(start.getValue());
		System.out.println(start.getNext().getValue());
		System.out.println(start.getNext().getNext().getValue());*/
		
						//OR
		
		while(start!=null)
		{
			System.out.println(start.getValue());
			start=start.getNext();
		}
		
		
		ListNode<String> a=new ListNode<String>("Cherry",null);
		ListNode<String> b=new ListNode<String>("Banana",a);
		ListNode<String> c=new ListNode<String>("Apple",b);
		
		/*System.out.println(c.getValue());
		System.out.println(c.getNext().getValue());
		System.out.println(c.getNext().getNext().getValue());*/
		
						// OR
		
		while(c!=null)
		{
			System.out.println(c.getValue());
			c=c.getNext();
		}
	}
}
