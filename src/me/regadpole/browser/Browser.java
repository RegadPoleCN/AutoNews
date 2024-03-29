package me.regadpole.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Browser {

    protected final WebDriver driver;

    protected Browser(WebDriver driver) {
        this.driver = driver;
    }

    public abstract Browser getWeb(String url);

    public void stop() {
        driver.quit();
    }

    public Browser play() {
        driver.findElement(By.xpath("//*[@id=\"play_or_pause_play_player\"]")).click();
        return this;
    }

    public Browser full() {
        driver.findElement(By.xpath("//*[@id=\"player_fullscreen_no_player\"]")).click();
        return this;
    }
}
