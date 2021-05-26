package com.qa.mathscanner;

import java.util.Scanner;

import com.qa.mathscanner.math.MathMethods;

public class Runner {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean isRunning = true;
		do {
			System.out.println("Select a number for your math operation\n\t"
					+ "1: add\n\t"
					+ "2: subtract\n\t"
					+ "3: divide\n\t"
					+ "4: multiply\n\t"
					+ "5: Exit Application");
			int result = Integer.parseInt(scan.nextLine()); // "1" -> 1
			
			switch(result) {
				case 1:
					logs("add");
					break;
				case 2:
					logs("subtract");
					break;
				case 3:
					logs("divide");
					break;
				case 4:
					logs("multiply");
					break;
				case 5:
					System.out.println("You have exited the application");
					isRunning = false;
					break;
				default:
					isRunning = false;
					break;
			}
//			
//			
		}while(isRunning);
		
		scan.close();
	}
	
	public static void logs(String method) {
		System.out.println("You have selected - "+ method);
		System.out.println("Please enter 1/2 numbers to "+ method);
		int a = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter 2/2 numbers to " + method);
		int b = Integer.parseInt(scan.nextLine());
		if(method != "divide") {
			System.out.println("Your solution is: " + (int)MathMethods.swch(method , a, b));
		}else {
			System.out.println("Your solution is: " + MathMethods.swch(method , a, b));
		}
	}

}
