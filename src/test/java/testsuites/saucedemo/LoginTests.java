package testsuites.saucedemo;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import saucedemo.core.BaseClass;
import saucedemo.pages.LoginClass;
import tools.managers.BrowserManager;
import static tools.readers.CSVDataReader.lerLinhaCSV;

@DisplayName("Testes automatizados da funcionalidade de Login")
public class LoginTests extends BaseClass {
    private WebDriver navegador;
    @BeforeEach
    public void setup(){
        // Inicializar o browser
        gestorDoNavegador.inicializarNavegador(BrowserManager.BrowserType.CHROME);
        gestorDoNavegador.maximizarNavegador();
        navegador = gestorDoNavegador.pegarNavegador();
    }

    @DisplayName("Login de usuário com dados válidos")
    @Test()
    public void testLoginDeUsuarioComDadosValidos(){
        // Navegar até ao site, efectuar login e validar
        String textoDeValidacao = new LoginClass(navegador)
                .navegarParaAPaginaDeLogin()
                .login(lerLinhaCSV(LoginClass.csvComDadosDeLogin, 1))
                .pegarTextoDeValidacao();

        Assertions.assertEquals("Swag Labs", textoDeValidacao);
    }

    @AfterEach
    public void tearDown(){
        // Fechar o browser
        gestorDoNavegador.fecharNavegador();
    }
}