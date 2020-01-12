package video1;

// node class
 class Node
{
	int i;
	Node nextPointer; // class for next node (has i and another class of same type)
}

 class Linked // where every node will be placed
 {

	public Node insert(int i, Node root) 
	{
		
		if(root == null) // first node
		{
			return getNewNode(i); // create the FIRST node new node -- line 31
		}
		
		else
		{
			root.nextPointer = insert(i, root.nextPointer); // insert every node after it
		}
		
		
		
		return root;
	}

	private Node getNewNode(int i) // line 31 -- create a new node, next node points to null
	{
		
		Node newNode = new Node();
		newNode.i = i;
		newNode.nextPointer = null;
		
		return newNode;
	}

	public void printList(Node root) // print the list
	{
		if(root == null)
			return;
		
		else
		{
			System.out.print(root.i + " --> ");
			printList(root.nextPointer);

		}
	}
	 
 }

public class LinkedList 
{

	public static void main(String[] args)
	{
		Node root = null;
		Linked chain = new Linked();
		
		root = chain.insert(0, root);
		root = chain.insert(1, root);
		root = chain.insert(1, root);
		root = chain.insert(2, root);
		root = chain.insert(3, root);
		root = chain.insert(5, root);
		
		chain.printList(root);

	}

}
