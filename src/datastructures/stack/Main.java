package datastructures.stack;

public class Main {

	public static void main(String[] args) {
		
//		Stack myStack = new Stack(4);
//		
//		myStack.getTop();
//		myStack.getHeight();
//		
//		myStack.printStack();
		
//		//push()
//		Stack myStack = new Stack(1);
//		myStack.push(2);
//		
//		myStack.printStack();
		
		//pop()
		Stack myStack = new Stack(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		
		myStack.pop();

		myStack.printStack();
	}

}
