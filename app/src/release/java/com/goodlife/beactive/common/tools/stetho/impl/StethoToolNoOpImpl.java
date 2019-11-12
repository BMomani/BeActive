package com.goodlife.beactive.common.tools.stetho.impl;

import com.goodlife.beactive.common.tools.stetho.StethoTool;
import okhttp3.OkHttpClient;

/**
 * Created by Basheer Al momani (bmomani@atypon.com) on 2/27/19.
 */
public class StethoToolNoOpImpl implements StethoTool {
    @Override
    public void init() {

    }

    @Override
    public void configureInterceptor(OkHttpClient.Builder httpClientBuilder) {

    }
}
