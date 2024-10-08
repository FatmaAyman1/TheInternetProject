package sliders;

import org.testng.annotations.Test;
import theInternet.BaseTest;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTest {
    @Test
    public void testSlideToWholeNumber(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSliderValue(value);
        assertEquals(sliderPage.getSliderValue(),value,"incorrect slider value");
    }
}
