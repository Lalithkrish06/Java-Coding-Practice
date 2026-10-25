
                          //Read and display a long array


public class arraypro{
	public static void main(String[]args){
		Scanner la=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		long n=la.nextLong();
		long arr[]=new long[(int)n];
		for(int i=0;i<arr.length;i++){
		 System.out.println("Enter the array values : ");
		 arr[i]=la.nextLong();	
	}
	for(int i=0;i<arr.length;i++){
	System.out.print("final array : "+arr[i]+"  ");
	
	}
	}
}
