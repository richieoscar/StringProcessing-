import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Part3Test {
    @Test
    void testTwoOccurence() {
        Part3 obj = new Part3();
        Assert.assertTrue(obj.twoOccurence("h", "Hlabahlhpp"));
    }

    @Test
    void testLastWord(){
        Part3 obj = new Part3();
        String exp = "oscar";
        Assert.assertEquals( exp, obj.lastPart("b", "oscar")); 
    }
}
