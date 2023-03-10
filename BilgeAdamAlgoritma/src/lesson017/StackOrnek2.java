package lesson017;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek2 {

	// Parametre olarak String alan ve girilen metnin her bir karakterini stackin
	// içine atan bir metod yazalım ismi palindrom olsun

	static Stack<Character> stack = new Stack<Character>();

	public static void palindrom(String metin) {
		for (int i = 0; i < metin.length(); i++) {
			stack.push(metin.charAt(i));
		}
		for (Character ch : stack) {
			System.out.println(ch);
		}
		
	}
	
	public static boolean isPalindrom(String metin) {
		for (int i = 0; i < metin.length(); i++) {
			if (metin.charAt(i) != stack.pop()) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir kelime girin: ");
		
		String kelime = scanner.nextLine();
		palindrom(kelime);
		
		if(isPalindrom(kelime)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("palindrom değil");
		}
		

	}

}
