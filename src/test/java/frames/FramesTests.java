package frames;

import org.testng.annotations.Test;
import theInternet.BaseTest;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTest {
    @Test
    public void testFramesPage(){
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT","incorrect left frame text");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM", "incorrect bottom frame text");
    }
}
