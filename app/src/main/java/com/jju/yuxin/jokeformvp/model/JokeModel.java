package com.jju.yuxin.jokeformvp.model;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.jju.yuxin.jokeformvp.bean.JokeResult;
import com.jju.yuxin.jokeformvp.model.impl.IJokeModel;
import com.jju.yuxin.jokeformvp.utils.VolleyRequest;

/**
 * =============================================================================
 * Copyright (c) 2017 yuxin All rights reserved.
 * Packname com.jju.yuxin.jokeformvp.model
 * Created by yuxin.
 * Created time 2017/6/4 0004 上午 10:10.
 * Version   1.0;
 * Describe :
 * History:
 * ==============================================================================
 */

public class JokeModel implements IJokeModel{

    // http://api.avatardata.cn/Joke/NewstJoke?key=9f8e985df87e42ccad0dc4f64fe14622&page=2&rows=10
    private static final String joke_url="http://api.avatardata.cn/Joke/NewstJoke?";
    private static final String app_key="9f8e985df87e42ccad0dc4f64fe14622";
    private  JokeLoadListener jokeLoadListener;

    @Override
    public void getJoke(int page, int size,JokeLoadListener jokeListener) {
        this.jokeLoadListener=jokeListener;
        VolleyRequest.newInstance().newGsonRequest(joke_url + "key=" + app_key + "&page=" + page + "&rows" + size, JokeResult.class
                , new Response.Listener<JokeResult>() {
            @Override
            public void onResponse(JokeResult response) {
                if(response==null){
                    jokeLoadListener.onError();
                }else{
                    jokeLoadListener.onSucess(response);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                jokeLoadListener.onError();
            }
        });
    }

    public interface JokeLoadListener{
        void onSucess(JokeResult response);
        void onError();
    }


}
