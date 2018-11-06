package zadaniaObiekty.wyscig;

public class Zawodnik {
    protected String imie;
    protected Long identyfikator;
    protected double predkoscMinimalna;
    protected double predkoscMaksymalna;
    protected double pokonanaOdleglosc = 0;

    public Zawodnik(String imie, double predkoscMinimalna, double predkoscMaksymalna) {
        this.imie = imie;
        this.predkoscMinimalna = predkoscMinimalna;
        this.predkoscMaksymalna = predkoscMaksymalna;
    }
}
