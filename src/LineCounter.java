import java.util.Scanner;

//Del 2

public class LineCounter { //Jag har döpt Class till LineCounter

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //För att jag har import Scanner så måste det här alltid finnas med för att läsa in

        int totalChars = 0; //Jag använder mig av int för jag vill ha heltal utskrivet av programmet o inte double med decimal
        int totalLines = 0;//koll på rader och totalChars har koll på antal tecken

        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                //När stop skrivs så avslutas loopen och resultat av hur många rader o tecken som finns skrivs ut
                System.out.println("Du har skrivit såhär många rader: " + totalLines);
                System.out.println("Som innehåller såhär många tecken: " + totalChars);
                return;
            }
            totalChars += line.length();
            totalLines++; //Varje gång en rad läses in(förutom stop), så ökar räknaren med 1.
        }


    }
}