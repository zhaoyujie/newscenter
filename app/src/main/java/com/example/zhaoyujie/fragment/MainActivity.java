package com.example.zhaoyujie.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewpager;
    private NewsViewPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mViewpager = findViewById(R.id.view_pager);
        mPagerAdapter = new NewsViewPagerAdapter(getSupportFragmentManager());
        mPagerAdapter.setDataList(buildDataList());
        mViewpager.setAdapter(mPagerAdapter);
    }

    private List<Fragment> buildDataList() {
        List<Fragment> list = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            list.add(new RecycleviewFragment());
        }
        return list;
    }
}
