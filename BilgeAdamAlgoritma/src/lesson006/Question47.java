package lesson006;

import java.util.Scanner;

public class Question47 {

	public static void main(String[] args) {
		// 2x2lik bir array oluşturalım. arrayin içine isimler yazacağız
		//isimleri kullanıcıdan çıktı olarak alacağız
		// 1.grup
		// ali
		// mehmet
		
		// 2.grup
		// ahmet
		// hakan
		
		Scanner scanner = new Scanner(System.in);
		
		String[][]isimler = new String [2][2];
		
		for (int i = 0; i < isimler.length; i++) {
			for (int j = 0; j < isimler[i].length; j++) {
				System.out.println("İsim girin: ");
				String isim = scanner.nextLine();                // bu ve alttaki satır yerine isimler[i][j] = scanner.nextLine;
				isimler[i][j] = isim;							 // yapabilirim						
			}
		}
		
		for (int i = 0; i < isimler.length; i++) {
			System.out.println(i+1 + ". grup: ");
			for (int j = 0; j < isimler[i].length; j++) {
				System.out.println(isimler[i][j]);
			}
		}

	}

}
