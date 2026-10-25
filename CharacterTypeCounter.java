 //Count uppercase, lowercase, digits, and special characters


 public class arraypro{
	 public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of the Array");
		 int n=sc.nextInt();
		 char arr[]=new char[n];
		 int upper=0;
		 int lower=0;
		 int digit=0;
		 int spl=0;
		 for(int i=0;i<arr.length;i++){
			 System.out.println("enter the char");
			 arr[i]=sc.next().charAt(0);
		 }
		 for(int i=0;i<arr.length;i++){
			 char c='a';
			 char d='z';
			 char v='Z';
			 char b='A';
			 int num=arr[0];
			 if(num<=d&&num>=c){
				 upper++;
			 }
			 else if(num<=v&&num>=b){
				 lower++;
			 }
			 else if(num>=1){
				 digit++;
			 }else{
				 spl++;
			 }
		 }
		 System.out.println(upper +" "+lower+" "+digit+" "+spl);
	 }
 }
