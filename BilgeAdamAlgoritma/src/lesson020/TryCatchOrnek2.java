package lesson020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek2 {

	public static void elemaniGetir(String[] array) {
		int index = 0;
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Indexi girin: ");
			index = scanner.nextInt();
			System.out.println(array[index]);

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(Constant.OUT_OF_INDEX);
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println(Constant.MISMATCH_EXCEPTION);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(Constant.UNEXPECTED_EXCEPTION);
		}

	}

	public static void sum(String[] array) {
		int toplam = 0;
		int hataToplam = 0;

		for (String string : array) {
			try {
				toplam += Integer.valueOf(string);
			} catch (Exception e) {
				System.out.println(e);
				hataToplam++;
			}
		}
		System.out.println("Array sayıların toplamı: " + toplam + " - Hatalı İşlemler: " + hataToplam);
	}

	public static void nullHatasi(String[] array) {
			try {
				for (String string : array) {
		//			System.out.println(string);
					if (string == null) {
						throw new NullPointerException();
					}
				}
			} catch (NullPointerException e) {
				e.printStackTrace();
				System.out.println("Null pointer exception..");
			}
			
		}
	
	public static String nullCheck(String string) throws NullPointerCheck {
		
		if (string == null) {
			throw new NullPointerCheck("null check metodundan gelen hata açıklaması");
		}
		return string;
	}
	
	public static void sum3(String[] array) {
		int toplam = 0;
		int hataToplam = 0;

		for (String string : array) {
			try {

				nullCheck(string);
				toplam += Integer.valueOf((string));
			} catch (NullPointerCheck e) {
				System.out.println(e.getMesaj());
				hataToplam++;
			}
			catch (Exception e) {
				System.out.println(e);
				hataToplam++;
			}
		}
		System.out.println("Array sayıların toplamı: " + toplam + " - Hatalı İşlemler: " + hataToplam);
	}
	
	

	public static void main(String[] args) {

		String[] array = { "6", "10", "bc", null, "20" };

		// elemaniGetir(array);
		// Parametre olarak array alan ve girdiğimiz değere karşılık gelen indexi
		// getiren bir metod yazalım

		// Array içinde gezelim, sayısal değerleri int'e çevirip toplayalım
		// döngü sonunda sayıların toplamını ve toplam hata sayısını yazdıralım

		// null hatasını yönetelim, arrayde null değer gelirse NullPointer fırlatalım
		
		//NullPointerCheck sınıfı oluşturalım. hata durumunda bu sınıftan hata fırlatalım

		elemaniGetir(array);
		sum(array);
		nullHatasi(array);
		
		System.out.println("- - - - -");
		
		try {
			sum3(array);
		} catch (Exception e) {
			
		}
		
		
		System.out.println("\nmain son satır çalışıyor");

	}

}
