package com.example.mubir.twitterclient.hashtags;

import com.example.mubir.twitterclient.hashtags.events.HashtagsEvent;


public interface HashtagsPresenter {
    void onResume();
    void onPause();
    void onDestroy();
    void getHashtagTweets();
    void onEventMainThread(HashtagsEvent event);
}
