package lesson020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {
	
	// bir tane bölme metodu yazalım kullanıcıdan 2 tane sayı alacağız
	// bölümü return edeceğiz. yaparken gerekli hatalara karşı önlem alalım
	
	// kullanıcı doğru girdi girene kadar kullanıcıdan girdi alalım
	
	public static double bolme() throws Exception {
		boolean condition = true;
		double bolum = 0;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Bölünen sayıyı girin: ");
			double bolunen = scanner.nextInt();
			System.out.println("Bölen sayıyı girin: ");
			double bolen = scanner.nextInt();
			try {
				bolum = bolunen / bolen;
				condition = false;
		//		System.out.println("Bölüm: " + bolum);
			} catch (ArithmeticException e) {
				e.printStackTrace();
				
				System.out.println(Constant.NUMBER_EQUALS_ZERO);
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(Constant.MISMATCH_EXCEPTION);
			} catch (Exception e) {
				System.out.println(Constant.UNEXPECTED_EXCEPTION);
			}
			if (bolen == 0) {
				throw new Exception("Bölen 0 olamaz");
			}
			
		} while (condition);
		
		return bolum;
		
	}
	
	public static void main(String[] args) {
		try {
			bolme();
		} catch (IllegalArgumentException e) {
			System.out.println(Constant.ILLEGAL_ARGUMENT);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(Constant.UNEXPECTED_EXCEPTION);
			e.printStackTrace();
		}
		
		
		
	}

}
