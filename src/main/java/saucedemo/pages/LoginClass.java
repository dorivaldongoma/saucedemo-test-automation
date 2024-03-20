package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import saucedemo.core.BaseClass;

public class LoginClass extends BaseClass {
    private WebDriver navegador;
    public LoginClass(WebDriver navegador) {
        this.navegador = navegador;
        PageFactory.initElements(navegador, this);
    }
    public static String csvComDadosDeLogin = System.getProperty("user.dir")+"/src/main/java/saucedemo/testData/csv/login.csv";

    @FindBy(id = "user-name")
    private WebElement campoUsuario;
    @FindBy(id = "password")
    private WebElement campoSenha;
    @FindBy(id = "login-button")
    private WebElement botaoDeLogin;

    public LoginClass navegarParaAPaginaDeLogin(){
        gestorDoNavegador.openURL("https://saucedemo.com");

        return new LoginClass(navegador);
    }
    public ProductsClass login(String[] dadosDeLogin){
        campoUsuario.sendKeys(dadosDeLogin[0]);
        campoSenha.sendKeys(dadosDeLogin[1]);
        botaoDeLogin.click();

        return new ProductsClass(navegador);
    }
}