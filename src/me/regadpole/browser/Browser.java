package me.regadpole.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * Abstract class for selenium browser driver.
 * @author RegadPole
 */
public abstract class Browser {

    protected final WebDriver driver;

    /**
     * Constructor for Browser.
     * Subclass should send a {@link WebDriver} to this constructor.
     * @author RegadPole
     * @param driver web driver
     */
    protected Browser(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Send a get request to the {@code url}.
     * @author Regadpole
     * @param url URL which you wang to send get request to
     * @return Browser instance
     */
    public Browser getWeb(String url) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        return this;
    };

    /**
     * Quit the web driver.
     * @author RegadPole
     */
    public void stop() {
        driver.quit();
    }

    /**
     * Press the Play button in cctv live page.
     * @author RegadPole
     * @return Browser instance
     */
    public Browser play() {
        driver.findElement(By.xpath("//*[@id=\"play_or_pause_play_player\"]")).click();
        return this;
    }

    /**
     * Press the full screen button in cctv live page.
     * @author RegadPole
     * @return Browser instance
     */
    public Browser full() {
        driver.findElement(By.xpath("//*[@id=\"player_fullscreen_no_player\"]")).click();
        return this;
    }
}
