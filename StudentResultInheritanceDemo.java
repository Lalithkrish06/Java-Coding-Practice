                //Student, Mark, and Result classes

 class Student{
	 void Subject(){
		 System.out.print("DBMS ");
		 
	 }
 }
 class Mark extends Student{
	 void mark(){
		 System.out.print("98 ");
	 }
	 
 }
 class Result extends Student{
	 void student(){
		 System.out.println("LALI ");
		 Mark la=new Mark();
		 la.Subject();
		 la.mark();
	 }
 }
 public class oops{
	 public static void main(String[]args){
		 Result li=new Result();
		 li.student();
	 }
 }
 
