package com.hzj.quicknews.news.model;

import com.hzj.quicknews.beans.NewsBean;

import java.util.List;


public interface OnLoadNewsListListener {

    void onSuccess(List<NewsBean> list);

    void onFailure(String msg, Exception e);
}
