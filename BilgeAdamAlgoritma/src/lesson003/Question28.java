package lesson003;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// Girilen sayının 5in kuvveti olup olmadığını bulan program

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		boolean besinKupu = true;
		
		while (besinKupu == true) {
			for (int i=1; i < number; i++) {
				if (number%5 == 0) {
					number = number / 5;
				}
				else {
					besinKupu = false;
					break;
				}
		}
			if (besinKupu == true) {
				System.out.println("girilen sayi beşin küpüdür");
				break;
			}
			else {
				System.out.println("girilen sayi beşin küpü değildir");
				break;
			}
			

		// Aşağıda girilen sayının 5in katı olup olmadığını bulan program

//		for(int i= 1; i <= number; i++) {
//			if(number%5 == 0) {
//				System.out.println("sayi 5in katıdır");
//				break;
//			}
//			else {
//				System.out.println("5in katı değildir");
//				break;
//			}
//		}

//		int number2 = scanner.nextInt();
//
//		boolean kontrol = true;
//
//		if (number2 == 0) {
//			System.out.println("sıfırdan farklı bir değer girin");
//		} else {
//			while (kontrol == true) {
//				if (number2 % 5 == 0) {
//					number2 = number2 / 5;
//					if (number2 == 1) {
//						System.out.println("sayi 5in kuvvetidir");
//						kontrol = false;
//					}
//				} else {
//					System.out.println("5in kuvveti değildir");
//					kontrol = false;
//				}
//			}
//
//		}

	}
}}
