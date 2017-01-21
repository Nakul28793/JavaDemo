package singlyLinkedList;

class Node1
{
	int data;
	Node1 nextNode;
	
	public Node1(int data) {	
		this.data = data;		
	}
	
	/*public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}*/
	
}

class MyLinkedList {
Node1 head;
Node1 tail;
public void add(int data)
{	Node1 node=new Node1(data);
	if(tail==null)
	{
		head=node;
		tail=node;
	}
	else
	{
		tail.nextNode=node;
		tail=node;
	}
}
}
public class LinkedListTest
{ 
	public static void main(String[] args)
	{  
		MyLinkedList  list = new MyLinkedList (); 	
		list.add(15);
		list.add(16);
		list.add(10);
		System.out.println(list);
	}
}
