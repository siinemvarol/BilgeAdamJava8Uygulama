package lesson001;

import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		
		//kenarları girilen üçgenin nasıl bir üçgen olduğunu bulan program
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Üçgenin birinci kenarını girin: ");
		int kenar1 = scanner.nextInt();
		
		System.out.println("Üçgenin ikinci kenarını girin: ");
		int kenar2 = scanner.nextInt();
		
		System.out.println("Üçgenin üçüncü kenarını girin: ");
		int kenar3 = scanner.nextInt();
		
		if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {
		
			if (kenar1 == kenar2 && kenar1 == kenar3) {
			System.out.println("Kenarları girilen üçgen eşkenar üçgendir.");
			}
			else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
			System.out.println("Kenarları girilen üçgen ikizkenar üçgendir.");
			}
			else System.out.println("Kenarları girilen üçgen çeşitkenar üçgendir.");
		
			}
		else System.out.println("üçgen oluşmaz, girilen sayılar sıfırdan büyük olmalıdır");
		
		
	}

}
