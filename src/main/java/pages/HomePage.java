package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getABTestingLink(){
        return driver.findElement(By.linkText("A/B Testing"));
    }

    public WebElement getAddRemoveElementsLink(){
        return driver.findElement(By.linkText("Add/Remove Elements"));
    }

    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}