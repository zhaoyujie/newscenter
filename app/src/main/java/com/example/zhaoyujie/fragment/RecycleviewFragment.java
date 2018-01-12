package com.example.zhaoyujie.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoyujie on 2018/1/12.
 */

public class RecycleviewFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private NewsRecycleViewAdapter mNewsRecycleViewAdapter;
    private Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_recycleview_fragment_layout, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mContext = getActivity();
        mRecyclerView = view.findViewById(R.id.recycleview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mNewsRecycleViewAdapter = new NewsRecycleViewAdapter(mContext);
        mRecyclerView.setAdapter(mNewsRecycleViewAdapter);
        mRecyclerView.setItemAnimator(null);

        initData();
    }

    private void initData() {
        List<NewsBean> newsBeans = testData();
        mNewsRecycleViewAdapter.setNewsDataList(newsBeans);
        mNewsRecycleViewAdapter.notifyDataSetChanged();
    }

    private List<NewsBean> testData(){
        List<NewsBean> dataList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            dataList.add(new NewsBean("新闻中心"+i));
        }
        return dataList;
    }
}
