package com.Amazon.Easy;

import java.util.*;
import java.io.*;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// test-case 1
		String str = "anagram";
		String str1 = "nagaram";
		System.out.println(isValidAnagram(str, str1));

		// test-case 2
		str = "cat";
		str1 = "car";

		System.out.println(isValidAnagram(str, str1));

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

}
