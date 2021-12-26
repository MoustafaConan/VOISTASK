package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleThirdPage extends PageBase{
    public GoogleThirdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "g")
    List<WebElement> results;

    public int CountResultsPage3()
    {
        return results.size();
    }
}
