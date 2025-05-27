import java.util.Scanner;

//Del2 fortsättning

//Den här Class ska läsa in text från användaren och skriva ut resultatet
public class TextReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextStats stats = new TextStats(); // Skapar statistik-objekt

        while (true) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("stop")) {
                break; // Avsluta loopen om användaren skriver "stop"
            }

            stats.addLine(line); //Den här metoden hjälper skicka varje rad som skrivs till TextStats
        }

        // Skriv ut resultat
        System.out.println("Du har skrivit såhär många rader: " + stats.getTotalLines());
        System.out.println("Som innehåller såhär många tecken: " + stats.getTotalChars());
    }

}
