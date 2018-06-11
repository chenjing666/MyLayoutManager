package com.test.mylayoutmanager.gallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.test.mylayoutmanager.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<Integer> mDataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        rv = (RecyclerView) findViewById(R.id.rv);
        mDataList = new ArrayList<>();
        mDataList.add(R.mipmap.pic_1);
        mDataList.add(R.mipmap.pic_2);
        mDataList.add(R.mipmap.pic_3);
        mDataList.add(R.mipmap.pic_4);
        mDataList.add(R.mipmap.pic_5);
        mDataList.add(R.mipmap.pic_6);

        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rv.setAdapter(new CardRvAdapter(this, mDataList));
//        LinearSnapHelper mLinearSnapHelper = new LinearSnapHelper();
//        mLinearSnapHelper.attachToRecyclerView(rv);
        CustomSnapHelper mMySnapHelper = new CustomSnapHelper();
        mMySnapHelper.attachToRecyclerView(rv);
    }
}
