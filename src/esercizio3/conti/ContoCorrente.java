package esercizio3.conti;

public class ContoCorrente {
    protected String titolare;
    protected int nMovimenti;
    protected final int maxMovimenti = 50;
    protected double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (x > saldo){
            saldo = 0;
        }
        if (saldo <= 0) throw new BancaException("Il conto è in rosso");
        else if (nMovimenti < maxMovimenti) saldo = saldo - x;
        else saldo = saldo - x - 0.50;

        nMovimenti++;
    }
    public void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Num movimenti: " + nMovimenti
                + " - Massimo movimenti: " + maxMovimenti);
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
