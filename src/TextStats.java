
//Del2 fortsättning

public class TextStats {
//Den här håller koll på antal rader och tecken
    private int totalLines = 0;
    private int totalChars = 0;

    public void addLine(String line) {
        totalLines++;
        totalChars += line.length();
    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalChars() {
        return totalChars;
    }

}
