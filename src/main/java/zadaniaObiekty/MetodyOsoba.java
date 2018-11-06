package zadaniaObiekty;

public class MetodyOsoba {
    protected void przedstawSie(Osoba osoba){
        System.out.println("Czesc, mam na imie " + osoba.imie + " i mam " + (2018 - osoba.rokUrodzenia) + " lat.");
    }
}
