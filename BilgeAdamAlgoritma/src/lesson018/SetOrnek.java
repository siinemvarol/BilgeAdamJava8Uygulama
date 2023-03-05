package lesson018;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	// 2 tane set oluşturalım: tekrar edenler ve tekrar etmeyenler
	// kullanıcıdan bir kelime alalım
	// eğer tekrar eden harf varsa tekrarEdenler setine atalım
	// ve tekrarEtmeyenlerden çıkaralım

	// tekrarEdenler ve tekrarEtmeyenler yazdıralım

	// java
	// tekrarEdenler --> a
	// tekrarEtmeyenler --> j, v

	public static void main(String[] args) {

//		HashSet<Character> tekrarEdenler = new HashSet<Character>();
//		HashSet<Character> tekrarEtmeyenler = new HashSet<Character>();
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Bir kelime girin: ");
//		String kelime = scanner.nextLine();
//
//		for (int i = 0; i < kelime.length(); i++) {
//			tekrarEtmeyenler.add(kelime.charAt(i));
//		}
//
//		for (int i = 0; i < tekrarEtmeyenler.size(); i++) {
//			for (int j = 0; j < tekrarEtmeyenler.size(); j++) {
//				if ((i != j) && kelime.charAt(i) == kelime.charAt(j)) {
//					tekrarEdenler.add(kelime.charAt(i));
//
//				}
//			}
//		}
//
//		for (int i = 0; i < tekrarEtmeyenler.size(); i++) {
//			if (tekrarEtmeyenler.contains(kelime.charAt(i))) {
//				tekrarEtmeyenler.remove(kelime.charAt(i));
//			}
//
//		}
//
//		System.out.println(tekrarEtmeyenler);
//
//		System.out.println(tekrarEdenler);
		
		
		Set <Character> tekrarEdenler2 = new HashSet<>();
		Set <Character> tekrarEtmeyenler2 = new HashSet<>();
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("metin girin: ");
		String metin = scanner.nextLine();
		
		for (int i = 0; i < metin.length(); i++) {
			for (int j = i+1; j < metin.length(); j++) {
				if (metin.charAt(i) == metin.charAt(j)) {
					tekrarEdenler2.add(metin.charAt(i));
				}
			}
			if (!tekrarEdenler2.contains(metin.charAt(i))) {
				tekrarEtmeyenler2.add(metin.charAt(i));
			}
		}
		
		System.out.println("tekrar etmeyenler: " + tekrarEtmeyenler2);
		System.out.println("tekrar edenler: " + tekrarEdenler2);
		

	}

}