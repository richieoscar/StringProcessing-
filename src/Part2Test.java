import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Part2Test {

    private static final String START_CODON = "ATG";
    private static final String STOP_CODON = "TAA";

    @Test
    void testFindSimpleGeneSequence() {
       String dna = "ATTTTATGTTTTATTAATT";
        //String dna2 = "ATTTTatgTTTTATTAATT";
        String expected = "ATGTTTTATTAA";
       // String expected2 = "atgttttattaa";
        Part2 obj = new Part2();
        assertEquals(expected,obj.findSimpleGeneSequence(dna, START_CODON, STOP_CODON));  
    }

    @Test
    void testIsUpperCase() {
        String dna = "ATTTTATGTTTTTTAATT";
        Part2 obj = new Part2();
        assertTrue(obj.isUpperCase(dna));
    }

    @Test
    void testLowerCaseDna(){
        String dna = "ATTTTATGTTTTATTAATT".toLowerCase();
        String expected = "ATGTTTTATTAA".toLowerCase();
        Part2 obj = new Part2();
        assertEquals(expected, obj.lowerCaseDna(dna));
    }

    @Test
    void upperCaseDna(){
        String dna = "ATTTTATGTTTTATTAATT";
        String expected = "ATGTTTTATTAA";
        Part2 obj = new Part2();
        assertEquals(expected, obj.upperCaseDNA(dna));
    }
}
