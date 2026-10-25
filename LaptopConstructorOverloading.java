
               //Constructors with different parameters

package day3;

public class laptop {
	int price;
	int ram;
	String processor;
	float discount;
	laptop(){
		System.out.println("are u enter the any price or anything");
	}
	laptop(int price){
		System.out.println("Final laptop Price : "+price);
		
	}
	laptop(int price,String processor){
		if("i5"==processor){
			int final_price=price*20000;
			System.out.println("our laptop price : "+final_price);
		}else{
			int final_price=price*50000;
			System.out.println("our laptop price : "+final_price);
		}
		
	}
	laptop(int price,int ram,float dicount){
		int amount=(int)((price*6000)/(discount));
		System.out.println("our final amount : "+amount);
	}
	public static void main(String[]args){
		laptop lali=new laptop(152324646,"i7");
	}

}

