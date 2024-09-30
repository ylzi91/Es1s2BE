package esercizio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Inserisci i km");
        int km = Integer.parseInt(scn.nextLine());
        int lt;
        do try {
            System.out.println("Inserisci i litri");
            lt = Integer.parseInt(scn.nextLine());
            if (lt == 0) throw new zeroExcaption(lt);
            else break;
        } catch (NumberFormatException e) {
            System.out.println("Inserisci un tipo valido");
        } while (true);

        System.out.println((double) km / (double) lt);


    }
}
