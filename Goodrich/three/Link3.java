package three;

public class Link3<E> {
	private class Node<E> {
		private E data;
		private Node<E> next;

		public Node(E i, Node n) {
			data = i;
			next = n;
		}

		public E getData() {
			return data;
		}

		public void setNext(Node n) {
			next = n;
		}

		public Node<E> getNext() {
			return next;
		}

	}

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

	public void setFirst(E data) {
		/*
		 * Node<E> newFirst = new Node<E>(data, head);
		 * 
		 * newFirst.next = head;
		 */
		head = new Node<E>(data, head);

		if (isEmpty())
			tail = head;

		size++;
	}

	public void setLast(E data)
	{
		Node<E> newLast = new Node<E>(data, head);
		
		if(isEmpty())
		{
			head = newLast;
		}
		
		else
		{
			tail.setNext(newLast);
			tail = newLast;
		}
		
		size++;
	}

	public E getFirst()
	{
		if(isEmpty())
		{
			return null;
		}
		
		return head.getData();
	}

	public E removeFirst()
	{
		if(isEmpty())
		{
			tail = null;
			return null;
		
		}
		
			E first = head.getData();
			head = head.next;
			size--;
			
			if(isEmpty())
				tail = null;
			
			return first;
		
		

		
	}


	public void printList(){
		
		while(head != null)
		{
			System.out.println(head.getData());
			System.out.println("|");
			head = head.next;
		}
	}

	public void printIndexed(int indexAt)
	{
		if(getSize() < indexAt)
		{
			System.out.println("No node at this point");
		}
		
		else
		{
			for(int i = 1; i <= indexAt; i++)
			{
				head = head.next;
			}
			
			System.out.println("Value here:\t" + head.getData());
		}
	}

}
