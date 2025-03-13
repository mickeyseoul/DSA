package datastructures.hashtable;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
//		HashTable myHashTable = new HashTable();
//		myHashTable.printTable();
		
		// set()
//		HashTable myHashTable = new HashTable();
//		
//		myHashTable.set("nails", 100);
//		myHashTable.set("tile", 50);
//		myHashTable.set("lumber", 80);
//		
//		myHashTable.set("bolts", 200);
//		myHashTable.set("screws", 140);
//		
//		myHashTable.printTable();
		
		// get()
//		HashTable myHashTable = new HashTable();
//		
//		myHashTable.set("nails", 100);
//		myHashTable.set("tile", 50);
//		myHashTable.set("lumber", 80);
//		
//		System.out.println(myHashTable.get("lumber"));
//		System.out.println(myHashTable.get("bolts"));
		
		// keys()
//		HashTable myHashTable = new HashTable();
//		
//		myHashTable.set("nails", 100);
//		myHashTable.set("tile", 50);
//		myHashTable.set("lumber", 80);
//		
//		myHashTable.set("bolts", 200);
//		myHashTable.set("screws", 140);
//		
//		System.out.println(myHashTable.keys());
		
		
		
		// Sets
		
		// Import required classes
		
		// Create a set using HashSet
		Set<Integer> mySet = new HashSet<>();
		
		// Add element to the set
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(5);
		mySet.add(6);
		
		// If the number 6 is already in the set, it will not be added again.
		mySet.add(6);
		
		for (int i : mySet) {
			System.out.println("mySet " + i);
		}
		System.out.println("-----");
		
		// Removing an element from a set
		mySet.remove(6);
		
		// Union of two sets
		Set<Integer> otherSet = new HashSet<>();
		otherSet.add(3);
		otherSet.add(4);
		otherSet.add(5);
		otherSet.add(6);
		
		for (int i : otherSet) {
			System.out.println("otherSet " + i);
		}
		System.out.println("-----");
		
		Set<Integer> unionSet = new HashSet<>(mySet);
		unionSet.addAll(otherSet);
		
		for (int i : unionSet) {
			System.out.println("unionSet " + i);
		}
		System.out.println("-----");
		
		// Intersection of two sets
		Set<Integer> intersectionSet = new HashSet<>(mySet);
		intersectionSet.retainAll(otherSet);
		
		for (int i : intersectionSet) {
			System.out.println("intersectionSet " + i);
		}
		System.out.println("-----");
		
		// Difference between two sets
		Set<Integer> differenceSet = new HashSet<>(mySet);
		differenceSet.removeAll(otherSet);
		
		for (int i : differenceSet) {
			System.out.println("differenceSet " + i);
		}
		System.out.println("-----");
		
		// Checking if an element is in a set
		if (mySet.contains("hello")) {
		    System.out.println("Found hello in mySet");
		}
		

	}

}