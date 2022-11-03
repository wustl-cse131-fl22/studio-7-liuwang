package studio7;

public class Fraction {
	//instance variables
	private int n1; //numerator of fraction1
	private int d1; //denominator of fraction1
	private int n2; //numerator of fraction2
	private int d2; //denominator of fraction2
	
	//constructor
	public Fraction(int num, int denom, int num2, int denom2) {
		n1 = num;
		d1 = denom;
		n2 = num2;
		d2 = denom2;
	}
	//fraction1 + fraction2
	public void add(){
		int denomFinal = d1*d2;
		int numFinal = n1*d2+n2*d1;
		System.out.println(numFinal + "/" + denomFinal);
	}
	//fraction1 * fraction2
	public void multiply() {
		int denomFinal1 = d1*d2;
		int numFinal1 = n1*n2;
		System.out.println(numFinal1 + "/" + denomFinal1);
	}
	//1/fraction1
	public void reciprocal() {
		System.out.println(d1 + "/" + n1);
	}
	public void simplify() {
		int gcd=0;
		if (d1%n1==0) {
			System.out.println(1+"/"+n1);
		}
		else {
			for (int i=2;i<n1;i++) {
				if ((d1%i==0) && (n1%i==0)) {
					gcd=i;
				}
			}
			System.out.println(n1/gcd+"/"+d1/gcd);
		}
	}
	public static void main(String[]args) {
		Fraction p1 = new Fraction(2,4,8,32);
		p1.add();
		p1.multiply();
		p1.reciprocal();
		p1.simplify();
	}
}





















