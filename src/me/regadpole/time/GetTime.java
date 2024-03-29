package me.regadpole.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {
    private Date now = new Date();
    private SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ss");

    private int[] times = getTimes(now);

    private int[] getTimes(Date date) {
        now = new Date();
        int[] ints = new int[3];
        String[] ds;
        String d = ft.format(date);
        ds = d.split(":");
        for (int t = 0; t<ds.length; t++) {
            String s = ds[t];
            ints[t] = Integer.parseInt(s);
        }
        return ints;
    }

    public int getHour() {
        getTimes(new Date());
        return times[0];
    }

    public int getMinute() {
        getTimes(new Date());
        return times[1];
    }

    public int getSecond() {
        getTimes(new Date());
        return times[2];
    }

    @Override
    public String toString() {
        return super.toString()+"Time: " + ft.format(now);
    }
}
