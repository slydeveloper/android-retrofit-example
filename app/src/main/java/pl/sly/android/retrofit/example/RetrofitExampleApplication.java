package pl.sly.android.retrofit.example;

import android.app.Application;

import timber.log.Timber;

public class RetrofitExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
