package lesson003;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// Girilen sayıya kadar tek olan sayıların toplamını bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("sayı girin: ");
		int number = scanner.nextInt();
		int tekToplam = 0;
		
		for (int i=1; i < number; i++) {
			if (i%2 == 1) {
				tekToplam = tekToplam + i;
				System.out.println("güncel toplam: " + tekToplam);
			}
		}
		System.out.println(number + " sayısına kadar olan tek sayıların toplamı: " + tekToplam);
		
		
		//Hocanın çözümü
		
		System.out.println("\n------------\n");
		
		System.out.println("(2)sayı girin: ");
		int number2 = scanner.nextInt();
		int tekToplam2 = 0;
		
		while (number2 != 0) {
			if (number2%2 != 0) {
			tekToplam2 = tekToplam2 + number2;
			}
			number2--;
		}
		System.out.println("ikinci koddaki tek sayıların toplamı: " + tekToplam2);

}
}
