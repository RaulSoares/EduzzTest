package pages;

import org.openqa.selenium.WebDriver;

public class BasePageEduzz {

    protected WebDriver browser;

    public BasePageEduzz(WebDriver browser){
        this.browser = browser;
    }

    public BasePageEduzz() {

    }

}
