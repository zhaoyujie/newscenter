package com.example.zhaoyujie.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by zhaoyujie on 2018/1/12.
 */

public class NewsViewPagerAdapter extends FragmentPagerAdapter{

    private List<Fragment> mDataList;
    public NewsViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setDataList(List<Fragment> list){
        mDataList = list;
    }

    @Override
    public Fragment getItem(int position) {
        return mDataList.get(position);
    }

    @Override
    public int getCount() {
        return mDataList.size();
    }
}
