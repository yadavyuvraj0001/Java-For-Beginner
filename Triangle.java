// Take 3 number input and tell if they can be sides of a triangele.
import java.util.Scanner;
public class Triangle{
public static void main(String[] args){
Scanner sc = new Scanner(System.in); 
System.out.println("Enter number for 1 Number");
int a = sc.nextInt();
System.out.println("Enter number for 2 Number");
int b = sc.nextInt();
System.out.println("Enter number for 3 Number");
int c = sc.nextInt();
if (a+b > c && b+c >a && c+a > b){
	System.out.println("It is a perfect triangle");
} 
else {
	System.out.println("It is not trinagle");
}
}
}