package com.example.mubir.twitterclient.images;

import com.example.mubir.twitterclient.images.events.ImagesEvent;


public interface ImagesPresenter {
    void onResume();
    void onPause();
    void onDestroy();
    void getImageTweets();
    void onEventMainThread(ImagesEvent event);
}
