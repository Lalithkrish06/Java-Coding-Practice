   //Find the largest element


public class arraypro{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int large=arr[0];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		for(int i=1;i<arr.length;i++){
			if(arr[i]>large){
				large=arr[i];
			}
		}
		System.out.println(large);
	}
}
