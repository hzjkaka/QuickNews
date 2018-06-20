package com.hzj.quicknews.images.view;

import com.hzj.quicknews.beans.ImageBean;
import com.hzj.quicknews.beans.ImageBean;

import java.util.List;


public interface ImageView {
    void addImages(List<ImageBean> list);
    void showProgress();
    void hideProgress();
    void showLoadFailMsg();
}
