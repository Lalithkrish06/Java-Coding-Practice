               //Print elements greater than 25

public class arraypro{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int large=25;
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the values of array : ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>large){
				System.out.println(arr[i]);
			}
		}
		
	}
}
