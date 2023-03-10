package lesson015.veteriner;

public class Kopek extends Hayvan {

	private int asiSayisi;
	private String cins;
	private String tur;
	private String karne;

	public Kopek(String name, boolean kayitliMi, String dogumTarihi, String cins) {
		super(name, kayitliMi, dogumTarihi);
		this.cins = cins;
		setTur("köpek");
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());

	}

	@Override
	public void karneOlustur() {
		setKarne("Cinsi: " + this.getCins() + " Türü: " + this.getTur());
		System.out.println(getName() + " için karne oluşturuldu: " + this.getKarne());

	}

	public int getAsiSayisi() {
		return asiSayisi;
	}

	public void setAsiSayisi(int asiSayisi) {
		this.asiSayisi = asiSayisi;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	public String getKarne() {
		return karne;
	}

	public void setKarne(String karne) {
		this.karne = karne;
	}

	@Override
	public String toString() {
		return super.toString() + " Kopek [asiSayisi=" + asiSayisi + ", cins=" + cins + ", tur=" + tur + ", karne=" + karne + "]";
	}

}
