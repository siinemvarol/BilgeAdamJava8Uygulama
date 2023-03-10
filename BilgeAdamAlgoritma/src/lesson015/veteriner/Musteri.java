package lesson015.veteriner;

import java.util.ArrayList;

public class Musteri extends Insan {

	private String adres;
	private ArrayList<Hayvan> hayvanListesi;

	public Musteri(String tc, String isim, String adres) {
		super(tc, isim);
		this.adres = adres;
		hayvanListesi = new ArrayList<Hayvan>();
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());

	}

	// max 3 hayvanı olabilir
	public void hayvanEkle(Hayvan hayvan) {
		if (hayvanListesi.size() < 3) {
			if (hayvanListesi.add(hayvan)) {
				System.out.println(hayvan.toString() + " " + getName() + " 'e eklendi");
			}
		} else {
			System.err.println("max 3 hayvan eklenebilir");
		}
	}
	
	public void hayvanlariListele() {
		System.out.println(getName() + " in sahip olduğu hayvanlar: ");
		System.out.println(hayvanListesi.get(0).getName());
		System.out.println(hayvanListesi.get(1).getName());
		System.out.println(hayvanListesi.get(2).getName());
		System.out.println("* * * ");
		for (Hayvan hayvan : hayvanListesi) {
			hayvan.bilgileriGoster();
		}
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
		

	public ArrayList<Hayvan> getHayvanListesi() {
		return hayvanListesi;
	}

	public void setHayvanListesi(ArrayList<Hayvan> hayvanListesi) {
		this.hayvanListesi = hayvanListesi;
	}

	@Override
	public String toString() {
		return super.toString() + " Musteri [adres=" + adres + "] " + hayvanListesi;
	}

}
