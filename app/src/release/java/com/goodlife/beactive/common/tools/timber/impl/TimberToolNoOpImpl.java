package com.goodlife.beactive.common.tools.timber.impl;

import android.content.Context;
import com.facebook.stetho.Stetho;
import com.goodlife.beactive.common.tools.stetho.StethoTool;
import com.goodlife.beactive.common.tools.stetho.TimberTool;
import okhttp3.OkHttpClient;
import timber.log.Timber;

/**
 * Created by Basheer Al momani (bmomani@atypon.com) on 11/12/19.
 */
public class TimberToolNoOpImpl implements TimberTool {
    @Override
    public void init() {
    }
}
