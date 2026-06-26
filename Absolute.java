// Take integer input and print the absolute value of that integer
import java.util.Scanner;
public class  Absolute {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Absolute value ");
		int n = sc.nextInt();
		if(n<0){
			//n = n * (-1);
		}
		System.out.println("The absolute value is : "+n);
	}
}