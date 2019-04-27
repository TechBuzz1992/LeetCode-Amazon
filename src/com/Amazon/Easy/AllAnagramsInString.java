package com.Amazon.Easy;

import java.util.*;
import java.io.*;

public class AllAnagramsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "cbaebabacd";
		String part = "abc";
		List<Integer> indexes = getAllAnagramIndexes(str, part);
		if (indexes.size() > 0) {
			for (int i = 0; i < indexes.size(); i++)
				System.out.print(indexes.get(i) + " ");
		} else {
			System.out.println("No valid indexes in the string");
		}

	}

	public static boolean isValidAnagram(String str, String str1) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++)
			set.add(str.charAt(i));

		for (int i = 0; i < str1.length(); i++) {
			if (!set.contains(str1.charAt(i)))
				return false;
		}
		return true;
	}

	public static List<Integer> getAllAnagramIndexes(String str, String part) {
		int len = part.length();
		List<Integer> indexes = new ArrayList<Integer>();

		for (int i = 0; i < str.length() - len + 1; i++) {
			if (isValidAnagram(str.substring(i, i + len), part))
				indexes.add(i);
		}

		return indexes;
	}

}
