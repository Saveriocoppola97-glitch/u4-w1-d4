package esercizio2;

public class Main {
    public static void main(String[] args) {

        SIM sim = new SIM("3384837492");

        Chiamata[] chiamate = new Chiamata[5];

        chiamate[0] = new Chiamata(3, "3474823974");
        chiamate[1] = new Chiamata(29, "3284709684");
        chiamate[2] = new Chiamata(5, "2364872084");
        chiamate[3] = new Chiamata(1, "3936490234");
        chiamate[4] = new Chiamata(47, "3233729504");

        sim.setListaChiamate(chiamate);

        sim.stampaDati();
    }
}