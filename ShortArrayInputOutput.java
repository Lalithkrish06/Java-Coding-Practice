
                          //Read and display a short array

public class arraypro{
	public static void main(String[]args){
		Scanner la=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		short n=la.nextShort();
		short  arr[]=new short[n];
		for(int i=0;i<arr.length;i++){
		 System.out.println("Enter the array values : ");
		 arr[i]=la.nextShort();	
	}
	for(int i=0;i<arr.length;i++){
	System.out.print("final array : "+arr[i]+"  ");
	
	}
	
	}
}
