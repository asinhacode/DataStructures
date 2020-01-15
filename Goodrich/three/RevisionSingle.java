package three;

public class RevisionSingle<E> {

	private class Node<E> {
		private E data;
		private Node next;

		public Node(E d, Node<E> n) {
			data = d;
			next = n;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public RevisionSingle() {

	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public E getFirst() {
		if (isEmpty()) // nothing to show
			return null;

		else
			return head.getData();
	}

	public E getLast() {
		if (isEmpty()) // nothing to show
			return null;

		else
			return tail.getData();
	}

	public void print() {
		while (head != null) {
			System.out.println(head.getData() + "->");
			head = head.next;
		}
	}

	public void setFirst(E i) {
		Node<E> newFirst = new Node<E>(i, head);
		newFirst.next = head;
		head = newFirst;

		if (getSize() == 0) // empty list
		{
			tail = head;
		}

		size++;

	}
	
	public E removeFirst() {
		
		if(isEmpty())
		{
			tail = null;
			return null;

		}
		
		else
		{
			E getInfo = head.getData();
			head = head.getNext();
			size--;
			return getInfo;
		}
		
		
	}
	
	public void setLast(E i)
	{
		Node<E> newLast = new Node<E>(i, head);

		if(isEmpty())
		{
			head = newLast;
		}
		
		else
		{
			tail.setNext(newLast);
			
		}
		
		tail = newLast;
		size--;
		
		
	}

}
