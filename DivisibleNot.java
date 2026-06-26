//W A P to input a number and tell if it is divsible by 5 but not divsible 3.
import java.util.Scanner;
public class DivisibleNot{
public static void main(String[] args){
Scanner sc = new Scanner(System.in); 
System.out.println("Enter number for Divisible");
int num = sc.nextInt();
if (num % 3 == 1 && num % 5 == 0){
	System.out.println("The number is divisibleby both");
}
else{
	System.out.println("The number is not divisible by both");
}
}
}