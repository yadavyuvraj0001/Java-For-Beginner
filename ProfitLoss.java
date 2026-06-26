import java.util.Scanner;
public class  ProfitLoss {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the cost price ");
		int cp = sc.nextInt();
		System.out.println("Enter the sellig price ");
		int sp = sc.nextInt();
	if (sp>cp)
	{
		System.out.println("You made a profit");
	}
	else{
		System.out.println("You made a loss");
	}
}
}