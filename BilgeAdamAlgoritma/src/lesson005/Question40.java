package lesson005;

public class Question40 {

	public static void main(String[] args) {
		// A ile biten kelimelerin yerine ? koyacağız
		// 0 index değişti diyelim -->> yeni değeri -> ?		
		
		String[] dizi = {"Amerika", "Almanya", "İsveç", "Türkiye", "Danimarka"};
		
//		for(int i = 0; i <dizi.length; i++) {
//			if(dizi[i].endsWith("a")) {
//				dizi[i] = "?";
//				String yeniDeger = dizi[i];
//				System.out.println(i + ". indexi değişti. " + yeniDeger + " ile değişti.");
//			}
//		}
//		
//		for(int i = 0; i < dizi.length; i++) {
//			System.out.println(dizi[i]);
//		}
		
		
		for(int i = 0; i <dizi.length; i++) {
			if (dizi[i].charAt(dizi[i].length()-1) == 'a') {
				dizi[i] = "?";
				System.out.println("Dizinin " + i + ". index değeri ? ile değişti.");
			}		
	}
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		}



}
