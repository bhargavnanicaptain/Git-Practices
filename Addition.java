import java.util.*;
public class Addition{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first number");
int num1 = sc.nextInt();
System.out.println("  ");
System.out.println("Enter your last number");
int num2  = sc.nextInt();
System.out.println("  ");
System.out.println("The result is: ");
int res = num1+num2;
System.out.println("  ");
System.out.println("Result: "+res);
}
}