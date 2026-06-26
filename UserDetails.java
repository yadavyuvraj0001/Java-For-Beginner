import java.util.Scanner;
public class UserDetails{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter User Name");
String name = sc.nextLine();
System.out.println("Enter User Age");
int age = sc.nextInt();
System.out.println("Name is "+name);
System.out.println("Age is "+age);
}
}