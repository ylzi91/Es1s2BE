package esercizio2;

public class zeroExcaption extends RuntimeException{
    public zeroExcaption(int num) {

            super("Il valore non può essere divibile per zero");
    }
}
