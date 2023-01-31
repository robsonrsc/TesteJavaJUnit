import Metodos.metodos;
import org.example.Calculadora.calculador;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class TesteJunit {

    metodos met = new metodos();
   @Before

   public void inicio () throws  Exception {

   }

    @After
    public  void  tearDown () throws Exception {

       met.fecharNavegador();
   }

    @Test

    public void google () throws Exception {

        met.abrirNavegador("https://www.google.com.br");
        met.verificarTitulo("Google");
        //driver.findElement(By.name("q")).sendKeys("Juventus");
        met.buscaProduto("Euro para real", By.name("q"));
        met.screenShot("Tela Google");

    }

    @Test
    public void soma (){

    }







  /*  @Test
    public void amazon(){

    }

    @Test
    public void e2e(){

    }*/

}
