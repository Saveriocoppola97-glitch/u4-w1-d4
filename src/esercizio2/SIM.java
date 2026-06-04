package esercizio2;

public class SIM {

    private String numeroTelefono;
    private double credito;
    private Chiamata[] listaChiamate;

    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.listaChiamate = new Chiamata[5];
    }

    public void setListaChiamate(Chiamata[] listaChiamate) {
        this.listaChiamate = listaChiamate;
    }

    public void stampaDati() {

        System.out.println("Numero: " + numeroTelefono);
        System.out.println("Credito: " + credito + " euro");

        System.out.println("\nUltime chiamate:");

        for (int i = 0; i < listaChiamate.length; i++) {

            if (listaChiamate[i] != null) {

                System.out.println(
                        "Numero chiamato: " +
                                listaChiamate[i].getNumeroChiamato() +
                                " - Durata: " +
                                listaChiamate[i].getDurata() +
                                " minuti"
                );
            }
        }
    }
}