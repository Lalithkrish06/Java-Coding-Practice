
               //Read and display a character array

public class arraypro{
	public static void main(String[]args){
		Scanner la=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=la.nextInt();
		char arr[]=new char[n];
		for(int i=0;i<arr.length;i++){
		 System.out.println("Enter the array values : ");
		 arr[i]=la.next().charAt(0);	
	}
	for(int i=0;i<arr.length;i++){
	System.out.print("final array : "+arr[i]+"  ");
	
	}
