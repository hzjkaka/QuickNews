package com.hzj.quicknews.news.view;

import com.hzj.quicknews.beans.NewsBean;

import java.util.List;


public interface NewsView {

    void showProgress();

    void addNews(List<NewsBean> newsList);

    void hideProgress();

    void showLoadFailMsg();
}
