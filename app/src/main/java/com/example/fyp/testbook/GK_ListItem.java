package com.example.fyp.testbook;

public class GK_ListItem {

    private String gk_title;
    private String GK_serial;

    public GK_ListItem(String GK_title, String GK_Serial) {
        gk_title = GK_title;
        GK_serial =GK_Serial;
    }
    //video Title
    public String getGk_title() {
        return gk_title;
    }

    public void setGk_title(String GK_title) {
        this.gk_title = GK_title;
    }

    //video poster
    public String getGK_serial() {
        return GK_serial;
    }

    public void setGK_serial(String gk_serial) {
        this.GK_serial = gk_serial;
    }
}
