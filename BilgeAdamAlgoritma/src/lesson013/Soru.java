package lesson013;

import java.util.Scanner;

public class Soru {

	private int puan;
	private String icerik; // soru metni
	private String dogruCevap;
	private String[] cevapIcerikleri; // A, B.. şıklarında yazan metinler

	public Soru() {
		super();
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public String getDogruCevap() {
		return dogruCevap;
	}

	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}

	public String[] getCevapIcerikleri() {
		return cevapIcerikleri;
	}

	public void setCevapIcerikleri(String[] cevapIcerikleri) {
		this.cevapIcerikleri = cevapIcerikleri;
	}

	public void soruOlustur(String[] cevapSecenekleri) {
		// kullanıcıdan soru içeriğini alacağız
		// her bir şıkkın değerini isteyeceğiz
		// doğru cevabı isteyeceğiz
		// sorunun puanını isteyeceğiz
		// doğru cevabı isteyeceğiz

		Scanner scanner = new Scanner(System.in);
		System.out.println("soru içeriğini girin: ");
		icerik = scanner.nextLine(); // setIcerik(scanner.nextLine());

		cevapIcerikleri = new String[cevapSecenekleri.length];

		for (int i = 0; i < cevapSecenekleri.length; i++) {
			System.out.println(cevapSecenekleri[i] + " şıkkını girin: ");
			cevapIcerikleri[i] = scanner.nextLine();
		}
		System.out.println("sorunun doğru cevabını girin: ");
		dogruCevap = scanner.nextLine().toUpperCase();		// setDogruCevap(scanner.nextLine().toUpperCase());

		
		System.out.println("sorunun puanını girin: ");
		this.puan = scanner.nextInt();		// setPuan(scanner.nextInt()); --> aynı sınıfta olduğu için bunu yapmak zorunda değiliz

	}

}
