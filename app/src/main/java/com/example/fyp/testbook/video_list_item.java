package com.example.fyp.testbook;

public class video_list_item {

    private String video_title;
    private int video_poster;

    public video_list_item(String n, int poster) {
        video_title = n;
        video_poster =poster;
    }
    //video Title
    public String getVideoName() {
        return video_title;
    }

    public void setVideoName(String name) {
        this.video_title = name;
    }

//video poster
    public int getposter() {
        return video_poster;
    }

    public void setposter(int poster) {
        this.video_poster = poster;
    }
}
