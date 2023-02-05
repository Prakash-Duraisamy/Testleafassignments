package week1.day2;

public class Car {
	
	public static void main(String[] args)
	{
		Car c= new Car();
		
		int Registerationnum=c.getRegisterationnum();
		System.out.println(Registerationnum);
			
		String ownerName = c.ownerName();
		System.out.println(ownerName);
		
		String carModel = c.carModel();
		System.out.println(carModel);
		
		boolean punctured = c.isPunctured();
		System.out.println(punctured);
		
		int subtractingTwonum = c.subtractingTwonum(10,5);
		System.out.println(subtractingTwonum);
	
		int multiplyTwonum = c.multiplyTwonum(8, 10, 9);
		System.out.println(multiplyTwonum);
		
		int divideTwonum = c.divideTwonum(10, 10);
		System.out.println(divideTwonum);
		
	}

	public int getRegisterationnum(){
		int registerationnum= 9955;
		return registerationnum;
	}
	private String ownerName(){
		return "Prakash";
	}
	String carModel(){
		return "Innova";
	}
	public boolean isPunctured() {
		return false;
	}
	public int subtractingTwonum(int num1,int num2) {
	return num1-num2;
	}
	public int multiplyTwonum(int num3, int num4, int num5) {
		return num3*num4*num5;
	}
	public int divideTwonum(int num6, int num7) {
		return num6/num7;

	}		

}

