package zadaniaObiekty.kontoBankowe;

public class Main {
    public static void main(String[] args) {
        Konto konto = new Konto(21321321, 100);
        MetodyKonto metodyKonto = new MetodyKonto();
        metodyKonto.wyswietlStanKonta(konto);
        metodyKonto.wplacSrodki(konto);
        metodyKonto.wyswietlStanKonta(konto);
        metodyKonto.wyplacSrodki(konto);
        metodyKonto.wyswietlStanKonta(konto);
    }
}
