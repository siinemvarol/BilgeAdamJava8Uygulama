package lesson003;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// Girilen sayının asal olup olmadığını bulan program

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
//		int number = scanner.nextInt();

//		boolean isPrimeNumber = false;
//
//		while (isPrimeNumber == false) {
//			for (int i = 2; i < number; i++) {
//				if (number % i == 0) {
//					System.out.println("asal sayı değildir");
//					isPrimeNumber = true;
//					break;
//				}
//			}
//			if (isPrimeNumber == false) {
//				System.out.println("asal sayıdır");
//				isPrimeNumber = true;
//			}
//		}
		int number2 = scanner.nextInt();
		boolean isPrime = true;

		for (int i = 2; i < number2; i++) {
			if (number2 % i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
		}
		if (isPrime) {
			System.out.println("sayi asaldır");
		} else {
			System.out.println("asal değildir");
		}

	}

}