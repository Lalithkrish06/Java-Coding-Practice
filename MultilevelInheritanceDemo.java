     //GrandFather → Father → Son

//Mutilevel Inheritance 
class GrandFather{
	void land(){
		System.out.println("Land");
	}
}
 class Father extends GrandFather{
		void work(){
			System.out.println("work ");
		}
		int a=5;
		String name="LALITH";
	}
	class Son extends Father{
		void bike(){
			System.out.println("Bike");
		}
	}
	public class oops {
		public static void main(String[]args){
			Son obj=new Son();
			obj.work();
			System.out.println(obj.a);
			System.out.println(obj.name);
			obj.land();
			Father lan=new Father();
			lan.land();

		}

	}
