
               //Read and display a double array

public class arraypro{
	public static void main(String[]args){
		Scanner la=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=la.nextInt();
		double arr[]=new double[n];
		for(int i=0;i<arr.length;i++){
		 System.out.println("Enter the array values : ");
		 arr[i]=la.nextDouble();	
	}
	for(int i=0;i<arr.length;i++){
	System.out.print("final array : "+arr[i]+"  ");
	
	}
