package week1.assignment;

public class IsPrime {

	public static void main(String[] args) {

		IsPrime p=new IsPrime();
		p.isPrime(110);

	}		

	public void isPrime(int n){
		int j= n-1;
		boolean prime=true;
		for(int i=2;i<=j;i++)
		{
			if(n%i==0)
			{	
				prime=false;
			}
		}
		if(prime==true) 
		{
			System.out.println("Prime number");
		}
		else 
		{
			System.out.println("Not a Prime number");
		}

	}}









