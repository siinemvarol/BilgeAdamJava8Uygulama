package lesson004;

public class Question35 {

	public static void main(String[] args) {
		// Java,Spring,Postgre,React

		// her virgülden kelimeyi ayırmak istiyorum

		String text = "Java,Spring,Postgre,React";
		String[] seperated = text.split(",");

		for (int i = 0; i < seperated.length; i++) {
			System.out.println(seperated[i]);
		}

		System.out.println("\n----------\n");

		// Alternatif - substring
		String s1 = text.substring(0, 4);
		String s2 = text.substring(5, 11);
		String s3 = text.substring(12, 19);
		String s4 = text.substring(20, 25);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println("\n----------\n");

		// Alternatif 2 - substring

		int index = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') {
				System.out.println(text.substring(index, i));
				index = i + 1;
			}
		}
		System.out.println(text.substring(index));

		System.out.println("\n----------\n");

		// Alternatif 3 -

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') {
				System.out.println();
			} else {
				System.out.print(text.charAt(i));
			}
		}

	}

}
