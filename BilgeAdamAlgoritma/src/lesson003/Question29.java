package lesson003;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// Kullanıcıdan sürekli sayı alacağı. kullanıcı 0a basınca aldığımız sayıların çarpımını yazdıracağız
		// while
		
		Scanner scanner = new Scanner(System.in);
		
		int number;
		
		int carpim = 1;
		
		boolean sifirMi = false;				

		while(sifirMi == false) {
			System.out.println("Sayı girin: ");
			number = scanner.nextInt();
			if (number != 0) {
				carpim = carpim * number;
			}
			else {
				sifirMi = true;
			}
		}
		System.out.println(carpim);

	}

}
