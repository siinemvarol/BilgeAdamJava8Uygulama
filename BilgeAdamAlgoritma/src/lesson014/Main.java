package lesson014;

public class Main {
	// Account sınıfı olsun. Sınıfın attributeleri
	// accountNo, money
	// paraYatir() paraCek() metodları
	// paraYatir() -> hesaba belirttiğimiz miktarda para girişi olacak
	// paraCek() --> hesabımızdan bizim belirttiğimiz miktarda para düşülsün
	
	// bakiye 0
	// paraYatir() --> 100 tl yatırdınız güncel bakiyeniz 100
	// paraCek()  --> 50 tl hesaptan çektiniz güncel bakiyeniz 50
	
	// para çekmek istediğimiz zaman hesapta o kadar para yoksa çekmemize izin vermesin
	// para yatırırken max 10.000 limit olsun
	
	// AccountManager sınıfı açalım. depositMoney() ve withdrawMoney() metodlarını bu sınıfa taşıyalım
	
	// AccountManager sınıfında bilgileri göster metodu hesap no ve güncel bakiyeyi gösterecek
	
	// User sınıfı oluşturalım
	// String name, surname, email, Account account
	// mainde user oluştururken bir de account verelim
	
	// Kullanıcıdan aldığımız name ve surname değerleri ile otomatik @xbanka uzantılı mail oluşturalım
	// Xbankası
	// bir user benim bankamda üyelik açtığında name.surname@xbanka.com maili oluşturayım
	
	// User olarak kredi başvurusunda bulunalım,
	// krediyi çekeceği accountu ve ne kadar kredi istiyorsa miktarı girsin
	
	// Account sınıfının içinde private boolean krediBasvurusu, private int istenenKrediMiktari
	// krediBasvurusundaBulun() -> Account account, int para   --> metodu UserManager içerisinde yazalım
	
	// AdminManager sınıfı oluşturalım ve krediBasvurusunuOnayla(); metodunu yazalım
	// kredi başvurusunun olması gerekiyor (true)
	// onayladıktan sonra çekmek istediğimiz kadar krediMiktari hesabımıza düşsün
	
	// krediBasvurusunuReddet();
	// krediBasvurusunun olması lazım
	
	// Account nesnesi oluşturduğumuzda otomatik ID atasın
	
	// -------
	// krediBorcunuOde() metodu yazalım
	// atm'den nakit odeme yapılsın
	// eğer user'ın çekmiş olduğu kredi yoksa veya kredi başvurusu reddedilmişse : işleminizi gerçekleştiremiyoruz
	// çekilmiş kredi varsa parametre olarak girdiğimiz miktar kadar ödeme yapmış olalım
	// ve kredi borcundan düşülsün
	// çıktı --> güncel kredi borcunuz ... TL
	
	// hesaptanKrediBorcunuOde(); metodunu yazalım
	
	// her kart borcumuzu ödediğimizde Account'un kredi puanı 10 artsın
	
	// Nakit avans çekeceğiz. çekmemiz için kredi notumuzun 50'den fazla olması gerekiyor
	// eğer 50'den fazla ise hesaptaki paranın yarısı kadar nakit avans almış olacağız
	// 50'den az ise kredi notunuz yetersizdir diyip kredi notunu bastırsın
	
		
  	
	public static void main(String[] args) {

		Account sinem = new Account( 5000); // "Acc-555111",
		sinem.withdrawMoney(100);
		sinem.depositMoney(500);
		
		System.out.println("\n- - - - -");
		Account account = new Account();
	//	account.setAccountNo("55446611");
		account.setMoney(500);
		
		account.withdrawMoney(100);
		account.withdrawMoney(100);
		account.withdrawMoney(100);
			
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
//		account.withdrawMoney(100);
//		account.depositMoney(500);
//		account.depositMoney(-3);
		
		Account account2 = new Account(500); // "9889741",
		
		System.out.println("\naccountManager sınıfı..");
		System.out.println("- - - - - - -");
		AccountManager accountManager = new AccountManager();
		accountManager.depositMoney(account, 200);
	//	accountManager.withdrawMoney(account, 500);
	//	accountManager.withdrawMoney(account, 300);
		System.out.println(account.getMoney());
		
		System.out.println("- - - - - - -");
		accountManager.accountDetails(account);
		System.out.println("- - - - - - -");
		accountManager.accountDetails(account2);
		System.out.println("- - - - - - -");
//		accountManager.accountDetails(new Account("7776655", 5800)); // bu satırda aynı zamanda bir account nesnesi oluşturduk
//		accountManager.depositMoney(new Account("7776655", 5800), 200);  // yeni account nesnesine 1 tutarında deposit
		
		System.out.println("- - - - - - -");
		
		// User userSinem = new User("sinem", "varol", "siinemvarol@gmail.com", sinem);
		
		 User user1 = new User("ahmet", "yaz", account);
		// System.out.println(user1.getAccount().getMoney());
		
		User user2 = new User();
		user2.setName("mehmet");
		user2.setSurname("kış");
		user2.setEmail("asd@gmail.com");
		user2.setAccount(account2);
		System.out.println(user2.getAccount().getMoney() + " " + user2.getEmail());
		
		System.out.println("- - - - - - -");
		UserManager userManager = new UserManager();
		User user3 = new User("ali demir hakan", "sonbahar", account);
		userManager.generateAutoEmail(user3);
		System.out.println(user3.getEmail());
		
		System.out.println("- - - - - - -");
		System.out.println(sinem.getMoney());
		
		userManager.krediBasvurusundaBulun(sinem, 6000);
		
		System.out.println("- - - - - - -");
		System.out.println(account.isKrediBasvurusu());
		userManager.krediBasvurusundaBulun(account, 10000);
		System.out.println(account.isKrediBasvurusu());
		System.out.println(user1.getAccount().isKrediBasvurusu());
		
		System.out.println("- - - - - - -");
		AdminManager adminManager = new AdminManager();
		System.out.println("bakiye: " + account.getMoney());
		userManager.krediBasvurusundaBulun(account, 10000);
		adminManager.krediBasvurusunuOnayla(account);
		adminManager.krediBasvurusunuOnayla(account);
		System.out.println("bakiye: " + account.getMoney());
		
		System.out.println("- - - - - - -");
		System.out.println("bakiye: " + account2.getMoney());
		userManager.krediBasvurusundaBulun(account2, 25000);
		adminManager.krediBasvurusunuOnayla(user2);
		accountManager.accountDetails(account2);
		System.out.println("bakiye: " + account2.getMoney());
		
		System.out.println("- - - - - - -");
		System.out.println("bakiye: " + account2.getMoney());
		userManager.krediBasvurusundaBulun(account2, 25000);
		//adminManager.krediBasvurusunuOnayla(account2);
		adminManager.krediBasvurusunuReddet(account2);
		accountManager.accountDetails(account2);
		
		System.out.println("sinem accountu hesap no: " + sinem.getAccountNo());
		System.out.println("account accountu hesap no: " + account.getAccountNo());
		System.out.println("account2 accountu hesap no: " + account2.getAccountNo());
		System.out.println();
		accountManager.accountDetails(sinem);
		accountManager.accountDetails(account);
		accountManager.accountDetails(account2);
		
		System.out.println("- - - - - - -");
//		System.out.println("bakiye: " + account2.getMoney());
//		userManager.krediBasvurusundaBulun(account2, 3000);
//		adminManager.krediBasvurusunuOnayla(user2);
//		accountManager.accountDetails(account2);
//		
//		userManager.krediBorcunuOde(account2, 100);
//		userManager.krediBorcunuOde(account2, 500);
//		userManager.krediBorcunuOde(account2, 5000);
//		System.out.println("Kredi borcu: " + account2.getKrediBorcu());
//		userManager.krediBorcunuOde(account2, 100);
//		userManager.krediBorcunuOde(account2, 2300);
//		System.out.println("Kredi borcu: " + account2.getKrediBorcu());
		
		System.out.println("- - - - - - -");
		accountManager.accountDetails(account2);
		userManager.krediBasvurusundaBulun(account2, 5000);
		adminManager.krediBasvurusunuOnayla(user2);
		accountManager.accountDetails(account2);
		System.out.println("* * * *");
		userManager.hesaptanKrediBorcunuOde(account2, 500);
		userManager.hesaptanKrediBorcunuOde(account2, 300);
		userManager.hesaptanKrediBorcunuOde(account2, 10);
	//	userManager.hesaptanKrediBorcunuOde(account2, 6000);
		userManager.hesaptanKrediBorcunuOde(account2, 20);
		userManager.hesaptanKrediBorcunuOde(account2, 30);
		
		userManager.nakitAvansCek(account2);
		
		userManager.nakitAvansCek2(account2, 100);
		
		
	}

}
