package lesson006;

import java.util.Iterator;

public class Question49 {

	public static void main(String[] args) {
		// matristeki tek sayıları farklı bir arrayin içine atalım
		
		int[][] matris = { { 56, 23, 678, 231, 5 },
							{ 234, 21, 78, 26, 6 },
							{ 654, 33, 32, 67, 2 },
							{ 189, 35, 56, 89, 8 } };

		// Alternatif 1
		int[][] tekSayilar = new int [4][5];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j]%2 == 1) {
					tekSayilar[i][j] = matris [i][j];
				}
			}
			
		}
		System.out.println("Tek sayılar arrayi: ");
		for (int i = 0; i < tekSayilar.length; i++) {
			for (int j = 0; j < tekSayilar[i].length; j++) {
				System.out.print(tekSayilar[i][j] + "     ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("\n-----------------\n");
		
		// Alternatif 2
		
		int [] tekSayilar2 = new int [matris.length * matris[0].length];
		
		for (int k = 0; k < matris.length; k++) {
			for (int l = 0; l < matris[k].length; l++) {
				if (matris[k][l]%2 == 1) {
				tekSayilar2[k] = matris [k][l];
				System.out.println(tekSayilar2[k] + " ");
			}
		}
		
	}
	
	}

}
