package lesson017;

import java.util.Stack;

public class StackOrnek {

	// Stack : LIFO (Last In First Out)

	// stack oluşturalım, içine birkaç int değer atalım
	// stacki yazdıralım
	// stack boşalana kadar bütün elemanları çıkaralım
	// çıkarılan her elemanı yazdıralım

	// 100den küçük değerleri toplayıp stackten çıkaralım
	// 100den büyük değerleri farklı bir stack içine atalım
	// hem toplamı hem yeni stacki yazdıralım

	public static void main(String[] args) {

		Stack<Integer> sayilar = new Stack<Integer>();

		sayilar.push(5);
		sayilar.push(1);
		sayilar.push(9);
		sayilar.push(4);
		sayilar.push(26);
		sayilar.push(17);
		sayilar.push(13);
		sayilar.add(55);
		sayilar.push(130);
		sayilar.push(155);
		sayilar.push(850);
		sayilar.push(408);
		sayilar.push(505);

		for (Integer sayi : sayilar) {
			System.out.println(sayi);
		}

		System.out.println(sayilar);

//		for (int i = sayilar.size()-1; i >= 0; i--) {
//			System.out.println(sayilar.get(i) + " çıkarılıyor..");
//			sayilar.pop();
//		}

//		while(!sayilar.isEmpty()) {
//			System.err.println(sayilar.pop());
//		}

		int sifirdanKucukToplam = 0;

		Stack<Integer> yuzdenBuyuk = new Stack<Integer>();

	//	int size = sayilar.size();
		
		for (int i = sayilar.size()-1; i >= 0; i--) {
			if (sayilar.peek() < 100) {
				sifirdanKucukToplam += sayilar.peek();
				sayilar.pop();
			} else {
				yuzdenBuyuk.push(sayilar.peek());
				sayilar.pop();
			}
		}
		
		while (!sayilar.isEmpty()) {
			
		}

		System.out.println("Yüzden küçük sayıların toplamı: " + sifirdanKucukToplam);

		System.out.println(yuzdenBuyuk);

	}

}
