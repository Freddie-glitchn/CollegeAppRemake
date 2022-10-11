package com.example.recap;

public class MyPostsData {
    private String user_name;
    private String user_posts;
    private Integer photo;


    public MyPostsData(String user_name, String user_posts, Integer photo) {
        this.user_name = user_name;
        this.user_posts = user_posts;
        this.photo = photo;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_posts() {
        return user_posts;
    }

    public Integer getPhoto() {
        return photo;
    }
}
