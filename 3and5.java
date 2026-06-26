// Take positive integer input and tell if it is divisible by 5 or 3
import java.util.Scanner;
public class 3and5{
public static void main(string[] args){
Scanner sc = new Scanner(system.in); 
System.out.println("Enter number for Divisible");
int num = sc.nextInt();
if (num%3 == 0 && num%5 == 0){
	System.out.println("The number is divisibleby both");
}
else{
	System.out.println("The number is not divisible by both");
}
}
}
