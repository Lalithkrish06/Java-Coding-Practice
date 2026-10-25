

              //Count even and odd elements


public class arraypro{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int even_count=0;
		int odd_count=0;
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the Values for the array : ");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even_count ++;
			}
			else{
				odd_count ++;
			}
		}
		System.out.println(even_count + " "+odd_count);
	}
}
