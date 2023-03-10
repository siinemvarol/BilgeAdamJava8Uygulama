package lesson018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {

	public static void main(String[] args) {
		String[] ogrenci = { "Ayşe", "Zeynep", "Mahmut" };
		int[] notlar = { 60, 80, 70 };

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < ogrenci.length; i++) {
			map.put(ogrenci[i], notlar[i]);
		}

		// 1. yazdırma alternatifi
		System.out.println(map);

		// 2. yazdırma alternatifi
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

		// Her öğrencinin 3 notu olacak
		// int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };
		// bu notları ve öğrencileri Map'in içine atıp yazdıralım

		int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };

		HashMap<String, int[]> map2 = new LinkedHashMap<String, int[]>();

		for (int i = 0; i < notlar2.length; i++) {

			map2.put(ogrenci[i], notlar2[i]);

		}

		System.out.println("- - - - - ");
		System.out.println(map2); // adres yazdırıyor
		System.out.println("- - - - - ");
		for (Map.Entry<String, int[]> entry : map2.entrySet()) { // bu da adres yazdırıyor
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("- - - - - ");

		for (Map.Entry<String, int[]> entry : map2.entrySet()) {
			System.out.println(entry.getKey());
			for (int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i]);
			}
		}

		System.out.println("- - - - - ");

		// 3: notları liste olarak tutalım
		HashMap<String, List<Integer>> map3 = new HashMap<String, List<Integer>>();

		int[][] notlar3 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };

		for (int i = 0; i < notlar3.length; i++) {
			int sira = i;
			List<Integer> listNotlar = new ArrayList<>();
			for (int j = 0; j < notlar3[i].length; j++) {
				listNotlar.add(notlar3[i][j]);
			}
			map3.put(ogrenci[i], listNotlar);
		}
		// alternatif yazdırma -1
		System.out.println(map3);
		
		// alternatif yazdırma -2
		for (Entry<String, List<Integer>> entry : map3.entrySet()) {
			System.out.println("\n" + entry.getKey() + " " + entry.getValue());
			
		}

	}

}
