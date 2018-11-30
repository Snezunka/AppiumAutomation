import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int expectedResult =14;
        int actualResult = mainClass.getLocalNumber();
        Assert.assertEquals("Actual result " + actualResult + " is NOT equal expected " + expectedResult, actualResult, expectedResult);
    }
}