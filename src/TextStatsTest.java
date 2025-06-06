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

@Test
    public void testWordCountAndLongestWord() {
        TextStats stats = new TextStats();
        stats.addLine("Vilket är världens svåraste ord?");
        assertEquals(1, stats.getTotalLines());
        assertEquals(5, stats.getTotalWords());
        assertEquals("världens", stats.getLongestWord());
    }
@Test
    public void testSwedishChar() {
        TextStats stats = new TextStats();
        stats.addLine("Smörgåstårta älskas likaså blåbärstårta");
        assertEquals(1, stats.getTotalLines());
        assertEquals(39, stats.getTotalChars());
        assertEquals(4, stats.getTotalWords());
        assertEquals("Smörgåstårta", stats.getLongestWord());

}
    }
