package com.solid.principles.ocp;

import com.solid.principles.ocp.bad.Category;

/**
 * @author Hugo Gois
 */

/*
   Open-closed principle case:
   Let's say that now we have a new enum "category" referenced in the Video class, and we are going to calculate earnings
   based on each category in another class called EarningsCalculator (go there).
 */

public class Video {

    private String title;
    private int time;
    private int likes;
    private int views;
    private Category category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
