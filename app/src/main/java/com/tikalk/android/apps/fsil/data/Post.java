package com.tikalk.android.apps.fsil.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Oren on 26/10/2015.
 */
public class Post {
    private  String date;
    private  String location;
    private  String text;
    private  String imageUrl;
    private  String videoUrl;
    private long likeNum;
    private final long postId;
    private List<Long> commentsIds;

    public Post(@NonNull String date, String location,@NonNull String text, String imageUrl, String videoUrl,@NonNull long likeNum,@NonNull long postId) {
        this.date = date;
        this.location = location;
        this.text = text;
        this.imageUrl = imageUrl;
        this.videoUrl = videoUrl;
        this.likeNum = likeNum;
        this.postId = postId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public long getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(long likeNum) {
        this.likeNum = likeNum;
    }

    public long getPostId() {
        return postId;
    }

    public List<Long> getCommentsIds() {
        return commentsIds;
    }

    public void setCommentsIds(List<Long> commentsIds) {
        this.commentsIds = commentsIds;
    }
}
