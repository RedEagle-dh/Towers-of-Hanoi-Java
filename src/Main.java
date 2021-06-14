import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Türme werden definiert
        String quelle = "A";
        String help = "B";
        String ziel = "C";
        // Eingabescanner wird initialisiert
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl der Scheiben an:\n");
        int anzahl;

        // Try Catch Verzweigung damit das Programm keinen Fehler anzeigt / Abstürzt sobald man etwas anderes als eine Zahl eingibt.
        try {
            anzahl = scanner.nextInt();
            verschieben(anzahl, quelle, ziel, help);
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben Sie nur eine Zahl ein!");
        }

    }


    // Rekursiver Algorithmus
    public static void verschieben(int scheibenAnzahl, String quelle, String ziel, String help) {
        if (scheibenAnzahl != 0) {
            verschieben(scheibenAnzahl - 1, quelle, help, ziel);
            System.out.println("Scheibe war bei " + quelle + " und ist jetzt bei " + ziel + ".");
            verschieben(scheibenAnzahl - 1, help, ziel, quelle);
        }
    }

}
