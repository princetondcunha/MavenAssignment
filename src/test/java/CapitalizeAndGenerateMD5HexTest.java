import com.smu.mscda.CapitalizeAndGenerateMD5Hex;
import org.junit.Assert;
import org.junit.Test;

public class CapitalizeAndGenerateMD5HexTest {
    private String INPUT = "smu";

    @Test
    public void testCapitalized(){
        Assert.assertEquals("Smu", CapitalizeAndGenerateMD5Hex.Capitalize(INPUT));
    }

    @Test
    public void testGenerateMD5Hex(){
        Assert.assertEquals("3773300c2f413cc7136f8d74b305519c",CapitalizeAndGenerateMD5Hex.GenerateMD5hex(INPUT));
    }
}
