'''
6)
Ask a user for their birth year encoded as two digits (like "62") and for the current year, also encoded as two digits (like "99"). Write a program to find the users current age in years.
Input format:
Input consists of 2 integers
The first integer corresponds to the last 2 digits of the birth year
The second integer corresponds to the last 2 digits of the current year
Output format:
Print the user's current age
Refer below sample output for formatting.
Sample Input:
62
00
Sample Output:
38
'''

Answer:

import java.util.*;
public class AgeFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=124-a;
		int d=Math.abs(c);
		if(a<=24) {
			int s=d%100;
			
			System.out.println(s);
		}
		else {
			System.out.println(d);
		}
	}

}


Output:
26
98
