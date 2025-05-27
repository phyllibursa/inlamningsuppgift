import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Del2 fortsättning, den här ska versionhanteras

public class TextStatsTest {
    //Jag kommer behöva ha med 3 st testfall här. Som märkvärdigt skiljs åt från varandra.

    @Test
    public void testOnlySpaces() {
        TextStats stats = new TextStats();
        stats.addLine("     "); //Testar en rad där man bara lägger mellanslag utan text
        assertEquals(1, stats.getTotalLines());
        assertEquals(5, stats.getTotalChars());
    }


    @Test
    public void testSpecialCharacters() {
        TextStats stats = new TextStats();
        stats.addLine("!@#€%&");//Testar en rad som innehåller olika specialtecken
        assertEquals(1, stats.getTotalLines());
        assertEquals(6, stats.getTotalChars());
    }

    @Test
    public void testEmptyLine() {
        TextStats stats = new TextStats();
        stats.addLine(""); //Testar en rad där det är bara en tom rad, varken text eller mellanslag
        assertEquals(1, stats.getTotalLines());
        assertEquals(0, stats.getTotalChars());
    }

    }
