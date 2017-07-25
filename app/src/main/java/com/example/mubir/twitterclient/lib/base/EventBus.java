package com.example.mubir.twitterclient.lib.base;


public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
