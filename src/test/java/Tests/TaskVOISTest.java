package Tests;

import Pages.GoogleFirstPage;
import Pages.GoogleSecondPage;
import Pages.GoogleThirdPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TaskVOISTest extends TestBase {

    GoogleFirstPage googleFirstPage;
    GoogleSecondPage googleSecondPage;
    GoogleThirdPage googleThirdPage;

    @Test
    public void AssertCount() throws InterruptedException {
         String URL = prop.getProperty("taskVOIS");
         String searchInput = prop.getProperty("searchData");
         driver.get(URL);

         googleFirstPage = new GoogleFirstPage(driver);
         String input = searchInput;
         googleFirstPage.Search(input);
         googleFirstPage.scroll_down();
         googleFirstPage.navigateToPage2();

         googleSecondPage = new GoogleSecondPage(driver);
         int numOfResultsPage2= googleSecondPage.CountResultsPage2();
         googleSecondPage.navigateToPage3();


         googleThirdPage= new GoogleThirdPage(driver);
         int numOfResultsPage3= googleThirdPage.CountResultsPage3();

         Assert.assertEquals(numOfResultsPage2,numOfResultsPage3);
    }
}

