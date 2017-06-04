package com.jju.yuxin.jokeformvp;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.jju.yuxin.jokeformvp.adapter.JokeListViewAdapter;
import com.jju.yuxin.jokeformvp.bean.JokeResult;
import com.jju.yuxin.jokeformvp.bean.ResultBean;
import com.jju.yuxin.jokeformvp.presenter.impl.JokePresenterimpl;
import com.jju.yuxin.jokeformvp.view.JokeView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements JokeView{

    private ListView jokelistview;
    private TextView tv_toast;
    private List<ResultBean> resultBeanList;
    private JokeListViewAdapter jokeAdapter;
    private JokePresenterimpl jokePresenterimpl;

    private static final int PAGER_NUM=1;
    private static final int PAGER_SIZE=25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initVariables() {
        resultBeanList=new ArrayList<ResultBean>();
        jokePresenterimpl = new JokePresenterimpl(this);

    }

    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        jokelistview = (ListView) this.findViewById(R.id.lv_joke);
        tv_toast = (TextView) this.findViewById(R.id.tv_toast);
    }

    @Override
    public void loadData() {
        jokeAdapter = new JokeListViewAdapter(this,resultBeanList);
        jokelistview.setAdapter(jokeAdapter);
        jokePresenterimpl.getJoke(PAGER_NUM,PAGER_SIZE);
    }

    @Override
    public void setJoke(JokeResult jokeResult) {
        if(jokeResult!=null){
            resultBeanList = jokeResult.getResult();
            if(resultBeanList!=null){
                jokeAdapter.addAll(resultBeanList);
            }
        }
    }

    @Override
    public void loadErr() {
        tv_toast.setVisibility(View.VISIBLE);
        tv_toast.setText(getText(R.string.data_loaderr));
    }

    @Override
    public void showloading() {
        tv_toast.setVisibility(View.VISIBLE);
        tv_toast.setText(getText(R.string.data_loading));
    }

    @Override
    public void hideloading() {
        tv_toast.setVisibility(View.INVISIBLE);
    }
}
