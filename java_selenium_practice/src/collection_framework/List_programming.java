package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_programming {

	public static void main(String[] args) {
		 
		int a[] = {1,2,3,4,5};  // homogenious data. , size is fixed. 
		
		// 1. heterogenous data can be stored. 
		// size is dynamic , increases size automatically. 
		
		// List - 
//		 1. size is dynamic
//		 2. stores any type of data ( heterogenous)
//		 3. store null values ( empty spaces)
//		 4. it allows duplicates
		
//		1. ArrayList
//		List a1 = new ArrayList();
////		ArrayList a1 = new ArrayList();
//		a1.add(10);
//		a1.add(10);
//		a1.add(null);
//		a1.add(2.3);
//		a1.add('a');
//		a1.add("Hello");
//		
//		System.out.println(a1);
		
		
		
		// Vector
//		List a1 = new Vector();
////   ArrayList a1 = new ArrayList();
//		a1.add(10);
//		a1.add(10);
//		a1.add(null);
//		a1.add(2.3);
//		a1.add('a');
//		a1.add("Hello");
//		
//		System.out.println(a1);
		
		List a1 = new LinkedList();
//		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(10);
		a1.add(null);
		a1.add(2.3);
		a1.add('a');
		a1.add("Hello");
		
		System.out.println(a1);
	}
}
