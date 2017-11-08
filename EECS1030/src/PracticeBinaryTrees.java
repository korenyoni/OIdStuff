



public class PracticeBinaryTrees <E extends Comparable<? super E>> 
{

	private Node<E> root;
	
	public PracticeBinaryTrees() 
	{
		root = null;
	}
	
	public String toString(Node<E> root)
	{
		
		return null;
		
	}
	private String toString(Node root,index int)
	 
	
	
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
	 
	        public String toString()
	        {
	            return this.data.toString();
	        }
	    }
}
