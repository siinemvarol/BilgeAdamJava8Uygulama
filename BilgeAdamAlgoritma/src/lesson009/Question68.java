package lesson009;

public class Question68 {
	// girilen kelimedeki sesli harflerin sayısını bulan metod
	// metod int döndürsün, parametre olarak String alacak

	private static int sesliHarfleriSay(String kelime) {
		int counter = 0;

		for (int i = 0; i < kelime.length(); i++) {
			char karakter = kelime.charAt(i);
			switch (karakter) {
			case 'a', 'e', 'i', 'o', 'u':
				counter++;
				continue;

			default:

				break;
			}

		}
		return counter;
	}

	public static void main(String[] args) {
		int islemSonucu = sesliHarfleriSay("sinem");
		System.out.println(islemSonucu);
	}

}
