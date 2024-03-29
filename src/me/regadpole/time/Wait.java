package me.regadpole.time;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Wait {
    public static final int beginHour = 18;
    public static final int beginMinute = 59;
    public static final int stopHour = 19;
    public static final int stopMinute = 29;
    private final GetTime now;
    public Wait() {
        this.now = new GetTime();
    }

    public int getWaitedHours() {
        int nowHour = now.getHour();
        int wait = beginHour - nowHour;
        System.out.println("h: "+now);
        System.out.println("h: "+wait);
        return wait >= 0 ? wait : null;
    }

    public int getWaitedMinutes() {
        int nowMinute = now.getMinute();
        int wait = beginMinute - nowMinute;
        System.out.println("m: "+now);
        System.out.println("m: "+wait);
        return wait>=0 ? wait : null;
    }

    public void sleepHours(int h) throws InterruptedException {
        if (h >= 1) TimeUnit.HOURS.sleep(h);
    }

    public void sleepMinutes(int m) throws InterruptedException {
        if (m >= 1) TimeUnit.MINUTES.sleep(m);
    }

    public void stop() throws InterruptedException {
        int nowHour = now.getHour();
        int nowMinute = now.getMinute();
        if (nowHour==stopHour-1) {
                TimeUnit.MINUTES.sleep(61-nowMinute);
        }
        if (nowHour==stopHour) {
            while(nowMinute<=stopMinute) {
                TimeUnit.SECONDS.sleep(10);
            }
        }
    }
}
