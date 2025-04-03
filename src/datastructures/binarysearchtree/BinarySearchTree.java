package datastructures.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	
	Node root; // initialized by null
	
	class Node {
		int value;
		Node left;
		Node right;
		
		private Node(int value) {
			this.value = value;
		}
	}
	
	public boolean insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (newNode.value == temp.value) return false;
			if (newNode.value < temp.value) {
				if (temp.left == null) {
					temp.left = newNode;
					return true;
				}
				temp = temp.left;
			} else { // newNode.value > temp.value
				if (temp.right == null) {
					temp.right = newNode;
					return true;
				}
				temp = temp.right;
			}
		}
	}
	
	public boolean contains(int value) {
		Node temp = root;
		while (temp != null) {
			if (value < temp.value) {
				temp = temp.left;
			} else if (value > temp.value) {
				temp = temp.right;
			} else {
				return true;
			}
		}
		return false;
	}
	
	// Recursive
	private boolean rContains(Node currentNode, int value) {
		if (currentNode == null) return false;
		
		if (currentNode.value == value) return true;
		
		if (value < currentNode.value) {
			return rContains(currentNode.left, value);
		} else {
			return rContains(currentNode.right, value);
		}
	}
	
	public boolean rContains(int value) {
		return rContains(root, value);
	}
	
	private Node rInsert(Node currentNode, int value) {
		if (currentNode == null) return new Node(value);
		
		if (value < currentNode.value) {
			currentNode.left = rInsert(currentNode.left, value);
		} else if (value > currentNode.value) {
			currentNode.right = rInsert(currentNode.right, value);
		}
		return currentNode;
	}
	
	public void rInsert(int value) {
		if (root == null) root = new Node(value);
		rInsert(root, value);
	}
	
	// deleteNode()
	public int minValue(Node currentNode) {
		while (currentNode.left != null) {
			currentNode = currentNode.left;
		}
		return currentNode.value;
	}
	
	private Node deleteNode(Node currentNode, int value) {
		if (currentNode == null) return null;
		
		if (value < currentNode.value) { // 1 Traverse
			currentNode.left = deleteNode(currentNode.left, value);
		} else if (value > currentNode.value) {
			currentNode.right = deleteNode(currentNode.right, value);
		} else { // 2 find the value that we are looking for to delete
			if (currentNode.left == null && currentNode.right == null) { // 2-1
				return null;
			} else if (currentNode.left == null) { // 2-2
				currentNode = currentNode.right;
			} else if (currentNode.right == null) { // 2-3
				currentNode = currentNode.left;
			} else { // 2-4 Node to delete has Child Nodes on each side
				int subTreeMin = minValue(currentNode.right);
				currentNode.value = subTreeMin;
				currentNode.right = deleteNode(currentNode.right, subTreeMin);
			}
		}
		return currentNode;
	}
	
	public void deleteNode(int value) {
		deleteNode(root, value);
	}
	
	
	
	// Tree Traversal
	// BFS (Breadth First Search)
	public ArrayList<Integer> BFS() {
		Node currentNode = root;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> results = new ArrayList<>();
		
		queue.add(currentNode);
		
		while (queue.size() > 0) {
			currentNode = queue.remove();
			results.add(currentNode.value);
			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}
		return results;
	}
	
	// DFS (Depth First Search)
	public ArrayList<Integer> DFSPreOrder() {
		ArrayList<Integer> results = new ArrayList<>();
		
		class Traverse { // Cannot declare method in the mothod
			public Traverse(Node currentNode) {
				results.add(currentNode.value);
				if (currentNode.left != null) {
					new Traverse(currentNode.left);
				}
				if (currentNode.right != null) {
					new Traverse(currentNode.right);
				}
			}
		}
		
		new Traverse(root); // Recursive
		return results;
	}
	
}
