package lesson014;

public class UserManager {

	private final String emailFormat = "@xbanka.com";

	public void generateAutoEmail(User user) {
		user.setEmail(
				user.getName().toLowerCase().replace(' ', '.') + "." + user.getSurname().toLowerCase() + emailFormat);
	}
	// replace ( değiştirilmesi istenen, neyle değiştireceğiz);
	// replace(' ', '.') yerine replace(" ", ".") de olabilir

	// alternatif metod aşağıda
	public void otomatikEmailOlustur(User user) {
		String otomatikOlusanEmail = user.getName().toLowerCase().replaceAll(" ", ("."))
				.concat("." + user.getSurname().toLowerCase().replace(' ', ('.'))) + emailFormat;

		user.setEmail(otomatikOlusanEmail);

		System.out.println(otomatikOlusanEmail);
	}

	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);

		System.out.println(para + " TL için kredi başvurusunda bulundunuz..");
		System.out.println("başvuru sonucu bekleniyor..");

	}

	public void krediBorcunuOde(Account account, int taksit) {
		if (account.isKrediAlindiMi()) {
			if (account.getKrediBorcu() < taksit) {
				System.out.println("Kredi borcunuz yatırılan miktardan az");
			} else {
				account.setKrediBorcu(account.getKrediBorcu() - taksit);
				account.setKrediNotu(account.getKrediNotu() + 10);
				System.out.println(taksit + " TL ödeme yaptınız. Güncel borç: " + account.getKrediBorcu());
				account.setKrediBorcuOdendiMi(true);
			}

		}

		else {
			System.err.println("Aktif krediniz olmadığı için işleminizi gerçekleştiremiyoruz.");
		}
	}

	public void hesaptanKrediBorcunuOde(Account account, int taksit) {
		if (account.isKrediAlindiMi()) {
			if (account.getKrediBorcu() < taksit) {
				System.out.println("Kredi borcunuz yatırılan miktardan az");

			} else {
				if (account.getMoney() >= taksit) {
					account.setKrediBorcu(account.getKrediBorcu() - taksit);
					account.setMoney(account.getMoney() - taksit);
					account.setKrediNotu(account.getKrediNotu() + 10);
					account.setKrediBorcuOdendiMi(true);
					System.out.println(
							"Hesaptan " + taksit + " TL ödeme yaptınız. Güncel borç: " + account.getKrediBorcu());
					System.out.println("Hesabın güncel bakiyesi: " + account.getMoney());

				} else {
					System.out.println("Bakiyeniz ödemek istediğiniz miktardan az");
				}
			}

		}

		else {
			System.err.println("Aktif krediniz olmadığı için işleminizi gerçekleştiremiyoruz.");
		}
	}

	public void nakitAvansCek(Account account) {

		if (account.getKrediNotu() >= 50) {
			account.setMoney(account.getMoney() / 2);
			System.out.println("Çekilen nakit avans miktari: " + (account.getMoney())
					+ "\nNakit avans çekildikten sonra güncel bakiye: " + account.getMoney());
		} else {
			System.out.println("Kredi notu yetersizdir. Kredi notu: " + account.getKrediNotu());
		}

	}
	
	public void nakitAvansCek2 (Account account, int avans) {
		if (account.getKrediNotu() >= 50) {
			System.out.println(account.getMoney() / 2 - account.getIstenenKredi() + " nakit avans çekebilirsiniz");
			account.setMoney(account.getMoney()-avans);
			System.out.println(avans + " TL avans çektiniz");
			System.out.println("Güncel bakiye: " + account.getMoney());
		}
		else {
			System.out.println("Kredi notunuz yetersiz. Kredi notu: " + account.getKrediNotu());
		}
	}
}
