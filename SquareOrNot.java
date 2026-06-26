// Length,Breadth
import java.util.Scanner;
public class  SquareOrNot {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Length");
		int Length = sc.nextInt();
		System.out.println("Enter the Breadth");
		int Breadth = sc.nextInt();
		if(Length == Breadth){
			System.out.println(" It is  a square");
		}else {
			System.out.println("It is not a square");
		}
	}
}
