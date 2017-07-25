package com.example.mubir.twitterclient.hashtags.di;

import javax.inject.Singleton;

import dagger.Component;
import com.example.mubir.twitterclient.hashtags.HashtagsPresenter;
import com.example.mubir.twitterclient.hashtags.ui.HashtagsFragment;
import com.example.mubir.twitterclient.lib.di.LibsModule;


@Singleton @Component(modules = {LibsModule.class, HashtagsModule.class})
public interface HashtagsComponent {
    void inject(HashtagsFragment fragment);
    HashtagsPresenter getPresenter();
}
