
                  //Constructor overloading and this keyword

package day3;

public class student {
	String name="LALI";
	int reg=76;
	String clg_name="VCET";
	float cgpa=8.0f;
	String hostel="YES";
	String  blood_group="b+";
	int fees=100000;
	int hos_fees=75000;
	//String conf="YES";
	void fees_overall(){
		int overall=((fees )+(hos_fees));
		System.out.println(overall);
		company();		
	}
	void company(){
		if(cgpa>=8.0){
			System.out.println("Are U Eligible for the company");
		}
		else{
			System.out.println("Not Eligible for the Company");
		}
		blood();
	}
	void blood(){
		String predict=((blood_group.equals("b+"))? "Success":"not donate");
		System.out.println(predict);
	}
	static{
		System.out.println(" Welcome TO Broo");
	}
	
	public static void main(String[]args){
		student lali=new student();
		lali.fees_overall();
		
	}

}





package day3;

public class bank {
	int a;
	String b;
	int c;
	bank(){
		
	}
	bank(int bank_branch_number,String bank_name){
		a=bank_branch_number;
		b=bank_name;
	}
	bank(int bank_branch_number,String bank_name,float salary){
		a=bank_branch_number;
		b=bank_name;
		c=(int)salary;

	}
	bank(int a){
		this.a=a;
	}
	public static void main(String[]args){
		  bank lali=new bank(78,"LALI BANK");
		  bank lal=new bank(23);
		  System.out.println(lali.a + " "+lali.b+ " "+lali.c+" "+lal.a);
		
	}

}
