package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleFirstPage extends PageBase{

    public GoogleFirstPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name="q")
    WebElement searchInput;

    @FindBy(linkText = "2")
    WebElement page2;

   public void Search(String searchText){
        searchInput.sendKeys(searchText);
        searchInput.submit();
    }

    public void navigateToPage2(){
       page2.click();
    }
}
