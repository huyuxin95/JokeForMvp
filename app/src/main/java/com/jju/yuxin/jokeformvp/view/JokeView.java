package com.jju.yuxin.jokeformvp.view;

import com.jju.yuxin.jokeformvp.bean.JokeResult;

/**
 * =============================================================================
 * Copyright (c) 2017 yuxin All rights reserved.
 * Packname com.jju.yuxin.jokeformvp.view
 * Created by yuxin.
 * Created time 2017/6/4 0004 上午 9:25.
 * Version   1.0;
 * Describe :
 * History:
 * ==============================================================================
 */

public interface JokeView {

     void setJoke(JokeResult jokeResult);

     void loadErr();

     void showloading();

     void hideloading();
}
