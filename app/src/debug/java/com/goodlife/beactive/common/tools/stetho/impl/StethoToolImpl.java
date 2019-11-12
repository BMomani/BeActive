package com.goodlife.beactive.common.tools.stetho.impl;

import android.content.Context;
import com.facebook.stetho.Stetho;
import com.goodlife.beactive.common.tools.stetho.StethoTool;
import okhttp3.OkHttpClient;

/**
 * Created by Basheer Al momani (bmomani@atypon.com) on 11/12/19.
 */
public class StethoToolImpl implements StethoTool {

    private final Context context;

    public StethoToolImpl(Context context) {
        this.context = context;
    }

    @Override
    public void init() {
        Stetho.initialize(Stetho.newInitializerBuilder(this.context)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this.context))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this.context))
                .build());
    }

    @Override
    public void configureInterceptor(OkHttpClient.Builder httpClientBuilder) {

    }
}
