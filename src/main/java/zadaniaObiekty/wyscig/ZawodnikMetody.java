package zadaniaObiekty.wyscig;

import java.util.Random;

public class ZawodnikMetody {
    protected void przedstawSie(Zawodnik zawodnik){
        System.out.println("Nazywam sie " + zawodnik.imie + " biegam" +
                " z predkoscia od " + zawodnik.predkoscMinimalna +
                " km/h, do " + zawodnik.predkoscMaksymalna + " km/h" );
    }
    protected void biegnij(Zawodnik zawodnik){
        Random random = new Random();
        zawodnik.pokonanaOdleglosc += zawodnik.predkoscMinimalna + (zawodnik.predkoscMaksymalna - zawodnik.predkoscMinimalna) * random.nextDouble();
        System.out.println(zawodnik.imie + " przebiegl " + String.format("%.2f",zawodnik.pokonanaOdleglosc));
    }

}
