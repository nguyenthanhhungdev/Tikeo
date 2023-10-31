package com.example.tikeo.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tikeo.Adapter.ViewPaperApdapter;
import com.example.tikeo.Fragment.MyVideoLike;
import com.example.tikeo.Fragment.MyVideos;
import com.example.tikeo.Models.Video;
import com.example.tikeo.R;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<Video> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPaper();
    }

    private void initViewPaper() {
        ViewPager viewPager = findViewById(R.id.myViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.myTabLayout);
        ViewPaperApdapter viewPaperAdapter = new ViewPaperApdapter(getSupportFragmentManager());
        viewPaperAdapter.addFragment(new MyVideos(), "My Video");
        viewPaperAdapter.addFragment(new MyVideoLike(), "Video yêu thích");
        viewPager.setAdapter(viewPaperAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }


}