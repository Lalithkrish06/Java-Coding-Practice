       //Keep only letters and digits from a string

 import java.util.Scanner;
 public class oops{
	 public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the values : ");
		 String en=sc.next();
		 for(int i=0;i<en.length();i++){
			 char e=en.charAt(i);
			 if(e>='0'&&e<='9'||e>='a'&&e<='z'||e>='A'&&e<='Z'){
				 System.out.print(e);
			 }
		 }
	 }
 }
