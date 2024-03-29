package me.regadpole;

import me.regadpole.browser.Browser;
import me.regadpole.browser.ChromeBrowser;
import me.regadpole.browser.EdgeBrowser;
import me.regadpole.time.Wait;

public class Main {
    public static Browser browser;
    public static void main(String[] args) {
        Wait wait= new Wait();
        try {
            wait.sleepHours(wait.getWaitedHours());
            wait.sleepMinutes(wait.getWaitedMinutes());
            open(args);
            wait.stop();
            browser.stop();
            System.exit(0);
        }catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static void open(String[] args) {
        if(args.length != 2) {
            throw new NegativeArraySizeException("长度错误");
        }
        switch (args[0].toLowerCase()){
            case "edge":  browser = new EdgeBrowser(); break;
            case "chrome": browser = new ChromeBrowser(); break;
            default: browser = new EdgeBrowser(); break;
        }
        browser.getWeb(args[1]).full().play();
    }
}