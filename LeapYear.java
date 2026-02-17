// Any year is input through the keyboard.Write a program to determine whether the year is aleap year or not.(considering leap year occurs after every 4 year)
import java.util.Scanner;
public class LeapYear{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int Y = sc.nextInt();
		System.out.println(Y);
		if (Y%4 == 0){
			System.out.println("Leap Year");
		}
		else {
			System.out.println("It is not Leap Year");
		}
	
	}
}