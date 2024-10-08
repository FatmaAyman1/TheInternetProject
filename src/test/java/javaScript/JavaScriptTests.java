package javaScript;

import org.testng.annotations.Test;
import theInternet.BaseTest;

public class JavaScriptTests extends BaseTest {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }
    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
