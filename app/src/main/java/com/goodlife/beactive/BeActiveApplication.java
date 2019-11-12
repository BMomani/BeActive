package com.goodlife.beactive;

import android.app.Application;
import com.goodlife.beactive.di.component.ApplicationComponent;
import com.goodlife.beactive.di.component.DaggerApplicationComponent;
import com.goodlife.beactive.di.module.ApplicationModule;

/**
 * Created by Basheer Al momani (bmomani@atypon.com) on 11/12/19.
 */
public class BeActiveApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        getApplicationComponent().inject(this);
        super.onCreate();
    }

    public ApplicationComponent getApplicationComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mApplicationComponent;
    }
}
