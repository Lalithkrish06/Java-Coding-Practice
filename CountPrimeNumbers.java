
          //Count prime numbers in an array


public class arraypro{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sixe of the Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int prime=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the Array Values : ");
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			if(num>1){
				int j=2;
				while(j*j<=num&&num%j!=0){
					j++;
				}
				if(j*j>num){
					count++;
				}
			}
			
		}
		System.out.println(count);
	}
}

