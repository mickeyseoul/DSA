package algorithms.sorts.bubblesort;

import java.util.Arrays;

public class Selectionsort {
	
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i+1; j < array.length; j++) { // j = i+1
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] myArray = {4,2,6,5,1,3};
		
		selectionSort(myArray);
		
		System.out.println(Arrays.toString(myArray));

	}

}
