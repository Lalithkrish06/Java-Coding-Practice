


                                    //Class, methods, salary calculations




package day3;

public class pro {
	String Name="LALITH";
	int id=4587;
	long phone=78889889 ;
	long day_salary=5000;
	long month_salary=150000;
	int one_day_parking_charge=150;
	int food_spend=600;
	int leave_days=5;
	int final_amount=(int)((month_salary)-(leave_days*day_salary));

	
	void final_case(){
		int present_date=(30)-(leave_days);
		int final_case=(final_amount)-(present_date*one_day_parking_charge);
		System.out.println("final amount for the  hand : "+final_case);
		
	}
	void month(int month_salary,int leave_days,int day_salary){
		int final_amount=(month_salary)-(leave_days*day_salary);
		System.out.println("final amount is : "+final_amount);
		absent_days();
	}
	void absent_days(){
		int absent=31-(leave_days);
		System.out.println("absent_days : "+absent);
	}
	
	
	public static void main(String[]args){
		pro hi=new pro();
		hi.month(150000, 5,5000);
		hi.final_case();
	}
	
}

