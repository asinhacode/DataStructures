
package linkedList;

// add to the front of the list
public class AddFirst<E> 
{

	
	class Node<E> 
	{
		E data;
		Node<E> next;

		public Node(E obj) 
		{
			data = obj;
			next = null;
		}
	}

	private Node<E> head;
	private int sizeOfList;

	public AddFirst() 
	{
		head = null;
		sizeOfList = 0;
	}
	
	public Node<E> addAtFirst(E i) // add at the beginning
	{
		Node<E> previous = new Node<E>(i); // create a new node

		if(head == null) // if empty ?
		{
			head = previous; // this is the first element

		}
		
		else
		{
			previous.next = head; // points to the first node
			head = previous; // change head to this node
			// this is the first node now
		}
		
		sizeOfList++; // increase the size of list
		
		return previous;
	}

}
