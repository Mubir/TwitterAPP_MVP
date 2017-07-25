package com.example.mubir.twitterclient.hashtags.ui;

import java.util.List;

import com.example.mubir.twitterclient.entities.Hashtag;


public interface HashtagsView {
    void showImages();
    void hideImages();
    void showProgress();
    void hideProgress();

    void onError(String error);
    void setContent(List<Hashtag> items);
}
