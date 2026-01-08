 import java.util.Scanner;
 public class Student{
	 public static void main (String[] args){
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Subject 1");
		int s1 = sc.nextInt();
		System.out.println("Subject 2");
		int s2 = sc.nextInt();
		System.out.println("Subject 3");
		int s3 = sc.nextInt();
		System.out.println("Subject 4");
		int s4 = sc.nextInt();
		System.out.println("Subject 5");
		int s5 = sc.nextInt();
		float per = ((s1+s2+s3+s4+s5)/500.0f)*100;
		System.out.println(per);
				}
}
		
		
		
		
