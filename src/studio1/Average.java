package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("What's the first integer?");
		int n1 = in.nextInt();
		System.out.println("What's the second integer?");
		int n2 = in.nextInt();
		
		double average = (n1 + n2)/2.0; 
		System.out.println ("The average is " + average);
	}
	

}
