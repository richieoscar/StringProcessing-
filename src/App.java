public class App {
    public static void main(String[] args) throws Exception {

    Part1 obj = new Part1();
   String g = obj.findSimpleGeneSequence("CCCCATGCTTACTTAACCT");
        System.out.println("Gene = " +g);

        String dna = "ATDTTATgTGTCTDTDATAATGHD";
        String startCondon = "ATG";
        String stopCodon = "TAA";
        Part2 ob = new Part2();
        String gene = ob.findSimpleGeneSequence(dna, startCondon, stopCodon);
        System.out.println("Gene = " + gene);

        Part3 obj2 = new Part3();
       boolean ans = obj2.twoOccurence("y", "buzzzzzymmmy");
       System.out.println(ans);
       String last = obj2.lastPart("e", "orangapple");
       System.out.println(last);

       String r = obj2.reverseString("abcde");
       System.out.println(r);
    }

    
}
