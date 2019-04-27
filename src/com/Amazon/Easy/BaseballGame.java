package com.Amazon.Easy;

import java.util.*;
import java.io.*;
public class BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ops = {"5","2","C","D","+"};
		System.out.println("The score is:"+getScore(ops));
		String[] opsStr = {"5","-2","4","C","D","9","+","+"};
		System.out.println("The score is:"+getScore(opsStr));
		

	}
	
	public static int getScore(String[] ops) {
		Stack<Integer> stack = new Stack<Integer>();
		for(String op:ops) {
			if(op.equals("+")) {
				int top = stack.pop();
				int newTop = top+stack.peek();
				stack.push(top);
				stack.push(newTop);
				
			}
			else if(op.equals("C")) {
				stack.pop();
				
			}
			else if(op.equals("D")) {
				stack.push(2*stack.peek());
			}
			else {
				stack.push(Integer.valueOf(op));
			}
		}
		int score = 0;
		for(int n:stack)
			score+=n;
		
		return score;
	}

}
