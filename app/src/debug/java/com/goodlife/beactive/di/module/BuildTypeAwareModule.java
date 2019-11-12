package com.goodlife.beactive.di.module;

import android.app.Application;
import com.goodlife.beactive.common.tools.stetho.StethoTool;
import com.goodlife.beactive.common.tools.stetho.impl.StethoToolImpl;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by Basheer Al momani (bmomani@atypon.com) on 11/12/19.
 */

@Module
public class BuildTypeAwareModule {

    @Provides
    @Singleton
    public static StethoTool providesStetho(Application application) {
        return new StethoToolImpl(application.getApplicationContext());
    }
}
