                        //Find the largest of two numbers


public class Program2{
	public static int big(int x,int y){
		if(x>y){
			return x;
		}
		else{
			return y;
		}
	}
	public static void main(String[]args){
		System.out.println(big(1000,10));
	}
}
