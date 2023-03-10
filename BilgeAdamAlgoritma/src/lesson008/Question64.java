package lesson008;

public class Question64 {

	public static void main(String[] args) {
		// Cosenio - 5 dk veriliyor süresi
		// girilen kelimenin ilk ve son harfini değiştirelim
		// girilen kelimenin karakter sayısının 0 ile 100 arasında olması lazım
		// eğer tek harfli girildiyse girilen harfi return etsin
		System.out.println(harfDegistir("cosenio"));
		System.out.println(harfDegistir2("cosenio"));

		// oosyenic yazmalı
		
		boolean palindromKontrolu = isPalindrome("kayak");
		
		System.out.println(palindromKontrolu);

	}

	private static String harfDegistir(String kelime) {
		if (kelime.length() < 2) {
			return kelime;
		}
		if (kelime.length() > 100 || kelime.length() < 0) {
			System.out.println("yanlış");
		}
		char[] karakterler = kelime.toCharArray();
		char ilkHarf = karakterler[0];
		char sonHarf = karakterler[karakterler.length - 1];
		karakterler[0] = sonHarf;
		karakterler[karakterler.length - 1] = ilkHarf;
		return String.valueOf(karakterler);

	}
	
	private static String harfDegistir2(String kelime) {
		if (kelime.length() < 2) {
			return kelime;
		}
		if (kelime.length() > 100 || kelime.length() < 0) {
			System.out.println("yanlış");
		}
		
		StringBuilder stringBuilder = new StringBuilder(kelime);
		char first = kelime.charAt(0);
		char last = kelime.charAt(kelime.length()-1);
		
		stringBuilder.setCharAt(0, last);
		stringBuilder.setCharAt(kelime.length()-1, first);
		
		return stringBuilder.toString();
		


	}
	
	public static boolean isPalindrome(String kelime) {
		// kelime --> kayak, ters çevrilmiş kelime --> kayak. bu ikisi eşit mi diye kontrol edeceğim
		StringBuilder stringBuilder = new StringBuilder(kelime);
		System.out.println(stringBuilder.reverse());
		boolean isPalindrome = false;
		if (stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
			isPalindrome = true;
		}
		
		return isPalindrome;
		
	}
	
	public static boolean isPalindrome2(String kelime) {   // eksik olabilir
		// kelime --> kayak, ters çevrilmiş kelime --> kayak. bu ikisi eşit mi diye kontrol edeceğim
		String tersi = new StringBuilder(kelime).reverse().toString();
		boolean kontrol = kelime.equals(tersi);
		return kontrol;
		
	}

}
