package zadaniaObiekty.osoba;

public class Main {
    public static void main(String[] args) {
        Osoba ania = new Osoba("Ania", 1993);

        Osoba andrzej = new Osoba("Andrzej", 1964);

        Osoba mariola = new Osoba("Mariola", 1950);

        Osoba tomasz = new Osoba("Tomasz", 1981);


        Osoba[] osoby = new Osoba[]{ania, andrzej, mariola, tomasz};


        MetodyOsoba metodyOsoba = new MetodyOsoba();
        metodyOsoba.przedstawSie(andrzej);
        metodyOsoba.przedstawSie(ania);
        metodyOsoba.przedstawSie(mariola);
        System.out.println("-------");
        System.out.println("Wszytskie osoby");
        metodyOsoba.wszystkieOsoby(osoby);
        System.out.println("Tylko panie");
        metodyOsoba.tylkoPanie(osoby);
        System.out.println("Tylko panowie");
        metodyOsoba.tylkoPanowie(osoby);

    }
}
