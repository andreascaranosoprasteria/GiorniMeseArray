package com.soprasteria;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 * Esercizio: calcolo giorni del mese con vettore
			Nome repo: GiorniMeseArray
			Provate a rifare l'esercizio di ieri che calcola i giorni del mese, utilizzando un array:
			L'utente inserisce il numero del mese (es. 3 per marzo), il programma visualizza il nome del mese e il numero di giorni di quel mese.
			Suggerimento: utilizzate due array
		 */
		String[] mesi = {"gen","feb","mar","apr","giu","lug","ago","set","ott","nov","dic"};
		
		int[] numMesi = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		System.out.println("Inserisci il numero del mese");
		int indice = sc.nextInt();
		System.out.println("Mese -->"+mesi[indice-1]+"\t");
		if((indice == 1)||(indice == 3)||(indice == 5)||(indice == 7)||(indice == 8)||(indice == 10)||(indice == 12) )System.out.println("Giorni -->31");
		else if((indice == 4)||(indice == 6)||(indice == 11))System.out.println("Giorni--> 30");
		else if(indice == 2)System.out.println("Giorni -->28/29");
		else System.out.println("Non valido");
		
	}

}
