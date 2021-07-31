
import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class Part1Test {
    
    @Test
    void testFindSimpleGeneSequence() {
        Part1 obj = new Part1();

        String dna = "AATGTTTTAA";
       
        String expected = "ATGTTTTAA";
        

        Assert.assertEquals(expected, obj.findSimpleGeneSequence(dna));

       
    }

    @Test
    void testNoStartCodon(){
        String dna2 = "AATTCTCTTTTTTTCTCTAA";
            String exp = "Start Codon not Found";
        Part1 obj2 = new Part1();
        Assert.assertEquals(exp, obj2.findSimpleGeneSequence(dna2));
    }

    @Test
    void testNoStopCodon() {
        String dna2 = "AATGCTCTCTTTTTTTCTCT";
        String exp = "Stop Codon not Found";
        Part1 obj2 = new Part1();
        Assert.assertEquals(exp, obj2.findSimpleGeneSequence(dna2));
    }

    @Test
    void testInvalidGenome() {
        String dna2 = "AATGTCTCTTTTTTTCTCTAA";
        String exp = "INAVALID GENOME SEQUENCE";
        Part1 obj2 = new Part1();
        Assert.assertEquals(exp, obj2.findSimpleGeneSequence(dna2));
    }
}
