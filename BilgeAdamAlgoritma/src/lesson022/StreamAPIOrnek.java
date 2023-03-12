package lesson022;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPIOrnek {

	// Stream API kullanarak 5 ile bölünen sayıları bir listeye yazdıralım
	
	// Sayıların kendisi ile çarpıp yeni bir listeye atalım
	
	// Kaç tane 5'e bölünen sayı var onu bulalım

	public static void main(String[] args) {

		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(61);
		sayilar.add(55);
		sayilar.add(78);
		sayilar.add(42);
		sayilar.add(25);

		List<Integer> sayilar2 = new ArrayList<>();
		sayilar.stream().forEach(sayi -> {
			if (sayi % 5 == 0) {
				sayilar2.add(sayi);
			}
		});
		System.out.println(sayilar2);
		
		// ---------------------------------------------------------------------------------
		System.out.println("- - - - - - - - - - \n");
		List<Integer> kalansizBolunenlerListesi = 
				sayilar.stream()
				.filter(sayi -> sayi % 5 == 0)
				.collect(Collectors.toList());	// tipi stream olan elemanı listeye çeviriyorum
												// ya da bu satırda .toList() kullanabilirim.
		System.out.println(kalansizBolunenlerListesi); 
		
		// ---------------------------------------------------------------------------------
		System.out.println("- - - - - - - - - - \n");
		List<Integer> carpimList = sayilar.stream()	// Stream
				.map(sayi -> sayi*sayi)				// Stream
				.collect(Collectors.toList());		// List
		carpimList.forEach(sayi -> System.out.println(sayi));
		System.out.println(carpimList);
		
		// ---------------------------------------------------------------------------------
		System.out.println("- - - - - - - - - - \n");
		int beseBolunen = (int)sayilar.stream().filter(sayi -> sayi % 5 == 0).count();
		System.out.println(beseBolunen);

//		FileOutputStream out;
//		
//		try {
//			out = new FileOutputStream("file.txt");
//			for (Integer sayi : sayilar)
//			if (sayi %5 == 0) {
//				out.write(sayi);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
