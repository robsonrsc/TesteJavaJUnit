package Metodos;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.Screenshot;

import java.io.File;
import java.io.IOException;

public class metodos {

    WebDriver driver;

        public  void abrirNavegador (String url)throws Exception{
        System.setProperty("webdriver.chrome.driver","/home/robson/Documents/Programas/WebDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);


    }

    public void fecharNavegador () throws  Exception {

            driver.close();
    }

    public void verificarTitulo (String title){

        String titleEsperado = driver.getTitle();

        Assert.assertEquals(title,titleEsperado);
    }

    public void screenShot(String evidencia) throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
        File destino = new File("./evidencia2/ "+evidencia+".png");
        FileUtils.copyFile(scrfile,destino);
        }


        public void pesquisa (){

            By by;
        }
    public void buscaProduto( String texto, By busca){

            driver.findElement(busca).sendKeys(texto);

    }

    public void clique (){

            //driver.findElements()



    }





}
