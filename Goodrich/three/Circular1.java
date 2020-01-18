package three;


public class Circular1<E> 
{
	private class Node<E> 
	{
		public E data;
		public Node<E> next;

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
	
	private Node<E> tail = null;
	private int size = 0;
	
	public Circular1()
	{
		
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public E first()
	{
		if(isEmpty())
			return null;
		else
		return tail.getNext().getData(); 
	}
}
