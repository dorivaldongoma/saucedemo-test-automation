package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import saucedemo.core.BasePage;

public class LoginPage extends BasePage {

    public By usernameInputLocalizer = By.id("user-name");
    public By passwordInputLocalizer = By.id("password");
    public By loginButtonLocalizer = By.id("login-button");

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public void goToLoginPage(){
        navegador.get("https://saucedemo.com");
    }
    public void login(String username, String password){
        navegador.findElement(usernameInputLocalizer).sendKeys(username);
        navegador.findElement(passwordInputLocalizer).sendKeys(password);
        navegador.findElement(loginButtonLocalizer).click();
    }
}
