package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LogEduzz;
import suporte.WebEduzz;

public class EduzzTest {

    private WebDriver browser;

    @Before
    public void setUp(){
        browser = WebEduzz.createChrome();
    }


    @Test
    public void ExecutarTeste(){
        new LogEduzz(browser)
                .procurarEduzzNoGoogle();

       //Validação do Texto Eduzz
        browser.get("https://www.eduzz.com");
        Assert.assertEquals("Eduzz - Vem crescer com a gente.",browser.getTitle());

    }
}
