           //Implement a single interface

//ZOHO Question
         
import java.util.Scanner;
class abst{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the letter");
		char n=sc.next().charAt(0);
		while(n<='z'||n<='Z'){
			System.out.print(n +" ");
			n++;
		}
	}
}
