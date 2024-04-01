package me.regadpole.browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser extends Browser{
    public FirefoxBrowser() {
        super(new FirefoxDriver());
    }
}
