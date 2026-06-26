// Take positive integer input and tell if it is a three digit number or not.
// here we use And && operator and Or ||
import java.util.Scanner;
 public class ThreeDigit{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the digit");
	int n = sc.nextInt();
	if (n>99 && n<1000) {
		System.out.println("Its is Three digit number");	
	}
	else{
		System.out.println("Its is not a three digit number");
	}
	}
 }c
		
		