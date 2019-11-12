package com.goodlife.beactive;

import android.app.Application;
import com.goodlife.beactive.common.tools.stetho.StethoTool;
import com.goodlife.beactive.common.tools.stetho.TimberTool;
import com.goodlife.beactive.di.component.ApplicationComponent;
import com.goodlife.beactive.di.component.DaggerApplicationComponent;
import com.goodlife.beactive.di.module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by Basheer Al momani (bmomani@atypon.com) on 11/12/19.
 */
public class BeActiveApplication extends Application {
    private ApplicationComponent mApplicationComponent;

    @Inject
    StethoTool stethoTool;
    @Inject
    TimberTool timberTool;

    @Override
    public void onCreate() {
        getApplicationComponent().inject(this);
        super.onCreate();

        initBeActiveApplication();
    }

    private void initBeActiveApplication() {
        initTimber();
        initStetho();
    }

    private void initTimber() {
        timberTool.init();
    }

    private void initStetho() {
        stethoTool.init();
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
