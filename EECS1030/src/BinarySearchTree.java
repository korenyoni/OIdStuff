import java.io.PrintStream;
import java.util.Scanner;


/**
 * This class encapsulates a binary search tree.
 * @author Steven Castellucci, 2015
 */
public class BinarySearchTree<E extends Comparable<? super E>>
							// Ensure the parameterized type can be sorted.
{
	private Node<E> root;
	
	
	/**
	 * Initializes an empty binary search tree.
	 */
	public BinarySearchTree()
	{
		root = null;
	}
	
	
	
	/**
	 * Adds the passed value to the tree.
	 * @param value the value to add to the tree
	 */
	public void add(E value)
	{
		root = addNode(root, value);
	}
	@SuppressWarnings("unchecked")
	private Node<E> addNode(Node<E> root, E value)
	{
		Node<E> result=null;
		if (root==null)
		{
			result= new Node<E>(value,null,null);
		}
		else if(root.data.compareTo(value) > 0)
		{
			root.leftSubTree = addNode(root.leftSubTree,value);
			result = root;
			
		}
		else
		{
			root.rightSubTree = addNode(root.rightSubTree,value);
			result = root;
		}
		return result;
	}
	
	// Solves 'add' recursively.
	
	
	
	
	/**
	 * Removes the passed value from the tree. The tree is not changed
	 * if it does not contain the passed value.
	 * @param value the value to remove from the tree.
	 */
	public void remove(E value)
	{
	//	root = removeNode(root, value);
	}
	
	// Solves 'remove' recursively.
	
	
	// Returns the largest value in the subtree rooted at 'root'.
	
	
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
//		infixPrint(root, sb);
		return sb.toString().trim();
	}
	
	// Prints the elements in infix order.
	public void preOrderTraversal(Node<E> nude)
	{
		//PreorderVisit root, then left child, then right child
		String printme = null;
		//Node<E> keepTrack = null;
		
		if(nude!=null)
		{
		System.out.println(nude.data);
		
		
		 preOrderTraversal(nude.leftSubTree);
	//	 keepTrack=root;
		 
		
		 preOrderTraversal(nude.rightSubTree);
		}
		
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		PrintStream output = System.out;
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		
		output.println("Enter a list of non-negative integers. Enter -1 to end.");
		for (int i = input.nextInt(); i != -1; i = input.nextInt())
		{
			bst.add(i);
		}
		
		output.println("\nIn sorted order:");
		output.println(bst.toString() + "\n");
		bst.preOrderTraversal(bst.root);
	}
	
	
	/*
	 * This static nested class encapsulates a node in the tree.
	 */
	private static class Node<E>
	{
		private E data;
		private Node<E> leftSubTree;
		private Node<E> rightSubTree;
		
		public Node(E data, Node<E> leftSubTree, Node<E> rightSubTree)
		{
			this.data = data;
			this.leftSubTree = leftSubTree;
			this.rightSubTree = rightSubTree;
		}
	}
}
