package three;

public class L<E> {
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

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public Node<E> head = null;
	public Node<E> tail = null;
	public int size = 0;

	public L() {

	}

	private boolean isEmpty() {

		return getSize() == 0;
	}

	private int getSize() {

		return size;
	}

	public void addFirst(E d) {
		Node<E> front = new Node<E>(d, head);
		front.next = head;
		head = front;

		if (getSize() == 0) {
			tail = head;
		}
		size++;
	}

	public void addLast(E d) {
		Node<E> back = new Node<E>(d, null);

		if (isEmpty()) {
			head = back;
		} else {
			tail.setNext(back);
		}

		tail = back;

		size++;
	}

	public E removeFirst() {
		if (isEmpty()) {
			tail = null;
			return null;

		}

		else {
			E obtained = head.getData();
			size--;
			head = head.getNext();

			if (isEmpty())
				tail = null;

			return obtained;

		}

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

	public void printList() {
		while (head != null) {
			System.out.print(" <-> " + head.getData() + " <-> ");
			head = head.next;
		}
	}

}
