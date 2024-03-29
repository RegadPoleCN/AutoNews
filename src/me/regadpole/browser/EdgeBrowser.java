package me.regadpole.browser;

import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser extends Browser{

    public EdgeBrowser() {
        super(new EdgeDriver());
    }

    @Override
    public Browser getWeb(String url) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        return this;
    }


}
