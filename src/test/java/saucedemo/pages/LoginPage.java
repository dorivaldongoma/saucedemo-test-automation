package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import saucedemo.core.BasePage;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginPage goToLoginPage(){
        navegador.get("https://saucedemo.com");

        return new LoginPage(navegador);
    }
    public ProductsPage login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        return new ProductsPage(navegador);
    }
}
