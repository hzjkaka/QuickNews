package com.hzj.quicknews.news.model;

import com.hzj.quicknews.beans.NewsDetailBean;


public interface OnLoadNewsDetailListener {

    void onSuccess(NewsDetailBean newsDetailBean);

    void onFailure(String msg, Exception e);
}
