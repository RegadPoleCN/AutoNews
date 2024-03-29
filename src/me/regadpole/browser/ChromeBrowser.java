package me.regadpole.browser;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser extends Browser{

    public ChromeBrowser() {
        super(new ChromeDriver());
    }

    @Override
    public Browser getWeb(String url) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        return this;
    }
}
