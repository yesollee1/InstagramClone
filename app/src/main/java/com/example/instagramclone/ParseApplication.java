package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("oT62UtBNjLMC1olDaHUPwDBQiWzQrJ74yrJYrI2h")
                .clientKey("RfGlA1q6FJ5az8y8PfsOWYAPbvcBVAFO2mKlk9gw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
