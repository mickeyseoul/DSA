package datastructures.linkedlist;

public class LinkedList {
	
	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
	//                                                          //
	//                                                          //
	//                                                          //
	//                                                          //
	//////////////////////////////////////////////////////////////
	
	private Node head; //class variable should private
	private Node tail;
	private int length;
	
	class Node { //inner class, nested class
		int value;
		Node next;
		
		Node(int value) {
			this.value = value;
		}
	}
	
	//create new Node
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	//create new Node, add Node to end
	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;
	}
	
	public Node removeLast() {
		if (length == 0) return null;
		
		Node temp = head;
		if (length == 1) {
			temp = null;
		} else {
			for (int i = 0; i < length-1; i++) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		}
		length--;
		
		return temp;
	}
	
	//create new Node, add Node to beginning
	public void prepend(int value) {
		
	}
	
	//create new Node, insert Node at a particular index
//	public boolean insert(int index, int value) {
//		
//	}
	
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }


}
