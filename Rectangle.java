// Given the length and breadth of a rectangle, write a peogram to find whether 
//the area of the rectangle is greater than its perimeter.
import java.util.Scanner;
public class Rectangle{
public  static void main (String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the  length :"); 
int length = sc.nextInt();
System.out.println("Enter the breadth :");
int breadth = sc.nextInt();
int area = length*breadth;
int perimeter = 2 + (length*breadth);
if(area>perimeter){
	System.out.println("Area is greater than perimeter");
	
}
else{
	System.out.println("Perimter is greater than Area");
}
}
}
	
