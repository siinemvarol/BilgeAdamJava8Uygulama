package lesson018;

import java.util.HashMap;
import java.util.Scanner;

public class MapOrnek {
	
	// character ve int tutan bir map oluşturalım
	// kullanıcıdan birer kelime alalım
	// ve girilen kelimede hangi harfte kaç tane var onu yazdıralım

	public static void main(String[] args) {
		
		HashMap <Character, Integer> harita = new HashMap<Character, Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("kelime girin: ");
		String kelime = scanner.nextLine();
		
		
		for (int i = 0; i < kelime.length(); i++) {
			char ch = kelime.charAt(i);
			
			if (harita.containsKey(ch)) {
				harita.put(ch, harita.get(ch) + 1);
			} else {
				harita.put(ch, 1);
			}
						
		}
	//	System.out.println(harita);
		
		for (Character ch : harita.keySet()) {
			System.out.println(ch + " - " + harita.get(ch));
		}
		

	}

}
