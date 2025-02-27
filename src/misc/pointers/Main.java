package misc.pointers;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		//not working with the pointer
		int num1 = 11;
		int num2 = num1;
		
		num1 = 22;
		
		System.out.println("num1: " + num1); //22
		System.out.println("num2:" + num2); //11
		
		
		//working with the pointer
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		
		map1.put("value", 11);
		map2 = map1;
		
		map1.put("value", 22); //pointing the same HashMap
		
		System.out.println(map1); //{value=22}
		System.out.println(map2); //{value=22}
		
		
		/*
		 * The HashMap {value=22} now don't have anything pointing to it.
		 * You don't have any way to get into it.
		 * So, it is taking up spaces of memory 
		 * because you can't get to it. It's not now any of use. 
		 * So what java is going to do with items like this is
		 * it will periodically go through and clean them up with
		 * the process called Garbage Collection.
		 */

	}

}
