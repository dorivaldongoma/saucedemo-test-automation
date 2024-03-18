package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import saucedemo.core.BasePage;

public class ProductsPage extends BasePage {
    public By validationTextLocalizer = By.className("app_logo");
    public ProductsPage(WebDriver navegador) {
        super(navegador);
    }

    public String getValidationText(){
        return navegador.findElement(validationTextLocalizer).getText();
    }
}
