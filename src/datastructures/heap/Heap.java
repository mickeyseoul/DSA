package datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
	private List<Integer> heap;
	
	public Heap() {
		this.heap = new ArrayList<>();
	}
	
	// helper mothods
	public List<Integer> getHeap() {
		return new ArrayList<>(heap);
	}
	
	private int leftChild(int index) {
		return 2 * index + 1;
	}
	
	private int rightChild(int index) {
		return 2 * index + 2;
	}
	
	private int parent(int index) {
		return (index - 1) / 2;
	}
	
	public void swap(int index1, int index2) {
		int temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}
	
	// insert()
	public void insert(int value) {
		heap.add(value); // 1. add at last
		int current = heap.size() - 1;
		
		while (current > 0 && heap.get(current) > heap.get(parent(current))) {
			swap(current, parent(current)); // 2. Bubble Sort up
			current = parent(current);
		}
	}
	
	// remove()
	public Integer remove() {
		if (heap.size() == 0) {
			return null;
		}
		
		if (heap.size() == 1) {
			return heap.remove(0);
		}
		
		int maxValue = heap.get(0);
		heap.set(0, heap.remove(heap.size() - 1)); // 1. remove the first node (fill the first node with the last node)
		sinkDown(0); // 2. sink down
		
		return maxValue;
	}

	private void sinkDown(int index) {
		int maxIndex = index;
		while (true) {
			int leftIndex = leftChild(index);
			int rightIndex = rightChild(index);
			
			if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
				maxIndex = leftIndex;
			}
			
			if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
				maxIndex = rightIndex;
			}
			
			if (maxIndex != index) {
				swap(index, maxIndex);
				index = maxIndex;
			} else {
				return;
			}
		}
		
	}
	
}
