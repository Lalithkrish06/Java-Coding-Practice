         //Optional improved frequency-counting version

//Array concept frequenct count
import java.util.Scanner;
public class abst{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Array Size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the values");
			arr[i]=sc.nextInt();
		}
		boolean vis[]=new boolean[n];
		for(int i=0;i<arr.length;i++){
			if(vis[i]){
				continue;
			}
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			System.out.println(arr[i]+" "+count);
		}
	}
}

