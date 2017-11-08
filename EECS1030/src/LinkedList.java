

	

 
import java.util.Iterator;
import java.util.NoSuchElementException;
 
public class LinkedList
{
    private int size;
    private Node head;
 
    public LinkedList()
    {
        this.size = 0;
        this.head = null;
    }
 
    public void reverseLinkedList()
    {
        reverseLinkedList(this.head);
    }
 
    private void reverseLinkedList(Node node)
    {
        if (node == null)
        {
            return;
        }
 
        Node next = node.next;
        if (next ==  null)
        {
            this.head = node;
            return;
        }
 
        reverseLinkedList(next);
        next.next = node;
        node.next = null;
    }
 
    public void add(char c)
    {
        if (this.size == 0)
        {
            this.head = new Node(c);
        }
        else
        {
            LinkedList.add(c, this.head);
        }
        this.size++;
    }
 
    private static void add(char c, Node node)
    {
        if (node.next == null)
        {
            node.next = new Node(c);
        }
        else
        {
            LinkedList.add(c, node.next);
        }
    }
 
    public void addFirst(char c)
    {
        Node newNode = new Node(c);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
 
    public void add(int index, char c)
    {
        if (index < 0 || index > this.size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        if (index == 0)
        {
            this.addFirst(c);
        }
        else
        {
            LinkedList.add(index - 1, c, this.head);
            this.size++;
        }
    }
 
    private static void add(int index, char c, Node prev)
    {
        if (index == 0)
        {
            Node newNode = new Node(c);
            newNode.next = prev.next;
            prev.next = newNode;
            return;
        }
        LinkedList.add(index - 1, c, prev.next);
    }
 
    public char removeFirst()
    {
        if (this.size == 0)
        {
            throw new NoSuchElementException();
        }
        Node curr = this.head;
        this.head = curr.next;
        curr.next = null;
        this.size--;
        return curr.data;
    }
 
    private static char remove(int index, Node prev, Node curr)
    {
        if (index == 0)
        {
            prev.next = curr.next;
            curr.next = null;
            return curr.data;
        }
        return LinkedList.remove(index - 1, curr, curr.next);
    }
 
    public char remove(int index)
    {
        if (index < 0 || index >= this.size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        if (index == 0)
        {
            return this.removeFirst(); // method that removes 1st element in the linked list
        }
        else
        {
            char result = LinkedList.remove(index - 1, this.head, this.head.next);
            this.size--;
            return result;
        }
    }
 
    public char get(int index)
    {
        if (index < 0 || index >= this.size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        return LinkedList.get(index, this.head);
    }
 
    private static char get(int index, Node node)
    {
        if (index == 0)
        {
            return node.data;
        }
        return LinkedList.get(index - 1, node.next);
    }
 
    public void set(int index, char c)
    {
        if (index < 0 || index >= this.size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
        LinkedList.set(index, c, this.head);
    }
 
    private static void set(int index, char c, Node node)
    {
        if (index == 0)
        {
            node.data = c;
            return;
        }
        LinkedList.set(index - 1, c, node.next);
    }
 
    public String toString() {
        if (this.size == 0)
        {
            return "[]";
        }
        return "[" + LinkedList.toString(this.head);
    }
 
    private static String toString(Node n)
    {
        if (n.next == null)
        {
            return n.data + "]";
        }
 
        String s = n.data + ", ";
        return s + LinkedList.toString(n.next);
    }
 
    public boolean contains(char c)
    {
        if (this.size == 0)
        {
            return false;
        }
        return LinkedList.contains(c, this.head);
    }
 
    private static boolean contains(char c, Node node)
    {
        if (node.data == c)
        {
            return true;
        }
        if (node.next == null)
        {
            return false;
        }
        return LinkedList.contains(c, node.next);
    }
 
    private static class Node
    {
        private char data;
        private Node next;
 
        public Node(char c)
        {
            this.data = c;
            this.next = null;
 
        }
    }
 
    public int indexOf(char c)
    {
        if (this.size == 0)
        {
            return -1;
        }
        return LinkedList.indexOf(c, this.head);
    }
 
    private static int indexOf(char c, Node n)
    {
        if (n.data == c)
        {
            return 0;
        }
        if (n.next == null)
        {
            return -1;
        }
        int i = LinkedList.indexOf(c, n.next);
        if (i == -1)
        {
            return -1;
        }
        return 1 + i;
    }
 
    private class LinkedListIterator implements Iterator<Character> {
        private Node currNode;
        private Node prevNode;
 
        public LinkedListIterator() {
            this.currNode = null;
            this.prevNode = null;
        }
 
        public boolean hasNext()
        {
            if (this.currNode == null)
            {
                return head != null;
            }
            return this.currNode.next != null;
        }
 
        @Override
        public Character next() 
        {
            if (!this.hasNext()) 
            {
                throw new NoSuchElementException();
 
            }
            this.prevNode = this.currNode
            ;
            if (this.currNode == null) {
                this.currNode = head;
 
            }
            else {
                this.currNode = this.currNode.next;
 
            }
            return this.currNode.data;
        }
 
        public void remove() {
            if (this.prevNode == this.currNode)
            {
                throw new IllegalStateException();
 
            }
            if (this.currNode == head) {
                head = this.currNode.next;
 
            }
            else {
                this.prevNode.next = this.currNode.next;
            }
            this.currNode = this.prevNode;
            size--;
        }
    }
 
 
 
    public static void main(String[] args)
    {
        LinkedList t = new LinkedList();
        t.add('a');
        t.add('x');
        t.add('r');
        t.add('a');
        t.add('s');
 
        System.out.println(t);
        //t.reverseLinkedList();
        System.out.println(t);
    }
 
 
}
