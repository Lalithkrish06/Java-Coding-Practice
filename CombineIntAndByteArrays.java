             //Read two arrays and access their elements

public class arraypro{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		byte arr1[]=new byte[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("enter the first array values : ");
			arr[i]=sc.nextInt();
		}for(int i=0;i<arr.length;i++){
			System.out.println("enter the first array values : ");
			arr1[i]=sc.nextByte();
		}
		System.out.println(arr[0]+""+arr1[1]);
	}
}

