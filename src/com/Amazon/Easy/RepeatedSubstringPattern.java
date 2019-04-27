package com.Amazon.Easy;

/**
 * If the given is in s+s[1:-1] then it can return true else return false;
 * for example : str  = "abab"
 * s+s  = "abababab"
 * s+s[1:-1] = "bababa"
 * so str is present in the same
 * hence it can return true
 * 
 * 
 */
import java.util.*;
import java.io.*;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abab";
		System.out.println(isRepeatedSubstringPattern(str));
		String str1 = "aba";
		System.out.println(isRepeatedSubstringPattern(str1));

	}

	public static boolean isRepeatedSubstringPattern(String str) {
		String newStr = str + str;
		newStr = newStr.substring(1, newStr.length() - 1);
		if (newStr.contains(str))
			return true;
		else
			return false;

	}

}
