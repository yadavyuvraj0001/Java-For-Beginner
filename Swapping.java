import java.util.Scanner;
public class Swapping{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number 1 for swapping");
		int swap1 = sc.nextInt();
		System.out.println("Enter the number 2 for swapping");
		int swap2 = sc.nextInt();
		int temp = swap1;
		swap1 = swap2;
		swap2 = temp;
		System.out.println("After Swapping:");
		System.out.println("First 1 number    " +swap1);
		System.out.println("Secound 2 number  " +swap2);
	}
}