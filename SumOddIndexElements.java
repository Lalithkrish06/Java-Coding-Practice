                   //Sum elements at odd indexes

public class arraypro{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(i%2!=0){
				sum=sum+arr[i];
			}
		}

		System.out.println(sum);
		
	}
}
