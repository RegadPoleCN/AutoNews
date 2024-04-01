package me.regadpole.time;

import java.util.concurrent.TimeUnit;

/**
 * Wait for news.
 * @author RegadPole
 */
public class Wait {
    public static final int beginHour = 18;
    public static final int beginMinute = 59;
    public static final int stopHour = 19;
    public static final int stopMinute = 29;
    private final GetTime now;
    public Wait() {
        this.now = new GetTime();
    }

    /**
     * Return an int for hours to wait.
     * @author RegadPole
     * @return int for hours to wait
     */
    public int getWaitedHours() {
        int nowHour = now.getHour();
        int wait = beginHour - nowHour;
        System.out.println("h: "+now);
        System.out.println("h: "+wait);
        return wait;
    }

    /**
     * Return an int for minutes to wait.
     * @author RegadPole
     * @return  int for minutes to wait.
     */
    public int getWaitedMinutes() {
        int nowMinute = now.getMinute();
        int wait = beginMinute - nowMinute;
        System.out.println("m: "+now);
        System.out.println("m: "+wait);
        return wait;
    }

    /**
     * Sleep {@code h} hour.
     * @author RegadPole
     * @param h hours to sleep
     * @throws InterruptedException the thread is interrupted.
     * @throws TimeException late for begin time.
     */
    public void sleepHours(int h) throws InterruptedException, TimeException {
        if (h > 0) TimeUnit.HOURS.sleep(h);
        else throw new TimeException("hour: late for begin time");
    }

    /**
     * Sleep {@code m} minute.
     * @author RegadPole
     * @param m minute to sleep
     * @throws InterruptedException the thread is interrupted.
     * @throws TimeException late for begin time.
     */
    public void sleepMinutes(int m) throws InterruptedException, TimeException {
        if (m >= 1) TimeUnit.MINUTES.sleep(m);
        else throw new TimeException("minute: late for begin time");
    }

    /**
     * Wait to stop the application.
     * @author RegadPole
     * @throws InterruptedException the thread is interrupted.
     */
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
