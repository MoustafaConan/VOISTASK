package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleSecondPage extends PageBase{
    public GoogleSecondPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "g")
    List<WebElement> results;

    @FindBy(linkText = "3")
    WebElement page3;


    public int CountResultsPage2()
    {
        return results.size();
    }


    public void navigateToPage3(){
        page3.click();
    }
}
