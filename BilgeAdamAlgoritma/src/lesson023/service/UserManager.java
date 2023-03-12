package lesson023.service;

import java.time.LocalDate;
import java.util.Random;

import lesson023.entity.data.User;
import lesson023.entity.database.DataBase;
import lesson023.entity.enums.EStatus;
import lesson023.util.Util;

public class UserManager {

	DataBase dataBase;
	AdminManager adminManager;

	public UserManager() {
		dataBase = new DataBase();
		adminManager = new AdminManager();
	}

	// kullanıcının girdiği mail bizim database'imizde var mı yok mu
	// eğer varsa o User'ı return edelim

	public User userMailKontrol(String mail) {

		for (int i = 0; i < DataBase.getUserList().size(); i++) {
			if (DataBase.getUserList().get(i).getEmail().equals(mail)) {
				return DataBase.getUserList().get(i);
			}
		}
		System.out.println("User bulunamadı");
		return null;
	}

	public boolean userSifreKontrol(String password) {

		for (int i = 0; i < DataBase.getUserList().size(); i++) {
			if (DataBase.getUserList().get(i).getPassword().equals(password)) {
				return true;
			}
		}
		System.out.println("Şifre yanlış");
		return false;
	}

	public void register() {
		String email = Util.stringDegerAl("Mail: ");

		User userKontrol = userMailKontrol(email);
		if (userKontrol == null) {
			String password = Util.stringDegerAl("Password: ");
			String name = Util.stringDegerAl("Name: ");
			LocalDate birthDay = Util.stringTarih();
			User user = new User(email, password, name, birthDay);

			String id = activationCode();
			System.out.println("Activation kodunuz: " + id);
			String aktivasyonKodu = Util.stringDegerAl("Lütfen aktivasyon kodunu doğru giriniz: ");
			if (id.equals(aktivasyonKodu)) {
				DataBase.getUserList().add(user);
				System.out.println("Kullanıcı başarılı bir şekilde oluşturuldu!");
				user.seteStatus(EStatus.PENDING);
			} else {
				System.out.println("Aktivasyon kodu yanlış girildi");
			}
		}

	}

	private String activationCode() {
		Random random = new Random();
		int activationCode = random.nextInt(1000, 5000);
		String id = Integer.toString(activationCode);
		return id;
	}

	public void dmAt(User user) {
		String id = Util.stringDegerAl("DM atılacak kullanıcı IDsi girin:");
		User mesajAlicisi = adminManager.userIdKontrol(id);
		String message = Util.stringDegerAl("Mesaj içeriğini girin:");
//		mesajAlicisi.getDmListesi().put(user, message);
		if (mesajAlicisi.getDmListesi().containsKey(user)) {
			mesajAlicisi.getDmListesi().replace(user, mesajAlicisi.getDmListesi().get(user) + " || " + message);

		} else {
			mesajAlicisi.getDmListesi().put(user, message);
		}

	}

	public void dmListesiniYazdir(User user) {
		System.out.println(user.getDmListesi());
	}

}
