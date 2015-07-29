package com.viethoa.siliconstraits.testing.daggers.modules;

import android.app.Application;
import android.content.Context;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lorem_ipsum.managers.UserSessionDataManager;
import com.lorem_ipsum.utils.CustomDateParser;
import com.viethoa.siliconstraits.testing.MyApplication;

import java.lang.ref.WeakReference;
import java.util.Date;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VietHoa on 03/05/15.
 */
@Module(
        library = true,
        complete = false,
        injects = {
                MyApplication.class
        }
)

public class AppModule {

    private WeakReference<Application> appWeakRef;

    public AppModule(Application context) {
        this.appWeakRef = new WeakReference<Application>(context);
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        if (appWeakRef != null) {
            return appWeakRef.get();
        } else {
            return null;
        }
    }

    @Provides
    @Singleton
    public UserSessionDataManager providesUserManager() {
        return new UserSessionDataManager();
    }

    @Provides
    @Singleton
    public Gson providesJsonConverter() {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .registerTypeAdapter(Date.class, new CustomDateParser())
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
                .create();
        return gson;
    }
}

