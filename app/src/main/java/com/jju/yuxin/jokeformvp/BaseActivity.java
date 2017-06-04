package com.jju.yuxin.jokeformvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * =============================================================================
 * Copyright (c) 2017 yuxin All rights reserved.
 * Packname com.jju.yuxin.jokeformvp
 * Created by yuxin.
 * Created time 2017/6/4 0004 上午 9:14.
 * Version   1.0;
 * Describe :
 * History:
 * ==============================================================================
 */

public abstract  class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVariables();
        initView();
        loadData();
    }

    public abstract void initVariables();

    public abstract void initView();

    public abstract void loadData();
}
