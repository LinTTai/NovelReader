package com.demo.tai.novelview;

import android.view.View;

/**
 * Created by TAI on 2016/1/15.
 */
public abstract class PageAdapter {

    /**
     * @return 页面view
     */
    public abstract View getView();

    public abstract int getCount();

    /**
     * 将内容添加到view中
     *
     * @param view
     *            包含内容的view
     * @param position
     *            第position页
     */
    public abstract void addContent(View view, int position);
}
