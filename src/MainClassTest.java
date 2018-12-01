import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    private MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {

        int expectedResult =14;
        int actualResult = mainClass.getLocalNumber();
        Assert.assertEquals("Actual result " + actualResult + " is NOT equal expected " + expectedResult, actualResult, expectedResult);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Class number is less than 45",  mainClass.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        String actualResult = mainClass.getClassString();
        Assert.assertTrue("String is not containing word 'hello' or 'Hello'", actualResult.contains("hello") || actualResult.contains("Hello"));
    }
}