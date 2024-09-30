package esercizio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrInt = new int[5];
        int memScelta = 0;
        int scelta = -3;
        int nuovoValore =0;
        Scanner scn = new Scanner(System.in);
        do try {
            System.out.println("Quale posizione vuoi modificare? 0 per uscire");
            for (int i = 0; i < arrInt.length; i++) {
                arrInt[i] = (int) Math.floor(1 + Math.random() * 10);
                System.out.println(i+1 + ")" + arrInt[i]);
            }
            scelta = Integer.parseInt(scn.nextLine());
            if (scelta == 0) {
                System.out.println("Uscita...");
            }
            else if (scelta < 1 || scelta > 5){
                System.out.println("Scelta non accettabile");
            }

            else {
                do try{
                    System.out.println("Inserisci un nuovo valore tra 1 e 10");
                    nuovoValore = Integer.parseInt(scn.nextLine());
                    if(nuovoValore < 1 || nuovoValore > 10){
                        System.out.println("SBAGLIATO!");
                    }
                    else {
                        memScelta = scelta - 1;
                        scelta = 0;
                    }
                } catch (Exception e) {
                    System.out.println("Valore non valido");
                }
                 while (nuovoValore < 1 || nuovoValore > 10);
            }
        }
        catch (Exception e){
            System.out.println("Tipo di dato non valido");
        } while (scelta != 0);

        if (nuovoValore > 0 && nuovoValore <=10){
            System.out.println("Nuovo Array modificato");
            for (int i = 0; i < arrInt.length; i++) {
                if(memScelta == i){
                    arrInt[i] = nuovoValore;
                }
                System.out.println(arrInt[i]);

            }
        }

    }
}
