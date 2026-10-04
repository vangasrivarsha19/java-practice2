package com;
                                        //interview snippet
public class Test2 {
	
	public static void main(String[] args) {
		
		int res = divide();
			System.out.println(res);
	}
		
	
	static int divide() {
		
		try {
			int num1 = 20;
			int num2 = 0;
			
			int res = num1 / num2;
			return res;//return should be last line
		}
		catch(ArithmeticException ex) {
			System.out.println("dont divide by 0");
			return 1;//last
			
		}
		//catch(Exception ex) {
			//System.out.println(ex.getMessage());
	//	}
		finally {
			return 5; //compulsory goes to finally return statement and returns 5
		}

}
}