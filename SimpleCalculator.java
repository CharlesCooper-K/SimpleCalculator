/*
Author: Charles Cooper
File: Grade Calculator
Created On: September 9, 2026
Last Modified: September 9, 2026
Description: Calculator for simple math
*/

package calc;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		// declare and initialize variables
		Scanner input = new Scanner(System.in);
		int num1, num2;
		String operation;
		int value = 0;

		// ask user for first value
		System.out.print("Enter first numbeer: ");
		num1 = input.nextInt();

		// ask user for operation
		System.out.print("Enter operation: ");
		operation = input.next();

		// ask user for second value
		System.out.print("Enter second number: ");
		num2 = input.nextInt();

		// switch to do equation based on operation needed
		switch (operation) {
		case "+":
			value = num1 + num2;
			break;
		
		case "-":
			value = num1 - num2;
			break;
			
		case "*":
			value = num1 * num2;
			break;
			
		case "/":
			value = num1 / num2;
			break;
		}

		// print results
		System.out.printf("%d %s %d = %d", num1, operation, num2, value);
	}

}
