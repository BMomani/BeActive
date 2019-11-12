package com.goodlife.beactive.di.component;

import com.goodlife.beactive.BeActiveApplication;
import com.goodlife.beactive.di.module.ApplicationModule;
import com.goodlife.beactive.di.module.BuildTypeAwareModule;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by Basheer Al momani (bmomani@atypon.com) on 2/19/19.
 */
@Singleton
@Component(modules = {ApplicationModule.class, BuildTypeAwareModule.class})
public interface ApplicationComponent {
    void inject(BeActiveApplication beActiveApplication);
}
