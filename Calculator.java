package week3.day1;

public class Calculator {
	
	public void add(int a, int b) {
	int add = a+b;
	System.out.println("Add 2 numbers:"+add);}
	
	public void add(int a, int b,int c) {
	int add = a+b+c;
	System.out.println("Add 3 numbers:"+add);}
	
	public void subtract(int a, int b) {
	int sub = a-b;
	System.out.println("Subtract 2 numbers:"+sub);}
	
	public void subtract(double a, double b) {
	double sub = a-b;
	System.out.println("Subtract 2 numbers:"+sub);}
	
	public void mulitply(int a, int b) {
		int mul = a*b;
		System.out.println("mMlitply 2 numbers:"+mul);}
		
		public void mulitply(int a, double b) {
			double mul = a*b;
		System.out.println("Mulitply 2 numbers:"+mul);}
		
		public void divide(int a, int b) {
			int divide = a/b;
			System.out.println("Divide 2 numbers:"+divide);}
			
			public void divide(int a, double b) {
				double divide = a/b;
			System.out.println("Divide 2 numbers:"+divide);}

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(3,2);
		obj.add(1,2,4);
		obj.subtract(5,2);
		obj.subtract(7.55,3.25);
		obj.mulitply(3,2);
		obj.mulitply(1,2.131);
		obj.divide(6,2);
		obj.divide(8,2.2);
		

	}

}
