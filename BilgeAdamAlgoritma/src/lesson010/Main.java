package lesson010;

public class Main {

	public static void main(String[] args) {

		Profile profile1 = new Profile();
		profile1.profilResmi = "resim.png";
		profile1.isim = "mehmet";
		profile1.kullaniciAdi = "mehmet123";

		System.out.println(profile1.isim);
		profile1.isim = "mehmet2";
		System.out.println(profile1.isim);

		System.out.println(profile1.postSayisi);

		System.out.println(profile1.postOlustur("resim2.png"));
		System.out.println(profile1.postOlustur("resim2.png"));
		System.out.println(profile1.postOlustur("resim2.png"));
		System.out.println(profile1.postOlustur("resim2.png"));
		System.out.println(profile1.postOlustur("resim2.png"));
		System.out.println(profile1.postOlustur("resim2.png"));
		System.out.println(profile1.postOlustur("resim2.png"));
		System.out.println(profile1.postOlustur("resim2.png"));
		System.out.println(profile1.postSayisi);

		System.out.println(profile1.isim);
		profile1.profilIsminiGuncelle("Yasin");
		System.out.println(profile1.isim);

		System.out.println(profile1.takipciSayisi);
		profile1.gelenIstegiKabulEt();
		profile1.gelenIstegiKabulEt();
		profile1.gelenIstegiKabulEt();
		profile1.gelenIstegiKabulEt();
		System.out.println(profile1.takipciSayisi);
		
		System.out.println(profile1.maviTik);
		profile1.gelenIstegiKabulEt();
		profile1.gelenIstegiKabulEt();
	//	profile1.maviTikKontrol();    --> bu metodu public'ten private'a çektiğim için artık kullanamam 
		System.out.println(profile1.maviTik);
		
		profile1.kullaniciSil();
		profile1.kullaniciSil();
		System.out.println(profile1.takipciSayisi);
		System.out.println(profile1.maviTik);
		
		profile1.bilgileriGoster();
		profile1.bilgileriGoster2();
		
		profile1.posts[0] = "resim3"; // String[] posts = { resim3 };
		profile1.posts[1] = "resim4"; // String[] posts = { resim3, resim4 };
		profile1.posts[3] = "resim5";
		profile1.posts[4] = "resim6";
		
		System.out.println("profil1'in postları");
		
		for (int i = 0; i < profile1.posts.length; i++) {
			System.out.println(profile1.posts[i]);
		}
		System.out.println("-------------");
		for (String foto : profile1.posts) {
			System.out.println(foto);
		}
		
		
	}

}
