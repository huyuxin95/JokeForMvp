package com.jju.yuxin.jokeformvp.presenter.impl;

import com.jju.yuxin.jokeformvp.bean.JokeResult;
import com.jju.yuxin.jokeformvp.model.JokeModel;
import com.jju.yuxin.jokeformvp.presenter.IJokePresenter;
import com.jju.yuxin.jokeformvp.view.JokeView;

/**
 * =============================================================================
 * Copyright (c) 2017 yuxin All rights reserved.
 * Packname com.jju.yuxin.jokeformvp.presenter
 * Created by yuxin.
 * Created time 2017/6/4 0004 上午 10:01.
 * Version   1.0;
 * Describe :
 * History:
 * ==============================================================================
 */

public class JokePresenterimpl implements IJokePresenter{

    private JokeView jokeView;
    private JokeModel jokeModel;

    public JokePresenterimpl(JokeView jokeView) {
        this.jokeView=jokeView;
        if (jokeModel==null){
            jokeModel=new JokeModel();
        }
    }


    @Override
    public void getJoke(int pagerNum, int size) {
        jokeView.showloading();
        jokeModel.getJoke(pagerNum, size, new JokeModel.JokeLoadListener() {
            @Override
            public void onSucess(JokeResult response) {
                jokeView.setJoke(response);
                jokeView.hideloading();
            }

            @Override
            public void onError() {
                jokeView.loadErr();
            }
        });
    }
}
