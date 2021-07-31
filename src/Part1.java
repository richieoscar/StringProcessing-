public class Part1{

    // DNA SEQUENCING
    private static final String START_CODON = "ATG";
    private static final String STOP_CODON = "TAA";

    public String findSimpleGeneSequence(String dna) {
        int codon = dna.indexOf(START_CODON);
        if (codon == -1)
            return "Start Codon not Found";
        int stopCodon = dna.indexOf(STOP_CODON, codon);
        if (stopCodon == -1)
            return "Stop Codon not Found";
        String geneSequence = dna.substring(codon, stopCodon + 3);
        if (geneSequence.length() % 3 == 0)
            return geneSequence;
        else
            return "INAVALID GENOME SEQUENCE";

    }

}