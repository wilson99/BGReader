package com.wilson.CommonUtil;

/**
 * Created by wzhan025 on 2/8/2018.
 */

public class DateForLine {
    private String time;
    private String value;

    public DateForLine(String time, String value) {
        this.time = time;
        this.value = value;
    }

    public DateForLine() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
