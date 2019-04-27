package com.Amazon.Easy;


/**
 * @author harsh.dusane
 * 
 *         The Algorithm that we are using here is Sieve of Eratosthenes
 *         
 *         Following is the algorithm to find all the prime numbers less than or
 *         equal to a given integer n by Eratosthenes’ method:
 * 
 *         Create a list of consecutive integers from 2 to n: (2, 3, 4, …, n).
 *         Initially, let p equal 2, the first prime number. Starting from p^2,
 *         count up in increments of p and mark each of these numbers greater
 *         than or equal to p2 itself in the list. These numbers will be p(p+1),
 *         p(p+2), p(p+3), etc.. Find the first number greater than p in the
 *         list that is not marked. If there was no such number, stop.
 *         Otherwise, let p now equal this number (which is the next prime), and
 *         repeat from step 3.
 *         
 *         Time Complexity is O(N*log(log(N)))
 * 
 * 
 * 
 *
 * 
 */

import java.util.*;
import java.io.*;
public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		List<Integer> primes = getAllPrimes(n);
		for(int i=0;i<primes.size();i++)
			System.out.print(primes.get(i)+" ");

	}

	public static List<Integer> getAllPrimes(int n){
		List<Integer> allPrimes  = new ArrayList<Integer>();
		boolean[] primes = new boolean[n+1];
		for(int i=0;i<n+1;i++)
			primes[i] = true;
		
		for(int p=2;p*p<=n;p++) {
			if(primes[p] == true ) {
				for(int i = p*p;i<=n;i+=p) {
					primes[i] = false;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(primes[i] == true)
				allPrimes.add(i);
		}
		
		return allPrimes;
	}
}
