import java.util.Scanner;
public class Pr1 {
	public static void main (String[] args)
	{
		System.out.println("Taking input from User");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num 1");
		int a = sc.nextInt();
		System.out.println("Enter num 2");
		int b = sc.nextInt();
		int Sum = a + b;
		int Sub = a - b;
		System.out.println(Sum);
		 System.out.println(Sub);
				
	}
}