package esercizio3;

import esercizio3.conti.BancaException;
import esercizio3.conti.ContoCorrente;
import esercizio3.conti.ContoOnLine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Mario Rossi", 500);
        ContoOnLine contoOnLine = new ContoOnLine("Maria Neri",1000, 500);

        Scanner scn = new Scanner(System.in);

        do try{
            conto.stampaSaldo();
            System.out.println("Quanto vuoi prelevare?");
            conto.preleva(Double.parseDouble(scn.nextLine()));
        }catch (BancaException e){
            System.out.println(e.getMessage());

        }catch (Exception e){
            System.out.println("Errore nel tipo");
            break;
        } while (true);

        do try{
            contoOnLine.stampaSaldo();
            System.out.println("Quanto vuoi prelevare?");
            contoOnLine.preleva(Double.parseDouble(scn.nextLine()));
        }catch (BancaException e){
            System.out.println(e.getMessage());

        }catch (Exception e){
            System.out.println("Errore nel tipo");
            break;
        } while (true);
    }
}
