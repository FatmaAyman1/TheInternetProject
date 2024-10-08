package dropdown;

import org.testng.annotations.Test;
import theInternet.BaseTest;
import static org.testng.Assert.*;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectedOption(){
        var dropdownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
