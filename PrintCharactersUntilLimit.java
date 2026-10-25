            //Print characters starting from an entered character



package day6;

//Abstract class And Then Methods Programs 
abstract class StudentDetails{
	public abstract void email_password();
	public void name(){
		System.out.println("LALITH ");
	}
	public void rollno(){
		System.out.println("059 ");
	}
	public void clg(){
		System.out.println("VCET ");
	}
	public void department(){
		System.out.println("AI&DS ");
	}
}

public class abst extends StudentDetails {
	public void email_password(){
		System.out.println("Nooooooooooo");
	}
	public static void main(String[] args) {
	  abst la=new abst();
	  la.email_password();
	  la.rollno();
	  la.clg();
	  la.department();

	}

}

