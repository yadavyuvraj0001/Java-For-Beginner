// Take positive integer input and tell if it is divisible by 3 or 5
import java.util.Scanner;
public class Or{
public static void main(String[] args){
Scanner sc = new Scanner(System.in); 
System.out.println("Enter number for Divisible");
int num = sc.nextInt();
if (num % 3 == 0 || num % 5 == 0){
	System.out.println("The number is divisibleby both");
}
else{
	System.out.println("The number is not divisible by both");
}
}
}