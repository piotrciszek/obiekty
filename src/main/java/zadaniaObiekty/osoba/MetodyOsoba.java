package zadaniaObiekty.osoba;

public class MetodyOsoba {
    protected void przedstawSie(Osoba osoba){
        System.out.println("Czesc, mam na imie " + osoba.imie + " i mam " + (2018 - osoba.rokUrodzenia) + " lat.");
    }
    protected void wszystkieOsoby(Osoba[] osoby){
        for (Osoba z : osoby){
            przedstawSie(z);
        }
    }
    protected void tylkoPanie(Osoba[] osoby){
        for (Osoba z : osoby) {
            if (z.imie.endsWith("a")){
                przedstawSie(z);
            }
        }
    }
    protected void tylkoPanowie(Osoba[] osoby){
        for (Osoba z: osoby){
            if (!z.imie.endsWith("a")){
                przedstawSie(z);
            }
        }
    }
}
