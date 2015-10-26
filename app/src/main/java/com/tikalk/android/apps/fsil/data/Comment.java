package com.tikalk.android.apps.fsil.data;

import android.support.annotation.NonNull;

/**
 * Created by Oren on 26/10/2015.
 */
public class Comment extends Post {
    private long parentId;
    public Comment( @NonNull long postId, @NonNull long parentId,@NonNull String date, String location, @NonNull String text, String imageUrl, String videoUrl, @NonNull long likeNum) {
        super(date, location, text, imageUrl, videoUrl, likeNum, postId);
        this.parentId = parentId;
    }
}
