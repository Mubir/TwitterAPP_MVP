package com.example.mubir.twitterclient.images.di;

import javax.inject.Singleton;

import dagger.Component;
import com.example.mubir.twitterclient.images.ImagesPresenter;
import com.example.mubir.twitterclient.images.ui.ImagesFragment;
import com.example.mubir.twitterclient.lib.di.LibsModule;


@Singleton @Component(modules = {LibsModule.class, ImagesModule.class})
public interface ImagesComponent {
    void inject(ImagesFragment fragment);
    ImagesPresenter getPresenter();
}
