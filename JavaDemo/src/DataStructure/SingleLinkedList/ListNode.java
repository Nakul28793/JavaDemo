package DataStructure.SingleLinkedList;

public class ListNode<E> {
	private E value;
	private ListNode<E> next;

	public ListNode(E value, ListNode<E> next) {
		this.value = value;
		this.next = next;
	}

	public E getValue() {
		return value;
	}

	public ListNode<E> getNext() {
		return next;
	}

	public void setValue(E newValue) {
		this.value = newValue;
	}

	public void setNext(ListNode<E> newNext) {
		this.next = newNext;
	}

}
