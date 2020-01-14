package linkedList;
// add to the end of the list

public class AddLast<E> 
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
		
		private Node<E> tail;
		
		private int sizeOfList;

		public AddLast() 
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
		
		// O(N)
		public Node<E> addAtLast(E i)
		{	// create a new node
			Node<E> addedLast = new Node<E>(i); // create a new node

			// the list is empty
			// head points to null
			// tempTraversal.next = null
			// throws null pointer exception
			if(head == null)
			{
				head = addedLast;
				sizeOfList++; // increase the size of list
				return addedLast; // no need to go down
			}
			
			// create a tempTraversal and point it to the front of the list
			Node<E> tempTraversal = head;
			
			// move till tmp.next != null
			// O(N) - linear time
			while(tempTraversal.next != null)
			{
				tempTraversal = tempTraversal.next;
			}
			
			// now at the end
			tempTraversal.next = addedLast;
			sizeOfList++; // increase the size of list

			return addedLast;
			
		}
		
		// O(1)
		public Node<E> addLastBetter(E i)
		{
			Node<E> addedLast = new Node<E>(i); // create a new node

			if(head == null)
			{
				head = tail = addedLast;
				sizeOfList++; // increase the size of list
				return addedLast;
			}
			
			tail.next = addedLast;
			tail = addedLast;
			sizeOfList++; // increase the size of list

			return addedLast;

		}

	}


