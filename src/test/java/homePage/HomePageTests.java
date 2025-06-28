package homePage;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTests {
    @Test
    public void testHasABTestingLink(){
        WebElement abTestingLink = homePage.getABTestingLink();
        assertTrue(abTestingLink.isDisplayed(), "A/B Testing link should be visible.");
    }

    @Test
    public void testHasAddRemoveElementsLink(){
        WebElement addRemoveElementsLink = homePage.getAddRemoveElementsLink();
        assertTrue(addRemoveElementsLink.isDisplayed(), "Add/Remove Elements link should be visible.");
    }
}
