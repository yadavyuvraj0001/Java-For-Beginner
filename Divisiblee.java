 // Take positive integer input and tell if it is divisible by 5 or 3 nut not divisible by 15.
 import java.util.Scanner;
 public class Divisiblee{
 public static void main (String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number for divisible");
 int num = sc.nextInt();
 if(num%3==0 || num%5==0)
    {
	
	if(num%15 !=0)
	{
		 System.out.println("The number is divisible by 3 and 5 but not by 15 ");
	}
	else
	{
		 System.out.println("Not divisible");
	}
    }
    else
	{
	 System.out.println("Not Divisible");
	}
 
 }
 }