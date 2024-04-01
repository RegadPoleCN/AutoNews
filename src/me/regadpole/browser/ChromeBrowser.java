package me.regadpole.browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser extends Browser{

    public ChromeBrowser() {
        super(new ChromeDriver());
    }

}
