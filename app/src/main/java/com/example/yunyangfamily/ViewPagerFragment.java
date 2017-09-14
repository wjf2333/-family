package com.example.yunyangfamily;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Lijizhou on 2016/1/14.
 * 仅用于演示，Viewpager共用一个Fragment
 */
public class ViewPagerFragment extends Fragment {

    private int page;
    private int color;
    public static final String GETPAGE="get_page";
    public static final String GETCOLOR="get_color";
    public static ViewPagerFragment getInstance(int page,int color){
        Bundle args = new Bundle();
        args.putInt(GETPAGE, page);
        args.putInt(GETCOLOR, color);
        ViewPagerFragment pageFragment = new ViewPagerFragment();
        pageFragment.setArguments(args);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page=getArguments().getInt(GETPAGE);
        color=getArguments().getInt(GETCOLOR);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tv_fragment);
        textView.setText("Page" + page);
        view.setBackgroundResource(color);
        return view;
    }
}
