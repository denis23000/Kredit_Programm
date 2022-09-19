package KreditProgramm;
import java.util.Scanner;
public class Mainkredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finanzieren = true;
        boolean invistiren = true;
        System.out.println("Herzlich Willkommen. Um zu invistieren drücken Sie i, um zu finanzieren drüchen Sie f.");
        String entscheidung = scanner.nextLine();

        while (finanzieren | invistiren) {
            if (entscheidung.equalsIgnoreCase("f")) {
                System.out.println("Bitte geben Sie ihr Bertrag ein:");
                double bertragF = scanner.nextDouble();
                System.out.println("Bitte geben Sie ihr Laufzeit ein:");
                double laufzeit = scanner.nextDouble();
                Kredit.finanzieren(bertragF, laufzeit);
                scanner.nextLine();
            }
            if (entscheidung.equalsIgnoreCase("i")) {
                System.out.println("Bitte geben Sie ihr Bertrag ein:");
                double bertragI = scanner.nextDouble();
                System.out.println("Bitte geben Sie Jahre ein:");
                double jahre = scanner.nextDouble();
                Kredit.investieren(bertragI, jahre);
                scanner.nextLine();
            }

                System.out.println("Ok. Um nochmal zu invistieren drücken Sie i, um zu finanzieren drüchen Sie f. Für Exit drück mal eine andere Taste.");
                entscheidung = scanner.nextLine();
                if (entscheidung.equalsIgnoreCase("i")) {
                    invistiren = true;
                } else if (entscheidung.equalsIgnoreCase("f")) {
                    finanzieren = true;
                } else   {
                    invistiren = false;
                    finanzieren = false;
                    System.out.println("Auf Wiedersehen");
                }

                }

            }
        }





