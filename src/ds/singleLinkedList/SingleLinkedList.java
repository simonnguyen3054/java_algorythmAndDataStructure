package ds.singleLinkedList;

public class SingleLinkedList {
	private Node first;
	
	SingleLinkedList() {
		
	}
	
	//check if the list is empty
	public boolean isEmpty() {
		return (first == null);
	}
	
	//insert at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first; //first is node but it has no properties of data or next yet
		first = newNode; //this will make first a node with data and next properties
	}
}
