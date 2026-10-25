            //One Father class with two child classes

 //Hierachical 
 
 class Father{
	 void land(){
		 System.out.println("Land");
	 }
	 int a=10;
 }
 class Son1 extends Father{
	 void play(){
		 System.out.println("Playing");
	 }
 }
 class Son2 extends Father{
	 void college(){
		 System.out.println("College");
	 }
	 
 }
 class oops{
	 public static void main(String[]args)
	 {
		 Son1 obj=new Son1();
		 obj.land();
		 obj.play();
		 obj.a=26;
		 Son2 obj2=new Son2();
		 System.out.println(obj.a);
		 System.out.println(obj2.a);
	 }
 }
