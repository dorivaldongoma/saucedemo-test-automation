package tools.managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import saucedemo.core.BaseClass;

public class BrowserManager extends BaseClass {
    private WebDriver navegador;

    // Método para inicializar o WebDriver com base no tipo de navegador
    public void inicializarNavegador(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                WebDriverManager.chromedriver().setup();
                navegador = new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                navegador = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                navegador = new EdgeDriver();
                break;
            default:
                //Navegador não suportado
                break;
        }
    }

    // Método para retornar o navegador
    public WebDriver pegarNavegador() {
        return navegador;
    }

    // Método para abrir uma URL no navegador atual
    public void openURL(String url) {
        navegador.get(url);
    }

    // Método para maximizar o navegador
    public void maximizarNavegador() {
        navegador.manage().window().maximize();
    }

    // Método para encerrar a sessão do navegador
    public void fecharNavegador() {
        navegador.quit();
    }

    // Enumeração para os tipos de navegadores suportados
    public enum BrowserType {
        CHROME,
        FIREFOX,
        EDGE,
    }
}
