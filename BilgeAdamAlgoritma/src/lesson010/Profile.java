package lesson010;

public class Profile {
	// gerekli attribute'leri tanımlayalım (attribute / property / field)

	// nesne özellikleri
	public String profilResmi;
	public String isim;
	public String kullaniciAdi;
	public String hakkindaAciklamasi;
	public String baglantiLinki;
	public boolean maviTik;
	
	public int takipciSayisi;
	public int takipEttikleri;

	public String[] posts = new String[10];
	public int postSayisi;

	// post oluşturma metodu -->> ismini yazıp post oluşturdu desin

	public String postOlustur(String posts) {
		String metin = isim + " yeni bir post oluşturdu";
		postSayisi++;
		this.posts[postSayisi] = posts;		
		return metin;
	}

	// profilIsminiGuncelle -->> metodda isim alıp ismi güncelleyecek
	public void profilIsminiGuncelle(String isim) {
		this.isim = isim;

	}

	// gelenIstegiKabulEt metodu -->> takipçi sayısını arttıracak

	public void gelenIstegiKabulEt() {
		this.takipciSayisi += 1;
		maviTikKontrol();
		}
	public void kullaniciSil() {
		this.takipciSayisi -= 1;
		maviTikKontrol();
		}
	
	// takipçi sayisi 5'ten fazla ise kullanıcıya mavi tik verelim
	
	private void maviTikKontrol () {
		if (takipciSayisi > 5) {
			this.maviTik = true;
		}
		else {
			this.maviTik = false;
		}
	}
	
	// bilgileri Göster metodu
	// username, takipci sayısı, mavi tik, post sayısı
	
	public void bilgileriGoster() {
		System.out.println("kullaniciAdi= " + kullaniciAdi + ", maviTik= " + maviTik + ", takipciSayisi= " + takipciSayisi
				+ ", postSayisi= " + postSayisi);
	}

	public void bilgileriGoster2() {
		System.out.println(this.toString());    // bu satırdaki this'i kullanmak zorunda değilim. kafası karışmıyor
	}
	@Override
	public String toString() {
		return "Profile [kullaniciAdi=" + kullaniciAdi + ", maviTik=" + maviTik + ", takipciSayisi=" + takipciSayisi
				+ ", postSayisi=" + postSayisi + "]";
	}
	

}
