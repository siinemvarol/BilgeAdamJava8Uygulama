package lesson012;

public class Pizza {

	private int price;
	private boolean isVegie;

	// Constant
	private static final int NORMAL_FIYAT = 200;
	private static final int VEGI_FIYAT = 300;
	private static final int SOS_FIYATI = 50;
	private static final int PEYNIR_FIYATI = 100;
	private static final int KURYE_FIYATI = 20;

	public Pizza() {

	}

	public Pizza(boolean isVegie) {

		this.isVegie = isVegie;
		if (this.isVegie) {
			this.setPrice(VEGI_FIYAT);
		} else {
			this.setPrice(NORMAL_FIYAT);
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;

	}

	public boolean isVegie() {
		return isVegie;
	}

	public void setIsVegie(boolean isVegie) {
		this.isVegie = isVegie;
	}

	public void sosEkle() {
		System.out.println("sos eklendi.. sos fiyatı: " + SOS_FIYATI);
		setPrice(getPrice() + SOS_FIYATI);

	}

	public void peynirEkle() {
		System.out.println("peynir eklendi.. peynir fiyatı: " + PEYNIR_FIYATI);
		setPrice(getPrice() + PEYNIR_FIYATI);

	}

	public void eveSiparisVer() {
		setPrice(getPrice() + KURYE_FIYATI);

	}

	public void fisAl() {
		System.out.println("Toplam ücret --- " + getPrice());
	}

	public void sosCikar() {

		System.out.println("sos çıkarıldı --- " + SOS_FIYATI);
		setPrice(getPrice() - SOS_FIYATI);

	}

	public void peynirCikar() {
		System.out.println("peynir çıkarıldı --- " + PEYNIR_FIYATI);
		setPrice(getPrice() - PEYNIR_FIYATI);
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + ", isVegie=" + isVegie + "]";
	}

}
