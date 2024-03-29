package Exercises;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListReversalInGroups {

	public static void main(String[] args) {
		System.out.println("This program is to reverse LinkedList in groups");
		System.out.println("***********************************************");
		System.out.println("Enter the size of LinkedList: ");
		Scanner sc1 = new Scanner(System.in);
		int size1 = sc1.nextInt();
		
		System.out.println();
		LinkedList<Integer> list1 = new LinkedList<>();
		System.out.println("Enter Linkedlist values: ");
		for(int i =0;i<size1;i++) {
			list1.add(sc1.nextInt());
		}
		System.out.println("The LinkedList is: " + list1);
		System.out.println();
		System.out.println("Enter the group size: ");
		int grpSize = sc1.nextInt();
		int initialGrpSize = grpSize;
		
		int iterations = size1/grpSize;
		int remainder = size1%grpSize;
		System.out.println(iterations);
		System.out.println(remainder);
		
		LinkedList<Integer> list2 = new LinkedList<>();
		if(iterations > 0) {
		for(int i = grpSize-1;i>=0;i--) {
			list2.add(list1.get(i));
		}}
		if (iterations > 1){
			while(iterations-1 != 0) {
				int doubleGrpSize = grpSize + initialGrpSize;
				for(int i = doubleGrpSize-1;i>=grpSize;i--) {
					list2.add(list1.get(i));
				}
				iterations = iterations - 1;
				grpSize = grpSize + initialGrpSize;
			}
		}
		
		if(remainder != 0) {
		for(int i = size1-1;i>size1-1-remainder;i--) {
			list2.add(list1.get(i));
		}}
		
		System.out.println("List after being reversed in groups: " + list2);
		
/*		int last = size1 - remainder;
		System.out.println(last);
		System.out.println("Reversal of last few elements which is not in groupsize: ");
		if (remainder != 0) {
			for (int i = size1-1;i>=last;i--) {
				System.out.print(list1.get(i) + " " );
			}
		}
		
		while (iterations > 0) {
			for(int i = grpSize-1;i>=0;i--) {
				list1.get(i);
			}
			iterations = iterations - 1;
		}
	
		System.out.println("List after being reversed in groups: " + list1);*/
	}

}
