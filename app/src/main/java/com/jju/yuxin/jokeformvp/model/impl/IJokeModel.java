package com.jju.yuxin.jokeformvp.model.impl;

import com.jju.yuxin.jokeformvp.model.JokeModel;

/**
 * =============================================================================
 * Copyright (c) 2017 yuxin All rights reserved.
 * Packname com.jju.yuxin.jokeformvp.model.impl
 * Created by yuxin.
 * Created time 2017/6/4 0004 上午 10:13.
 * Version   1.0;
 * Describe :
 * History:
 * ==============================================================================
 */

public interface IJokeModel {

    void getJoke(int page,int size,JokeModel.JokeLoadListener jokeListener);
}
