package KreditProgramm;


public class Kredit {

    public static void finanzieren (double bertragF, double laufzeit) {
        double prozent = 10;
        double monatlicherZalung = (bertragF+(bertragF*prozent/100))/laufzeit;

        System.out.println("Monatliche Zahlung ist: "+monatlicherZalung+"€");

    }



    public static void investieren (double bertragI, double jahre) {
        double ziensen = 10;


        for (int j = 1; j < jahre; j++) {
            bertragI = bertragI + (bertragI * ziensen / 100);
        }

        System.out.println("Nach " + jahre + " Jahre bekommen Sie " + bertragI + "€ zurück.");
    }
}
