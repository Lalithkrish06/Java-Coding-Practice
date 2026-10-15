

                       //Check voting eligibility using age and Scanner

import java.util.Scanner;
public class Program2{
	public static void vote(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter our age");
		int age=sc.nextInt();
		if(age>=18){
			System.out.println("Are u Eligible for vote ....Enjoy");
		}
		else{
			System.out.println("Are U Not Eligible For vote......Try next time ");
		}
		
	}
	public  static void main(String[]args){
		vote();
	}
}
