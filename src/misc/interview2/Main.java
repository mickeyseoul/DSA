package misc.interview2;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		int[] array1 = {1, 3, 5};
		int[] array2 = {2, 4, 5};
		
		System.out.println(itemInCommon(array1, array2));
		
	}

	private static boolean itemInCommon(int[] array1, int[] array2) {
		
		// Array: O(n2)
		for (int i : array1) {
			for (int j : array2) {
				if (i == j) return true;
			}
		}
		return false;
		
		// HashMap: O(n)
//		HashMap<Integer, Boolean> myHashMap = new HashMap<>();
//		
//		for (int i : array1) {
//			myHashMap.put(i, true);
//		}
//		
//		for (int j : array2) {
//			if (myHashMap.get(j) != null) return true;
//		}
//		
//		return false;
		
	}

}
