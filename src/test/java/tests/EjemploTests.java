package tests;


import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Test;
import utils.BaseTest;

public class EjemploTests extends BaseTest {
    @Test
    public void ejemploTest(Page page) {
        //navegando a la pagina
        page.navigate("/");
    }
}
