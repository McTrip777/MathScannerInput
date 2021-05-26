package com.qa.mathscanner.math;

public class MathMethods {

	public static float swch(String method, int a,int b) {
		if(method == "add") {
			return add(a, b);		
		}else if(method == "subtract") {
			return sub(a, b);		
		}else if(method == "divide") {
			return div(a, b);		
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

	public static float div(float a, float b) {
		return a/b;
	}

	public static int mult(int a, int b) {
		return a*b;
	}
}
