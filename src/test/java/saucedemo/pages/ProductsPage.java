package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import saucedemo.core.BasePage;

public class ProductsPage extends BasePage {
    @FindBy(className = "app_logo")
    private WebElement validationText;
    public ProductsPage(WebDriver navegador) {
        super(navegador);
    }

    public String getValidationText(){
        return validationText.getText();
    }
}
