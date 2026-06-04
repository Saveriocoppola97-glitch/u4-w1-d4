package esercizio2;

public class Chiamata {

    public int durata;
    public String numeroChiamato;

    public Chiamata(int durata, String numeroChiamato) {
        this.durata = durata; // Corretto: prima c'era 'duration'
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setNumeroChiamato(String numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }
}
