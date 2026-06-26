import java.util.Scanner;
public class Addition{
	public static void main (String[] agrs){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2");
		int num2 = sc.nextInt();
		int add = num1 + num2;
		System.out.println("The addition of two number is " +add);
	}
}