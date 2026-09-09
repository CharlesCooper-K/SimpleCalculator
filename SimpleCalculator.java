package calc;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		String operation;
		int value = 0;
		
		System.out.print("Enter first numbeer: ");
		num1 = input.nextInt();
		
		System.out.print("Enter operation: ");
		operation = input.next();
		
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		
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
		
		System.out.printf("%d %s %d = %d", num1, operation, num2, value);
	}

}
