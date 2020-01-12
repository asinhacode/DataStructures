package linkedList;

public class LinkedList<E> 
{
	// private class of LinkedList
	/*  A description of a node
	 * 			 _________
				|         | 
				|  data   |
				|         |
				|         |
				| _______ |		   
				|         |
				|         |
				|  next   |
				|         |
				|_________|		   
				
	 */
	class Node<E>
	{
		E data;
		Node<E> next;
		
		public Node(E obj) // constructor to create a new node
		{
			data = obj;
			next = null;
		}
	}
	
	
	
	
	
	
	
	
	private Node<E> head;   // pointer
	private int sizeOfList; // keeping track of the list
	
	public LinkedList() // constructor to create a chain
	{
		head = null;
		sizeOfList = 0;
	}
	
}

