          //Replace the element at index 3 with 15

//Mutliple Interface ...One class access the two interface or more
interface lalith{
	public abstract void noaccess();
}
interface lali{
	public abstract void access();
}

public class abst implements lali,lalith {
	public void access(){
		System.out.println("Hiii Bruhhh ");
	}
	public void noaccess(){
		System.out.println("Hiiiiiiiiii");
	}
	public static void main(String[]args){
		abst la=new abst();
		la.access();
		la.noaccess();
	}
}
