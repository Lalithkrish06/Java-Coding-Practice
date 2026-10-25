        //Implement two interfaces in one class

//Interface only inside the abstract class Not use the normal class .

interface lali{
	public abstract void access();
}

public class abst implements lali {
	public void access(){
		System.out.println("Hiii Bruhhh ");
	}
	public static void main(String[]args){
		abst la=new abst();
		la.access();
	}
}
