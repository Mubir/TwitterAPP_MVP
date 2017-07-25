package com.example.mubir.twitterclient.hashtags.di;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.Session;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import com.example.mubir.twitterclient.api.CustomTwitterApiClient;
import com.example.mubir.twitterclient.entities.Hashtag;
import com.example.mubir.twitterclient.hashtags.HashtagsInteractor;
import com.example.mubir.twitterclient.hashtags.HashtagsInteractorImpl;
import com.example.mubir.twitterclient.hashtags.HashtagsPresenter;
import com.example.mubir.twitterclient.hashtags.HashtagsPresenterImpl;
import com.example.mubir.twitterclient.hashtags.HashtagsRepository;
import com.example.mubir.twitterclient.hashtags.HashtagsRepositoryImpl;
import com.example.mubir.twitterclient.hashtags.ui.HashtagsView;
import com.example.mubir.twitterclient.hashtags.ui.adapters.HashtagsAdapter;
import com.example.mubir.twitterclient.hashtags.ui.adapters.OnItemClickListener;
import com.example.mubir.twitterclient.lib.base.EventBus;


@Module
public class HashtagsModule {
    private HashtagsView view;
    private OnItemClickListener clickListener;

    public HashtagsModule(HashtagsView view, OnItemClickListener clickListener) {
        this.view = view;
        this.clickListener = clickListener;
    }

    @Provides
    @Singleton
    HashtagsAdapter providesAdapter(List<Hashtag> dataset, OnItemClickListener clickListener){
        return new HashtagsAdapter(dataset, clickListener);
    }

    @Provides
    @Singleton
    OnItemClickListener providesOnItemClickListener(){
        return this.clickListener;
    }

    @Provides
    @Singleton
    List<Hashtag> providesItemsList(){
        return new ArrayList<Hashtag>();
    }

    @Provides
    @Singleton
    HashtagsPresenter providesImagesPresenter(HashtagsView view, EventBus eventBus, HashtagsInteractor interactor){
        return new HashtagsPresenterImpl(view, eventBus, interactor);
    }

    @Provides
    @Singleton
    HashtagsView providesImagesView(){
        return this.view;
    }

    @Provides
    @Singleton
    HashtagsInteractor providesImagesInteractor(HashtagsRepository repository){
        return new HashtagsInteractorImpl(repository);
    }

    @Provides
    @Singleton
    HashtagsRepository providesImagesRepository(EventBus eventBus, CustomTwitterApiClient client){
        return new HashtagsRepositoryImpl(eventBus, client);
    }

    @Provides
    @Singleton
    CustomTwitterApiClient providesCustomTwitterApiClient(Session session) {
        return new CustomTwitterApiClient(session);
    }

    @Provides
    @Singleton
    Session providesTwitter() {
        return Twitter.getSessionManager().getActiveSession();
    }
}
