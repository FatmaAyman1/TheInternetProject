package wait;

import org.testng.annotations.Test;
import theInternet.BaseTest;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "incorrect loaded text");
    }
}
