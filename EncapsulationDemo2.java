            //Private fields, getter and setter methods

class detail{
	private int age=19;
	public int getages(){
		return this.age;
	}
	public void setages(int a){
		this.age=a;
	}
 }
 public class oops{
	 public static void main(String[]args){
		 detail obj=new detail();
		System.out.println(obj.getages());
		 obj.setages(35);
		System.out.println(obj.getages());
	 }
 }

