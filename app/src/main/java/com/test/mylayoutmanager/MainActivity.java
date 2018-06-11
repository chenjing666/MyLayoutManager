package com.test.mylayoutmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.test.mylayoutmanager.gallery.GalleryActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*rvb_indicatorSelectedSrc 设置底部导航指示器或者点选中的样式
    rvb_indicatorUnselectedSrc 设置底部导航指示器或者点未选中状态的样式
    rvb_interval 设置轮播图滚动间隔时间
    rvb_showIndicator 设置是否显示底部指示导航小圆点
    rvb_indicatorSize 设置指示器的大小
    rvb_indicatorSpace 设置轮播指示器的间隔
    rvb_indicatorMargin 设置轮播指示器Indicator距离外边框的间距
    rvb_indicatorGravity 设置底部轮播导航指示器的位置 [left，center，right]
    rvb_autoPlaying：是否自动滚动，true自动滚动，false禁止自动滚动*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.gallery).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GalleryActivity.class));
            }
        });
//        RecyclerViewBanner recyclerViewBanner1 = (RecyclerViewBanner) findViewById(R.id.rv_banner_1);
        RecyclerViewBanner recyclerViewBanner2 = (RecyclerViewBanner) findViewById(R.id.rv_banner_2);
//        RecyclerViewBanner recyclerViewBanner3 = (RecyclerViewBanner) findViewById(R.id.rv_banner_3);
//        RecyclerViewBanner recyclerViewBanner4 = (RecyclerViewBanner) findViewById(R.id.rv_banner_4);
//        RecyclerViewBanner recyclerViewBanner5 = (RecyclerViewBanner) findViewById(R.id.rv_banner_5);

        final List<Banner> banners = new ArrayList<>();
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1487221110004&di=d6043e4b0c90ddf3ea5096c3d8eb8f58&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2014%2F067%2F5116EPAUD762_1000x500.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490438881557&di=e61065ccc8d7b44591e1c4ba8df672ee&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F18d8bc3eb13533fa00428309a0d3fd1f41345b24.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1487221110004&di=d6043e4b0c90ddf3ea5096c3d8eb8f58&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2014%2F067%2F5116EPAUD762_1000x500.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490438881557&di=e61065ccc8d7b44591e1c4ba8df672ee&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F18d8bc3eb13533fa00428309a0d3fd1f41345b24.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1487221110004&di=d6043e4b0c90ddf3ea5096c3d8eb8f58&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2014%2F067%2F5116EPAUD762_1000x500.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490438881557&di=e61065ccc8d7b44591e1c4ba8df672ee&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F18d8bc3eb13533fa00428309a0d3fd1f41345b24.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1487221110004&di=d6043e4b0c90ddf3ea5096c3d8eb8f58&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2014%2F067%2F5116EPAUD762_1000x500.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490438881557&di=e61065ccc8d7b44591e1c4ba8df672ee&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2F18d8bc3eb13533fa00428309a0d3fd1f41345b24.jpg"));
        banners.add(new Banner("http://jiashizhan.51vip.biz:8088/images/a1.jpg"));
        banners.add(new Banner("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490440556037&di=ade75ba29126922124b063a2a57873f7&imgtype=0&src=http%3A%2F%2Fi2.download.fd.pchome.net%2Ft_960x600%2Fg1%2FM00%2F0E%2F05%2FooYBAFTbGOmIDPSLAAXPs6l7AQMAACSVgDyBqkABc_L421.jpg"));
        //recyclerViewBanner1.setRvAutoPlaying(false);
//        recyclerViewBanner1.setRvBannerData(banners);
//        recyclerViewBanner1.setOnSwitchRvBannerListener(new RecyclerViewBanner.OnSwitchRvBannerListener() {
//            @Override
//            public void switchBanner(int position, AppCompatImageView bannerView) {
//                Glide.with(bannerView.getContext())
//                        .load(banners.get(position).getUrl())
//                        .placeholder(R.mipmap.ic_launcher)
//                        .into(bannerView);
//            }
//        });
//        recyclerViewBanner1.setOnRvBannerClickListener(new RecyclerViewBanner.OnRvBannerClickListener() {
//            @Override
//            public void onClick(int position) {
//                Toast.makeText(MainActivity.this, "position: " + position, Toast.LENGTH_SHORT).show();
//            }
//        });

        recyclerViewBanner2.setRvBannerData(banners);
        recyclerViewBanner2.setOnSwitchRvBannerListener(new RecyclerViewBanner.OnSwitchRvBannerListener() {
            @Override
            public void switchBanner(int position, AppCompatImageView bannerView) {
                Glide.with(bannerView.getContext())
                        .load(banners.get(position).getUrl())
                        .placeholder(R.mipmap.ic_launcher)
                        .into(bannerView);
            }
        });
        recyclerViewBanner2.setOnRvBannerClickListener(new RecyclerViewBanner.OnRvBannerClickListener() {
            @Override
            public void onClick(int position) {
                //点击事件
                Toast.makeText(MainActivity.this, "点击了第" + position + "张图", Toast.LENGTH_SHORT).show();
            }
        });
//        recyclerViewBanner3.setRvBannerData(banners);
//        recyclerViewBanner3.setOnSwitchRvBannerListener(new RecyclerViewBanner.OnSwitchRvBannerListener() {
//            @Override
//            public void switchBanner(int position, AppCompatImageView bannerView) {
//                Glide.with(bannerView.getContext())
//                        .load(banners.get(position).getUrl())
//                        .placeholder(R.mipmap.ic_launcher)
//                        .into(bannerView);
//            }
//        });
//        recyclerViewBanner4.setIndicatorInterval(2000);
//        recyclerViewBanner4.setRvBannerData(banners);
//        recyclerViewBanner4.setOnSwitchRvBannerListener(new RecyclerViewBanner.OnSwitchRvBannerListener() {
//            @Override
//            public void switchBanner(int position, AppCompatImageView bannerView) {
//                Glide.with(bannerView.getContext())
//                        .load(banners.get(position).getUrl())
//                        .placeholder(R.mipmap.ic_launcher)
//                        .into(bannerView);
//            }
//        });
//        recyclerViewBanner5.setRvBannerData(banners);
//        recyclerViewBanner5.setOnSwitchRvBannerListener(new RecyclerViewBanner.OnSwitchRvBannerListener() {
//            @Override
//            public void switchBanner(int position, AppCompatImageView bannerView) {
//                Glide.with(bannerView.getContext())
//                        .load(banners.get(position).getUrl())
//                        .placeholder(R.mipmap.ic_launcher)
//                        .into(bannerView);
//            }
//        });
    }

    private class Banner {

        String url;

        public Banner(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }
    }
}