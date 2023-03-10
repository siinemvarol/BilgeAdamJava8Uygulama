package lesson018;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue3Ornek {
	
	// müşteri sınıfı açalım isim ve yaş attribute olsun
	// main'de priority queue oluşturalım, kuyruğa müşterileri atalım
	
	// müşteriler yaş önceliğine göre işlemlerini yapıp kuyruktan çıkacak
	// yaşı büyük olanlar ilk sırada yer alacak
	// yaşa göre bir sıralama yapacağız
	
	// Comparable

	public static void main(String[] args) {
			
		Queue<Musteri> musteriQueue = new PriorityQueue<>();
		
		musteriQueue.offer(new Musteri("mustafa", 20));
		musteriQueue.offer(new Musteri("ali", 30));
		musteriQueue.offer(new Musteri("mehmet", 40));
		musteriQueue.offer(new Musteri("aslı", 90));
		musteriQueue.offer(new Musteri("zeynep", 25));
		musteriQueue.offer(new Musteri("buğra", 100));
		
		while (!musteriQueue.isEmpty()) {
			System.out.println(musteriQueue.poll().getIsim() + " kuyruktan çıkmıştır..");
		}

	}



}
