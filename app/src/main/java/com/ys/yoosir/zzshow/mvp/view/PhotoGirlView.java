package com.ys.yoosir.zzshow.mvp.view;

import com.ys.yoosir.zzshow.mvp.model.entity.photos.PhotoGirl;
import com.ys.yoosir.zzshow.mvp.base.BaseView;

import java.util.List;

/**
 * @version 1.0
 * @author  yoosir
 * Created by Administrator on 2016/11/29.
 */

public interface PhotoGirlView extends BaseView{

    void updateListView(List<PhotoGirl> photoGirlList,int loadType);

    void updateErrorView(int loadType);
}
