package lesson018;

public class Hasta implements Comparable<Hasta> {

	// hasta diye bir sınıf açalım
	// isim, şikayet ve öncelik attribute olsun
	// şikayete göre öncelik belirleyeceğiz
	// Öncelik Özellikleri:
	// Apandist -> en yüksek öncelik
	// Yanık -> orta öncelik
	// Ağrı -> en düşük öncelik

	private String isim;
	private ESikayet sikayet;
	private String sikayet2;
	private int oncelik;

	public Hasta(String isim, String sikayet2) {
		super();
		this.isim = isim;
		this.sikayet2 = sikayet2;
		oncelikBelirle(sikayet2);

		this.oncelik = sikayet2.equalsIgnoreCase("Apandist") ? 1
				: sikayet2.equalsIgnoreCase("Yanık") ? 2 
				: sikayet2.equalsIgnoreCase("Ağrı") ? 3 : 4;
	}

	public Hasta(String isim, ESikayet sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		oncelikBelirleEnum(sikayet);

//		this.oncelik = sikayet.equalsIgnoreCase("Apandist") ? 1
//				: sikayet.equalsIgnoreCase("Yanık") ? 2 : sikayet.equalsIgnoreCase("Ağrı") ? 3 : 4;
	}

	public void oncelikBelirle(String sikayet2) {
		if (sikayet2.equalsIgnoreCase("Apandist")){
			this.oncelik = 1;
		} else if (sikayet2.equalsIgnoreCase("Yanık")){
			this.oncelik = 2;
		}
		else {
			this.oncelik = 3;
		}
	}

	public void oncelikBelirleEnum(ESikayet sikayet) {
		
		switch (sikayet) {
		case APANDIST:
			this.oncelik = 1;
			break;
		case YANIK:
			this.oncelik = 2;
			break;
		case AGRI:
			this.oncelik = 3;
			break;

		default:
			throw new IllegalArgumentException("beklenmedik değer girişi oldu hatası");
			
		}
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSikayet() {
		return sikayet2;
	}

	public void setSikayet(String sikayet2) {
		this.sikayet2 = sikayet2;
	}

	public int getOncelik() {
		return oncelik;
	}

	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}

	@Override
	public int compareTo(Hasta o) {
		if (o.getOncelik() > this.oncelik) {
			return -1;
		} else if (o.getOncelik() < this.oncelik) {
			return 1;
		}
		return 0;
	}

}
