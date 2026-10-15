

                              //Check odd or even using the ternary operator and Scanner

import java.util.Scanner;
public class Program2{
	
	public static void ternary(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number bruhh : ");
		int a=sc.nextInt();
		String check=(a%2==0)?"its even ":"its odd";
		System.out.println(check);
	}
	public static void main(String[]args){
		ternary();
	}
}
