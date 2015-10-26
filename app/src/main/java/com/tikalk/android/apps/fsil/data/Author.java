package com.tikalk.android.apps.fsil.data;

import android.support.annotation.NonNull;

/**
 * Created by Oren on 26/10/2015.
 */
public class Author {

    private String name;
    private String userAvatarUrl;

    public Author(@NonNull String name,@NonNull String userAvatarUrl) {
        this.name = name;
        this.userAvatarUrl = userAvatarUrl;
    }

    public String getName() {
        return name;
    }

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }


}
