package lesson004;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		// Verilen kelimenin içinde kaç tane "e" olduğunu bulan algoritma
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir metin girin: ");
		String text = scanner.nextLine();
		
		int counter = 0;
		
		for (int i = 0; i<text.length(); i++) {
			if(text.charAt(i)== 'e') {
				counter ++;
			}
		}
		System.out.println("girilen metnin içinde " + counter + " tane e harfi vardır.");

		// aldığımız texti önce büyük sonra küçük harfe çevirelim
		
		String upperText = text.toUpperCase();
		System.out.println(upperText);
		
		String lowerText = upperText.toLowerCase();
		System.out.println(lowerText);
				
	}
	
}
