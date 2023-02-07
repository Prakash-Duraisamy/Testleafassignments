package week1.assignment;

public class Fibonacci {
	
	public static void main(String[] args){

		//Fibonacci series from 0 through 11
		
		int firstnum=0;
		int secondnum=1;
		int sum=0;
		System.out.println(firstnum);
		
		for(int i=1;i<=11;i++) {
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.println(sum);	
			
		}
	}

}
