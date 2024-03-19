package saucedemo.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver navegador;

    public BasePage(WebDriver navegador){
        PageFactory.initElements(navegador, this);
        this.navegador = navegador;
    }
}