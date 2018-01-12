package com.example.zhaoyujie.fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zhaoyujie on 2018/1/12.
 */

public class NewsRecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final String TAG = "NewsRecycleViewAdapter";
    public static final boolean DEBUG = NewsCenterConfig.DEBUG;

    private Context mContext;
    private List<NewsBean> mNewsDataList;

    public NewsRecycleViewAdapter(Context context){
        mContext = context;
    }

    public void setNewsDataList(List<NewsBean> list){
        mNewsDataList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.news_item_layout, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof NewsViewHolder){
            NewsViewHolder newsViewHolder = (NewsViewHolder) holder;
            newsViewHolder.title.setText(mNewsDataList.get(position).title);
        }
    }

    @Override
    public int getItemCount() {
        return (mNewsDataList == null || mNewsDataList.size() == 0) ? 0:mNewsDataList.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        public NewsViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
        }
    }

}
