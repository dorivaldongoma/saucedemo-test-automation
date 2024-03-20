package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import saucedemo.core.BaseClass;

public class ProductsClass extends BaseClass {
    private WebDriver navegador;
    public ProductsClass(WebDriver navegador) {
        this.navegador = navegador;
        PageFactory.initElements(navegador, this);
    }

    @FindBy(className = "app_logo")
    private WebElement validationText;

    public String pegarTextoDeValidacao(){
        return validationText.getText();
    }
}
