package com.qa.mathscanner.math;

import com.qa.mathscanner.exceptions.Exceptions;

public class MathMethods {

	public static float swch(String method, int a,int b) {
		if(method == "add") {
			return add(a, b);		
		}else if(method == "subtract") {
			return sub(a, b);		
		}else if(method == "divide") {
			try {
				return div(a, b);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}else if(method == "multiply") {
			return mult(a, b);		
		}
		return 0;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}

	public static int sub(int a, int b) {
		return a-b;
	}

	
	public static float div(float a, float b) throws ArithmeticException{
		try {			
			int i = (int)a/(int)b;
			return a/b;
//			throw new IllegalArgumentException("Value must be above zero");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public static int mult(int a, int b) {
		return a*b;
	}
}
