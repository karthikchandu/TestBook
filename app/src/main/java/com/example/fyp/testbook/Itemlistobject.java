package com.example.fyp.testbook;

public class Itemlistobject {
    private String question, option1, option2, option3, option4;
    private String name;
    private String desc;
    private String video_title;

    private String VIDEO_NANE;
    private int VIDEO_POSTER;
    private int photo;
    private int image;
    private int view_count;

    public Itemlistobject(String name, String desc, int photo) {
        this.name = name;
        this.desc = desc;
        this.photo = photo;
    }

    public Itemlistobject(String question, String option1, String option2, String option3, String option4) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    public String getQuestion1() {
        return question;
    }

    public String getCheckbox1() {
        return option1;
    }

    public String getCheckbox2() {
        return option2;
    }

    public String getCheckbox3() {
        return option3;
    }

    public String getCheckbox4() {
        return option4;
    }


    public Itemlistobject(int view_count, String video_title, int image) {
        this.video_title = video_title;
        this.view_count = view_count;
        this.image = image;
    }

    public String getVideo_title() {
        return video_title;
    }

    public int getView_count() {
        return view_count;
    }

    public int getphoto() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }


    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Itemlistobject(String name, int photo) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}