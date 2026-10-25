   //Find the smallest element

public class arraypro{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int small=arr[0];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			
		}
		for(int i=1;i<arr.length;i++){
			if(arr[i]<small){
				small=arr[i];
			}
		}
		System.out.println(small);
	}
}
