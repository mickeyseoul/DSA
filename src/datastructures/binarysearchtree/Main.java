package datastructures.binarysearchtree;

public class Main {

	public static void main(String[] args) {
		
		BinarySearchTree myBST = new BinarySearchTree();
		
		System.out.println("root = " + myBST.root);
		
		
		// insert()
		myBST.insert(47);
		myBST.insert(21);
		myBST.insert(76);
		myBST.insert(18);
		myBST.insert(52);
		myBST.insert(82);
		
		myBST.insert(27);
//		
//		System.out.println(myBST.root.left.right.value);
		
		// contains()
//		System.out.println(myBST.contains(27));
//		System.out.println(myBST.contains(17));
		
		// rContains()
//		System.out.println(myBST.rContains(27));
//		System.out.println(myBST.rContains(17));
		
		// rInsert()
//		myBST.rInsert(2);
//		myBST.rInsert(1);
//		myBST.rInsert(3);
//		
//		System.out.println("Root: " + myBST.root.value);
//		System.out.println("Root->Left: " + myBST.root.left.value);
//		System.out.println("Root->Right: " + myBST.root.right.value);
		
		// minValue()
//		myBST.insert(47);
//		myBST.insert(21);
//		myBST.insert(76);
//		myBST.insert(18);
//		myBST.insert(52);
//		myBST.insert(82);
//		
//		System.out.println(myBST.minValue(myBST.root)); // 18
//		System.out.println(myBST.minValue(myBST.root.right)); // 52
		
		// deleteNode()
//		myBST.insert(2);
//		myBST.insert(1);
//		myBST.insert(3);
//		
//		/*
//		 *    2 
//		 *   / \
//		 *  1   3
//		 */
//		
//		System.out.println("Root: " + myBST.root.value);
//		System.out.println("Root->Left: " + myBST.root.left.value);
//		System.out.println("Root->Right: " + myBST.root.right.value);
//		
//		myBST.deleteNode(2);
//		
//		/*
//		 *    3 
//		 *   / \
//		 *  1  null
//		 */
//		System.out.println("Root: " + myBST.root.value);
//		System.out.println("Root->Left: " + myBST.root.left.value);
//		System.out.println("Root->Right: " + myBST.root.right.value);
		
		
		
		
		// Tree Traversal
		System.out.println(myBST.BFS()); //[47, 21, 76, 18, 27, 52, 82]
		
		System.out.println(myBST.DFSPreOrder()); // [47, 21, 18, 27, 76, 52, 82]
		
		
		System.out.println(myBST.DFSPostOrder()); //[18, 27, 21, 52, 82, 76, 47]
		
	}

}
