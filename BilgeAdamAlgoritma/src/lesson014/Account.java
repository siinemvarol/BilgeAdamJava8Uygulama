package lesson014;

import java.util.Random;

public class Account {

	private String accountNo;
	private int money;
	private boolean krediBasvurusu;
	private int istenenKredi;
	private boolean krediAlindiMi;
	private int krediBorcu;
	private int krediNotu;
	
	private boolean krediBorcuOdendiMi;
	private int nakitAvans;

	public Account() {
		this.accountNo = randomAccountNo();
	}

	public Account(int money) {
		super();
		this.accountNo = randomAccountNo();
		this.money = money;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public int getIstenenKredi() {
		return istenenKredi;
	}

	public void setIstenenKredi(int istenenKrediMiktari) {
		this.istenenKredi = istenenKrediMiktari;
	}

	public boolean isKrediAlindiMi() {
		return krediAlindiMi;
	}

	public void setKrediAlindiMi(boolean krediAlindiMi) {
		this.krediAlindiMi = krediAlindiMi;
	}

	public int getKrediBorcu() {
		return krediBorcu;
	}

	public void setKrediBorcu(int krediBorcu) {
		this.krediBorcu = krediBorcu;
	}

	public int getKrediNotu() {
		return krediNotu;
	}

	public void setKrediNotu(int krediNotu) {
		this.krediNotu = krediNotu;
	}
		

	public boolean isKrediBorcuOdendiMi() {
		return krediBorcuOdendiMi;
	}

	public void setKrediBorcuOdendiMi(boolean krediBorcuOdendiMi) {
		this.krediBorcuOdendiMi = krediBorcuOdendiMi;
	}

	public int getNakitAvans() {
		return nakitAvans;
	}

	public void setNakitAvans(int nakitAvans) {
		this.nakitAvans = nakitAvans;
	}

	public void depositMoney(int money) {

		if (money > 0 && money <= 10000) {
			this.setMoney(this.getMoney() + money);
			System.out.println(money + " TL hesabınıza yatırıldı. Hesap bakiyesi: " + this.getMoney());
		} else {
			System.err.println("Sadece 1 TL - 10.000 TL yatırabilirsiiz.");
		}

	}

	public void withdrawMoney(int money) {

		if (money <= this.getMoney()) {
			this.setMoney(this.getMoney() - money);
			System.out.println(money + " TL hesabınızdan çekildi. Hesap bakiyesi: " + this.getMoney());
		} else {
			System.err.println("Hesap bakiyeniz yeterli değildir");
		}
	}

	private String randomAccountNo() {
		Random random = new Random();
		Long sayi = random.nextLong(1000, 5000);
		String accountNo = String.valueOf(sayi);
		return accountNo;
	}

}
