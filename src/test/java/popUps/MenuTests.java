package popUps;

import org.testng.annotations.Test;
import theInternet.BaseTest;

import static org.testng.Assert.assertEquals;

public class MenuTests extends BaseTest {
    @Test
    public void testRightClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInBox();
        String message = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(message,"You selected a context menu", "incorrect popup message");
    }
}
