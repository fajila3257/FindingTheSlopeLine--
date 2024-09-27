'''
5)Write a program to check whether the given number is a trendy number or not. A number is said to be a trendy number if and only if it has 3 digits and the middle digit is divisible by 3.
Input format:
The input containing an integer 'n' which denotes the given number
Output format:
If the given number is a trendy number, then print "Trendy Number". Otherwise, print "Not a Trendy Number".
Refer the sample output for formatting.
Sample Input:
791
Sample Output:
Trendy Number
'''

Answer:

import java.util.*;
public class TrendyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=String.valueOf(a).length();
		a=(a/10)%10;
		
		if(b==3 && a%3==0) {
			System.out.println("trendy Number");
		}
		else {
			System.out.println("Non Trendy Number");
		}
		
		
		
		
		Output:
791
trendy Number
