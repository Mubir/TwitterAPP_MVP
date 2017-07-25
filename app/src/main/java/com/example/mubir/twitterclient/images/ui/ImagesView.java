package com.example.mubir.twitterclient.images.ui;

import java.util.List;

import com.example.mubir.twitterclient.entities.Image;


public interface ImagesView {
    void showImages();
    void hideImages();
    void showProgress();
    void hideProgress();

    void onError(String error);
    void setContent(List<Image> items);
}
