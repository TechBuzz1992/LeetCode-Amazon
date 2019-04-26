package com.Amazon.Easy;

import java.util.*;
//import java.io.*;

class CountIndex {
	int index;
	int count;

	CountIndex(int index) {
		this.index = index;
		this.count = 1;
	}

	public void incCount() {
		this.count++;
	}
}

public class UniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "leetcode";
		System.out.println(getUniqueCharacterIndex(str));
	}

	public static int getUniqueCharacterIndex(String str) {
		HashMap<Character, CountIndex> map = new HashMap<Character, CountIndex>();
		for (int i = 0; i < str.length(); i++) {
			if (map != null && map.containsKey(str.charAt(i))) {
				map.get(str.charAt(i)).incCount();
			} else {
				map.put(str.charAt(i), new CountIndex(i));
			}
		}

		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)).count == 1)
				return map.get(str.charAt(i)).index;
		}

		return -1;
	}

}
