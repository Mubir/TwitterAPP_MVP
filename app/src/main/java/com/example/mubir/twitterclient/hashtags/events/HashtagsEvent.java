package com.example.mubir.twitterclient.hashtags.events;

import java.util.List;

import com.example.mubir.twitterclient.entities.Hashtag;


public class HashtagsEvent {
    private String error;
    private List<Hashtag> hashtags;

    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
