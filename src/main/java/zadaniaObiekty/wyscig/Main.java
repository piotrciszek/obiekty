package zadaniaObiekty.wyscig;

public class Main {
    public static void main(String[] args) {
        Zawodnik adam = new Zawodnik("Adam", 9.4, 13.2);
        Zawodnik mariusz = new Zawodnik("Mariusz", 8.2, 12.9);
        Zawodnik pawel = new Zawodnik("Pawel", 7.4, 15.1);
        ZawodnikMetody zawodnikMetody = new ZawodnikMetody();

        Zawodnik[] zawodnicy = new Zawodnik[]{adam,mariusz,pawel};
        System.out.println("Przedstawienie zawodnikow");
        for (Zawodnik z : zawodnicy){
            zawodnikMetody.przedstawSie(z);
        }

        while (true){
            for (Zawodnik z : zawodnicy){
                zawodnikMetody.biegnij(z);
                if (!(z.pokonanaOdleglosc <50)){
                    System.out.println("Zawodnik " + z.imie + " wygral");
                    return;
                }
            }
        }

    }
}
