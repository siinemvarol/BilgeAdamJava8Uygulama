package lesson003;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// Girilen sayıda hangi basamakta hangi sayı olduğunu bulma
		// 375 birler basamağı --> 5 onlar basamağı --> 7 yüzler basamağı --> 3
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("sayı girin: ");
//		int number = scanner.nextInt();
//		int kalan;
//		int basamakSayisi;
//		
//		boolean basamakVarMi = true;
//		
//		while (basamakVarMi == true) {
//			for(int i=1; i <= 1000000; i*=10) {
//			if (number%10 >= 0) {
//				kalan = number%10;
//				System.out.println(i + " basamaktaki sayı: " +kalan);
//				number = number/10;
//			}
//				else {
//					basamakVarMi = false;
//					break;
//				}
//			}
//		}
		
		
		// alternatif çözüm 
		int number2 = scanner.nextInt();
		int i =1;
		
		while(number2>0) {
			System.out.println(i + " ler basamagı "+ number2%10);
			number2 = number2/10;
			i = i*10;
		}
		

	}

}
