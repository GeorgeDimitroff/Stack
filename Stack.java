
public class Stack extends Node{
	

	public Stack(int total) {
		super(total);
		// TODO Auto-generated constructor stub
	}

	Node first = null;
	
	public void push(){
		Node current = new Node(total);
		current.next = first;
		first = current;	
	}
	
	public Node pop(){
		Node curr = first;
		first = first.next;
		return curr;
	}
	
}
