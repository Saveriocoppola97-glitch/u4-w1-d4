package entities;

public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(4, 12);
        Rettangolo r2 = new Rettangolo(7,15);
        stampa(r1);
        stampa(r2);
    }

    public static void stampa(Rettangolo r) {
        System.out.println("Area: " + r.calcolaArea());
        System.out.println("Perimetro: " + r.calcolaPerimetro());
    }
}