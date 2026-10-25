         //Override the dream() method

 
 //overriding
  class Son{
	  void dream(){
		  System.out.println("POLICE");
	  }
  }
  class Father extends Son{
	  void dream(){
		  System.out.println("Engineer");
	  }
	  
  }
  public class oops{
	  public static void main(String[]args){
		  Son obj=new Father();
		  obj.dream();
	  }
  }
