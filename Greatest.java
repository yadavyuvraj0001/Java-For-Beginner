// Take 3 Positive integer input and print the greatest of them 
import java.util.Scanner;
public class Greatest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in); 
System.out.println("Enter number for 1 Number");
int a = sc.nextInt();
System.out.println("Enter number for 2 Number");
int b = sc.nextInt();
System.out.println("Enter number for 3 Number");
int c = sc.nextInt();
if(a>b && a>c){
System.out.println(a+" is largest");
}
if(b>a && b>c){
System.out.println(b+" is largest");
}
if(c>a && c>a){
System.out.println(c+" is largest");
}
}
}