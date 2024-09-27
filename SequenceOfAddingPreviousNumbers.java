'''
4)The rules for generating Collatz Sequence are:
If n is even:   n = n / 2
If n is odd:    n = 3n + 1
For example, if the starting number is 5 the sequence is:
5 -> 16 -> 8 -> 4 -> 2 -> 1
It has been proved for almost all integers, the repeated application of the above rule will result in a sequence that ends at 1.
Input format:
The input containing an integer 'n' which denotes the given number
Output format:
Print the numbers in the sequence and also print the number of times the rule has to be applied in order to reach 1.
Refer the sample output for formatting.
Sample Input:
5
Sample Output:
5
16
8
4
2
1
5
''''

ANSWER:
import java.util.*;
public class SequenceNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	
		int f=1;
		for(int i=a;i>=1;i--) {
			System.out.println(f);
			f=f*2;
				
	
		}
//System.out.println(s);
	}

}


Output:
5
1
2
4
8
16
