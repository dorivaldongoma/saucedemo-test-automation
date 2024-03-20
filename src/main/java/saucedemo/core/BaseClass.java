package saucedemo.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tools.managers.BrowserManager;

public class BaseClass {
    protected WebDriver navegador;
    public static BrowserManager gestorDoNavegador = new BrowserManager();

    public BaseClass() {
        this.navegador = navegador;
        PageFactory.initElements(navegador, this);
    }
}