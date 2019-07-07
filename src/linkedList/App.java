package linkedList;

public class App {
	
	public static void main(String[] args) {
		//create an instance of the class
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println(listLength(nodeA)); //4
	}
	
	//create a static method => static method can be called without having to create an instance
	//returns an integer
	public static int listLength(Node aNode) {
		int length = 0;
		Node currentNode = aNode;
		
		while(currentNode != null) {
			length++;
			//point to the next node and assign that next node to be the current node
			currentNode = currentNode.next;
		}
		
		return length;
	}
	
}
