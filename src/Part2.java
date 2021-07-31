public class Part2 {
    // DNA SEQUENCING
    private static final String START_CODON = "ATG";
    private static final String STOP_CODON = "TAA";

    public String findSimpleGeneSequence(String dna, String startCodon, String stopCodo) {

        String result = "";
        if (isUpperCase(dna)) {
            result = upperCaseDNA(dna);
        }
        if (!isUpperCase(dna)) {
            result = lowerCaseDna(dna);
        }

        return result;
    }

    public boolean isUpperCase(String dna) {

        char[] charArray = dna.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            // any chararctr ot upeer case return false
            if (!Character.isUpperCase(charArray[i])) {
                return false;
            }
        }
        return true;
    }

    public String upperCaseDNA(String dna) {
        int codon = dna.indexOf(START_CODON);
        if (codon == -1)
            return "Start Codon not Found";
        int stopCodon = dna.indexOf(STOP_CODON, codon);
        if (stopCodon == -1)
            return "Stop Codon not Found";
        String geneSequence = dna.substring(codon, stopCodon + 3);
        if (geneSequence.length() % 3 == 0) {
            return geneSequence.toUpperCase();
        } else
            return "INAVALID GENOME SEQUENCE";
    }

    public String lowerCaseDna(String d) {
        String dna = d.toLowerCase();
        int codon = dna.indexOf(START_CODON.toLowerCase());
        if (codon == -1)
            return "Start Codon not Found";
        int stopCodon = dna.indexOf(STOP_CODON.toLowerCase(), codon);
        if (stopCodon == -1)
            return "Stop Codon not Found";
        String geneSequence = dna.substring(codon, stopCodon + 3);
        if (geneSequence.length() % 3 == 0) {
            return geneSequence.toLowerCase();
        } else
            return "invalid geneome sequence";
    }
}
