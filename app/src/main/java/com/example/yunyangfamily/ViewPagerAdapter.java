package com.example.yunyangfamily;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

/**
 * Created by lenovo on 2017/9/13.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{
    int pagecount=4;
    private int color[]=new int[]{android.R.color.holo_orange_light,android.R.color.holo_green_dark,android.R.color.holo_red_dark,android.R.color.holo_orange_light};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ViewPagerFragment.getInstance(position+1,color[position]);
    }

    @Override
    public int getCount() {
        return pagecount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
            return"热门专区";
        else if(position==1)
            return"社区";
        else if(position==2)
            return"个人健康";
        else if(position==3)
            return"VIP专区";
        return "Page";
    }
}


