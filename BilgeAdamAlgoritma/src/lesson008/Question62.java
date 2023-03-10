package lesson008;

import java.util.Scanner;

public class Question62 {

	private static boolean emailGecerliMi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Email adresinizi girin: ");
		String email = scanner.nextLine();
		boolean emailGecerliMi = false;
		if (email.contains("@") && (email.endsWith("hotmail.com") || email.endsWith("gmail.com"))) {
			emailGecerliMi = true;
		}
		System.out.println("Email geçerli mi?: " + emailGecerliMi);
		return emailGecerliMi;
	}

	private static void emailGecerliMi2(String email) {
		if (email.contains("@")) {
			int index = email.indexOf('@');
			System.out.println(index);
			String kontrol = email.substring(index, email.length());
			System.out.println(kontrol);

			if (kontrol.equals("@hotmail.com") || kontrol.equals("gmail.com")) {
				System.out.println("doğru format");
			} else {
				System.out.println("email doğru format değil");
			}
		} else {
			System.out.println("@ karakteri içermiyor");
		}
	}

	private static boolean passwordlerEslesiyorMu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Şifrenizi girin: ");
		String password1 = scanner.nextLine();
		System.out.println("Şifrenizi tekrar girin: ");
		String password2 = scanner.nextLine();
		boolean sifrelerEslesiyorMu = false;
		if (password1.equals(password2)) {
			sifrelerEslesiyorMu = true;
		}
		System.out.println("Şifreler eşleşiyor mu?: " + sifrelerEslesiyorMu);
		return sifrelerEslesiyorMu;
	}

	public static void login() {
		boolean emailCheck = emailGecerliMi();
		boolean passwordCheck = passwordlerEslesiyorMu();
		

		if (passwordCheck && emailCheck) { // bunların öncelik sıralamasına göre console'da önce password sonra mail
											// istiyor şu anda
			System.out.println("giriş yapıldı");
		} else {
			System.out.println("bilgiler hatalı");
		}
	}

	public static void main(String[] args) {
		// 2 metod yazılacak.
		// 1- kullanıcıdan aldığımız email değerinde @ var mı diye kontrol edeceğiz
		// ve hotmail.com veya gmail.com ile mi bitiyor diye kontrol edeceğiz

		// password ve repassword alıp bunların uyuşup uyuşmadığını kontrol edeceğiz

		// emailGecerliMi();
		// passwordlerEslesiyorMu();
		login();

	}

}
