package alerts;

import org.testng.annotations.Test;
import theInternet.BaseTest;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("D:/web automation project/WebAutomationProject/resources/chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe","incorrect uploaded file");
    }
}
