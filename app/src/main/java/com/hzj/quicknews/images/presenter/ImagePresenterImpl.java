package com.hzj.quicknews.images.presenter;

import com.hzj.quicknews.beans.ImageBean;
import com.hzj.quicknews.images.model.ImageModel;
import com.hzj.quicknews.images.model.ImageModelImpl;
import com.hzj.quicknews.images.presenter.ImagePresenter;
import com.hzj.quicknews.images.view.ImageView;

import java.util.List;


public class ImagePresenterImpl implements ImagePresenter, ImageModelImpl.OnLoadImageListListener {

    private ImageModel mImageModel;
    private ImageView mImageView;

    public ImagePresenterImpl(ImageView imageView) {
        this.mImageModel = new ImageModelImpl();
        this.mImageView = imageView;
    }

    @Override
    public void loadImageList() {
        mImageView.showProgress();
        mImageModel.loadImageList(this);
    }

    @Override
    public void onSuccess(List<ImageBean> list) {
        mImageView.addImages(list);
        mImageView.hideProgress();
    }

    @Override
    public void onFailure(String msg, Exception e) {
        mImageView.hideProgress();
        mImageView.showLoadFailMsg();
    }
}
