package com.spring.Ioc;

import java.util.List;

/**
 * Created by 94921 on 2019/3/4.
 */
public class Meeting {
    private String theme;
    private List<Boss> bossList;

    public Meeting(String theme, List<Boss> bossList) {
        this.theme = theme;
        this.bossList = bossList;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBossList() {
        return bossList;
    }

    public void setBossList(List<Boss> bossList) {
        this.bossList = bossList;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", bossList=" + bossList +
                '}';
    }
}
