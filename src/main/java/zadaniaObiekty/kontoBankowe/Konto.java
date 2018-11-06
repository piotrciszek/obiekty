package zadaniaObiekty.kontoBankowe;

public class Konto {
    protected long numerKonta;
    protected int stanKonta;
    protected int ilosc;

    public Konto(long numerKonta, int stanKonta) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}
