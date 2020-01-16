package three;

public class RLinked<E> {

	private class Node<E> {
		private E data;
		private Node next;

		public Node(E d, Node n) {
			data = d;
			next = n;
		}

		public E getData() {
			return data;
		}

		public E setData(E e) {
			E temp = data;

			data = e;

			return temp;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	}

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public RLinked() {

	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public E getFirst() {
		if (isEmpty())
			return null;

		else
			return head.getData();
	}

	public E getLast() {
		if (isEmpty())
			return null;

		else
			return tail.getData();
	}

	public void addFirst(E data) {
		Node<E> front = new Node<E>(data, head);
		front.next = head;
		head = front;

		if (isEmpty()) {
			tail = head;
		}

		size++;
	}

	public E removeFirst() {
		if (isEmpty())
			return null;

		E stored = head.getData();
		head = head.next;
		size--;

		if (getSize() == 0) {
			tail = null;
		}

		return stored;

	}
	
	public void addLast(E data)
	{
		Node<E> last = new Node<E>(data, null);
		
		if(isEmpty())
		{
			head = last;
		}
		
		else
		tail.setNext(last);
		
		tail = last;
		
		size++;
	}

}
