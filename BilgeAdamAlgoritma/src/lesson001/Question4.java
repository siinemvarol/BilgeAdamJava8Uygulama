package lesson001;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		//verilen iki sayıdan hangisinin büyük olduğunu bulan program
		
		int sayi1 = 5;
		int sayi2 = 10;
		
		if (sayi1> sayi2) {
			System.out.println("sayi1 sayi2'den büyüktür");
		}
		else if(sayi1 < sayi2) {
			System.out.println("sayi2 sayi1'den büyüktür");
		}
		else System.out.println("Sayılar eşittir");
				
				
		//girilen iki sayıdan hangisinin büyük olduğunu bulan program
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Birinci sayıyı girin: ");
		int girilenSayi1 = scanner.nextInt();
		
		System.out.println("İkinci sayıyı girin: ");
		int girilenSayi2 = scanner.nextInt();
		
		if (girilenSayi1> girilenSayi2) {
			System.out.println("Girilen birinci sayı ikinci sayıdan büyüktür");
		}
		else if(girilenSayi1 < girilenSayi2) {
			System.out.println("Girilen ikinci sayı birinci sayıdan büyüktür");
		}
		else System.out.println("Girilen sayılar eşittir");

	}

}
