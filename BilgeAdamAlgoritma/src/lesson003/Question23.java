package lesson003;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// Girilen sayının faktöriyelini bulan program

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		int factorial = 1;

		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of number " + number + " is: " + factorial);

	}

}
