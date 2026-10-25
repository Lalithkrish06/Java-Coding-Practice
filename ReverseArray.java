      //Display elements in reverse order

public class arraypro{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("enter the value for array : ");
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]+"  ");
		}
	}
}
