package com.jju.yuxin.jokeformvp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.jju.yuxin.jokeformvp.R;
import com.jju.yuxin.jokeformvp.bean.ResultBean;

import java.util.List;

/**
 * =============================================================================
 * Copyright (c) 2017 yuxin All rights reserved.
 * Packname com.jju.yuxin.jokeformvp.adapter
 * Created by yuxin.
 * Created time 2017/6/4 0004 上午 9:48.
 * Version   1.0;
 * Describe :
 * History:
 * ==============================================================================
 */

public class JokeListViewAdapter extends BaseAdapter {
    private Context mContext;
    private List<ResultBean> resultBeanList;
    private LayoutInflater inflater;

    public JokeListViewAdapter(Context context,List<ResultBean> resultBeanList) {
        this.mContext=context;
        this.resultBeanList=resultBeanList;
        inflater=LayoutInflater.from(mContext);
    }

    public void addAll(List<ResultBean> resultBeanList){
        this.resultBeanList.clear();
        this.resultBeanList.addAll(resultBeanList);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return resultBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return resultBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView=inflater.inflate(R.layout.listview_item,null);
        }
        ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        if(viewHolder==null){
            viewHolder=new ViewHolder(convertView);
        }

        viewHolder.setUI(resultBeanList.get(position));
        return convertView;
    }

    public class ViewHolder{
        private TextView tv_item;

        public ViewHolder(View convertView) {
            tv_item= (TextView) convertView.findViewById(R.id.tv_item);
        }

        public void setUI(ResultBean resultBean){
            tv_item.setText(resultBean.getContent());
        }
    }

}
