package lesson002;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// Girilen karakterin ünlü mü ünsüz mü olduğunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir karakter giriniz: ");
		char ch = scanner.next().charAt(0);
		
		int asciiCode = ch;
		
		switch (asciiCode) {
		case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117: // ya da 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
			System.out.println("ünlü harf");
			break;

		default:
			System.out.println("ünsüz harf");
			break;
		}
	}

}

/*
 * 65, 69, 73, 79, 85, 97, 101, 105, 111, 117:
 * 
 * 
 * 
 * 
 */
