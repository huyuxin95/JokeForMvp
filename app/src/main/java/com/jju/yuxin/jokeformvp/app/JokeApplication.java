package com.jju.yuxin.jokeformvp.app;

import android.app.Application;

import com.jju.yuxin.jokeformvp.utils.VolleyRequest;

/**
 * =============================================================================
 * Copyright (c) 2017 yuxin All rights reserved.
 * Packname com.jju.yuxin.jokeformvp.app
 * Created by yuxin.
 * Created time 2017/6/4 0004 上午 11:01.
 * Version   1.0;
 * Describe :
 * History:
 * ==============================================================================
 */

public class JokeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        VolleyRequest.buildRequestQueue(this);
    }
}
