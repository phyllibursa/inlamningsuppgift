
//Del2 fortsättning

public class TextStats {
    //Den här håller koll på antal rader och tecken
    private int totalLines = 0;
    private int totalChars = 0;
    private int totalWords = 0;
    private String LongestWord = "";
    private boolean containsStopWord = false;

    public void addLine(String line) {
        totalLines++;
        totalChars += line.length();

        String[] words = line.trim().split("\\s+"); // Dela upp på mellanslag

        for (String word : words) {
            if (!word.isEmpty()) {
                totalWords++;
                if (word.length() > LongestWord.length()) {
                    LongestWord = word;
                }
                if(word.equalsIgnoreCase("stop")) {
                    containsStopWord = true;
                }
            }
        }
    }

            public int getTotalLines () {
                return totalLines;
            }

            public int getTotalChars () {
                return totalChars;

            }
            public int getTotalWords () {

            return totalWords;
        }

        public String getLongestWord () {
            return LongestWord;

        }
    }
// En annan klass som:
//Räknar raderna, antal tecken och antal ord
//Har koll på det längsta ordet
//Har koll på om användaren har skrivit ordet stop eller inte

