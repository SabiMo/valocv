package fr.codebusters.valocb;

/**
 * Point d'entrée de l'application.
 */
public class Main {

    /**
     * Méthode qui lance l'application.
     *
     * @param args Arguments de la ligne de commande.
     */
    public static void main(String[] args) {
        double conversionRate = ForexService.getInstance().getConversionRate("USD");
        System.out.println("Taux de conversion USD -> EUR : " + conversionRate);
    }
}
