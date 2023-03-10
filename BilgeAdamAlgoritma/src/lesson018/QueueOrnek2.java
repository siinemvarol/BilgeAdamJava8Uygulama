package lesson018;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek2 {

	// Bir tane queue oluşturalım 10-12 isim ekleyelim
	// 1-10 arasında bir sayi üretelim - pide sayisi olsun
	// pide yazdiralim

	// kuyruğa göre pide dağıralım. bittiğinde pideler bitti yazdıralım
	// pideyi alan kişileri kuyruktan çıkaralım
	// pideyi alamayan kişileri yazdıralım

	public static void main(String[] args) throws InterruptedException {

		Queue<String> pideKuyrugu = new LinkedList<String>();		// eğer PriorityQueue yapsaydım
																	// alfabeye göre sıralayıp öyle alacaklardı pideyi
		pideKuyrugu.add("ali");
		pideKuyrugu.add("ahmet");
		pideKuyrugu.add("veli");
		pideKuyrugu.add("mehmet");
		pideKuyrugu.add("zeki");
		pideKuyrugu.add("sinan");
		pideKuyrugu.add("hasan");
		pideKuyrugu.add("canan");
		pideKuyrugu.add("hatice");
		pideKuyrugu.add("özkan");
		pideKuyrugu.add("elif");
		pideKuyrugu.add("irem");

		Random random = new Random();

		int pideSayisi = random.nextInt(1, 11);
		System.out.println("Pide sayisi: " + pideSayisi);

		for (int i = 0; i < pideSayisi; i++) {
			System.out.println(pideKuyrugu.poll() + " pideyi aldi...");
			Thread.sleep(2000);
		}

		System.out.println("Pideyi alamayan kişiler: " + pideKuyrugu);
		
		for (int i = 0; i < pideKuyrugu.size(); i++) {
			System.out.println(pideKuyrugu.poll() + " pideyi alamadı..");
		}
		
		

	}

}
