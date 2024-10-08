package hover;

import org.testng.annotations.Test;
import theInternet.BaseTest;

import static org.testng.Assert.*;

public class HoverTests extends BaseTest {
    @Test
    public void testHoverUser1(){
        var hoverPage= homePage.clickHovers();
        var caption = hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1", "Title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
