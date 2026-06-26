// If the ages of Ram,Shyam and Ajay are input through the keywords, write a program to determine the program the youngest of the three.
import java.util.Scanner;
public class Youngest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in); 
System.out.println("Enter number for Ram");
int Ram = sc.nextInt();
System.out.println("Enter number for Shyam");
int Shyam = sc.nextInt();
System.out.println("Enter number for Ajay");
int Ajay = sc.nextInt();
if(Ram < Shyam && Ram < Ajay){
System.out.println(" Ram is Youngest "  +Ram);
}
if(Shyam < Ram && Shyam < Ajay){
System.out.println(" Shyam is Youngest"  +Shyam);
}
if(Ajay < Ram && Ajay < Shyam){
System.out.println("Ajay is Youngest"   +Ajay);
}
}
}