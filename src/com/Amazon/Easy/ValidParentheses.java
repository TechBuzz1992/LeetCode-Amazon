package com.Amazon.Easy;

import java.util.*;
import java.io.*;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(")]:"+isValidString(")]"));

	}

	public static boolean isValidString(String str) {
		if (str == null || str.isEmpty())
			return true;

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

		char[] charArr = str.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(charArr[i])) {
				stack.push(charArr[i]);
			} else if (!stack.isEmpty() && map.containsValue(charArr[i])) {
				char c = stack.peek();
				if (map.get(c)!=null && map.get(c).equals(charArr[i]))
					stack.pop();
				else
					stack.push(charArr[i]);

			}
			else
				stack.push(charArr[i]);
		}

		if (stack != null && stack.empty())
			return true;
		return false;

	}

}
