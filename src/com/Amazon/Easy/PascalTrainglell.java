package com.Amazon.Easy;

/**
 * 
 * 
 * @author harsh.dusane
 * 
 *         Method:1( O(n^3) time complexity ) Number of entries in every line is
 *         equal to line number. For example, the first line has “1”, the second
 *         line has “1 1”, the third line has “1 2 1”,.. and so on. Every entry
 *         in a line is value of a Binomial Coefficient. The value of ith entry
 *         in line number line is C(line, i). The value can be calculated using
 *         following formula.
 * 
 *         C(line, i) = line! / ( (line-i)! * i! ) A simple method is to run two
 *         loops and calculate the value of Binomial Coefficient in inner loop.
 * 
 *         Method:2 ( O(n^2) time and O(1) extra space ) This method is based on
 *         method 1. We know that ith entry in a line number line is Binomial
 *         Coefficient C(line, i) and all lines start with value 1. The idea is
 *         to calculate C(line, i) using C(line, i-1). It can be calculated in
 *         O(1) time using the following.
 * 
 *         C(line, i) = line! / ( (line-i)! * i! ) C(line, i-1) = line! / (
 *         (line - i + 1)! * (i-1)! ) We can derive following expression from
 *         above two expressions. C(line, i) = C(line, i-1) * (line - i + 1) / i
 * 
 *         So C(line, i) can be calculated from C(line, i-1) in O(1) time
 *
 */
public class PascalTrainglell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		System.out.println("The pascal triangle is:");
		printTraingle(n);
		System.out.println("The Nth line is:");
		printNthTraingleLine(2);
	}
	
	public static void printTraingle(int n) {
		for(int line = 1;line<=n;line++) {
			int C = 1;
			for(int i=1;i<=line;i++) {
				System.out.print(C+" ");
				C = C*(line-i)/i;
			}
			System.out.println();
		}
	}
	
	public static void printNthTraingleLine(int n) {
		for(int line = n;line<=n;line++) {
			int C = 1;
			for(int i=1;i<=line;i++) {
				System.out.print(C+" ");
				C = C*(line-i)/i;
			}
			System.out.println();
		}
	}

}
