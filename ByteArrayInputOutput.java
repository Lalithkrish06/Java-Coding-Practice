

                    //Read and display a byte array

public class arraypro{
	public static void main(String[]args){
		Scanner la=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		byte n=la.nextByte();
		byte  arr[]=new byte[n];
		for(int i=0;i<arr.length;i++){
		 System.out.println("Enter the array values : ");
		 arr[i]=la.nextByte();	
	}
	for(int i=0;i<arr.length;i++){
	System.out.print("final array : "+arr[i]+"  ");
	
	}
		
	}
}
