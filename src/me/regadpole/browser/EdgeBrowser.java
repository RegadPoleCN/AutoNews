package me.regadpole.browser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser extends Browser{

    public EdgeBrowser() {
        super(new EdgeDriver());
    }

}
