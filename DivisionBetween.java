// 5) Write a program to list a number divisible by n between n1 and n2 


import java.util.Scanner;

public class DivisionBetween {
	public static void main(String args[]){
		// create object of input class
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the divider:");
		int n = input.nextInt();
		System.out.println("Enter the beginer no:");
		int n1 = input.nextInt();
		System.out.println("Enter the ending no:");
		int n2 = input.nextInt();
		int rem;
		System.out.println("List is given below:");
		for(int i = n1 ; i <= n2 ; i++ ) {
			rem = i % n;
			if(rem == 0) {	
			System.out.println(i);
			}
		}
		
	}
}