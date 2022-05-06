package com.gl.satya4satyanm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Skyscraper {
	
	static void solveBuildingUnits(Queue<Integer> s) {
		int max = s.size();
		int size = s.size();
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<size; i++) {
			if(s.peek() != null && s.peek()==max) {
				while(s.peek() != null && s.peek()==max) {
					stack.push(s.remove());
				}
				
				System.out.println("Day: " + (i + 1));
				int stackSize = stack.size();
				for(int p=0; p<stackSize; p++) {
					if(stack.peek() == max) {
						System.out.print(stack.pop() + " ");
						max--;
					}
				}
				System.out.println();
			} else {
				System.out.println("Day: " + (i + 1));
				System.out.println();
				stack.push(s.remove());
			}
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> mainQ = new LinkedList<>();
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int total = s.nextInt();
		
		int i=0;
		while(i<total) {
			System.out.println("enter the floor size given on day :" + (i + 1));
			mainQ.add(s.nextInt());
			i++;
		}
		
		solveBuildingUnits(mainQ);
	}

}
