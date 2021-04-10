package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.rmi.runtime.Log;

public class LogEduzz {
    private WebDriver browser;

    public LogEduzz(WebDriver browser){
        this.browser = browser;
    }

    public LogEduzz procurarEduzzNoGoogle (){
        browser.findElement(By.name("q")).sendKeys("Eduzz");
        browser.findElement(By.name("q")).submit();
        return this;
    }
}
