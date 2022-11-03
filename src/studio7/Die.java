package studio7;

public class Die {

	//instance variables
	private int n;
	//private int eachThrow;
	
	//constructor
	public Die(int initN) 
	{
		n=initN;
		//eachThrow=initEachThrow;
	}
	public void print()
	{
		int a= (int)(Math.random()*(n-1))+1;
		System.out.println(a);
	}
	
	public static void main(String[]args) {
		Die throw1 = new Die(20);
		throw1.print();
		Die throw2 = new Die(6);
		throw2.print();
	}
	
}
