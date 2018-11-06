package zadaniaObiekty;

public class Main {
    public static void main(String[] args) {
        Osoba ania = new Osoba();
        ania.imie = "Ania";
        ania.rokUrodzenia = 1993;
        Osoba andrzej = new Osoba();
        andrzej.imie = "Andrzej";
        andrzej.rokUrodzenia = 1964;
        Osoba mariola = new Osoba();
        mariola.imie = "Mariola";
        mariola.rokUrodzenia = 1950;

        MetodyOsoba metodyOsoba = new MetodyOsoba();
        metodyOsoba.przedstawSie(andrzej);
        metodyOsoba.przedstawSie(ania);
        metodyOsoba.przedstawSie(mariola);

    }
}
