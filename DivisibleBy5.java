import java.util.Scanner;
public class DivisibleBy5{
public static void main (String args[]){
 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(n);
		if(n%5==0){
			System.out.println("The number is divisible by 5");
		}
		else{
			System.out.println("The number is not divisible by 5");
		}
}
}
			
