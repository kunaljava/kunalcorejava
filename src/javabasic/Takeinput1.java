package javabasic;
import java.util.Scanner;

public class Takeinput1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no:=");
		int a1=sc.nextInt();
		System.out.println("Enter second no:=");
		int a2 =sc.nextInt();
		int sum=a1+a2;
		System.out.println("Total no of hte sum is:="+sum);
	}

}
