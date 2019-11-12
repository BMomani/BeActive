package com.goodlife.beactive.common.tools.stetho;

import okhttp3.OkHttpClient;

/**
 * Created by Basheer Al momani (bmomani@atypon.com) on 2/27/19.
 */
public interface StethoTool {
    void init();

    void configureInterceptor(OkHttpClient.Builder httpClientBuilder);
}
