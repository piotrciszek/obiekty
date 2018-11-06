package zadaniaObiekty.kontoBankowe;

import java.util.Scanner;

public class MetodyKonto {
    Scanner scanner = new Scanner(System.in);
    protected void wyswietlStanKonta(Konto konto){

        System.out.println("Aktualny stan konta - " + konto.stanKonta);
    }
    protected void wplacSrodki(Konto konto){
        System.out.println("Ile chcesz wplacic");
        konto.ilosc = scanner.nextInt();
        konto.stanKonta += konto.ilosc;
    }
    protected void wyplacSrodki(Konto konto){
        System.out.println("Ile chcesz wyplacic");
        konto.ilosc = scanner.nextInt();
        if (konto.ilosc > konto.stanKonta){
            System.out.println("Brak wystarczajacych srodkow");
        } else {
            konto.stanKonta -= konto.ilosc;
        }
    }
}
