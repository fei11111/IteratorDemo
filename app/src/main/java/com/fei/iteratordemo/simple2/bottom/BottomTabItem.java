package com.fei.iteratordemo.simple2.bottom;

import android.content.Context;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: BottomTabItem
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 12:00
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 12:00
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BottomTabItem {

    public final Builder mBuilder;

    protected BottomTabItem(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public abstract int getLayoutRes();

    public abstract void setSelected(boolean selected);

    public View getContentView() {
        return mBuilder.itemView;
    }


    public abstract static class Builder<B extends BottomTabItem> {

        public ViewGroup parent;
        public Context context;
        public View itemView;
        public ViewHelper viewHelper;
        private Map<Integer, String> textMap = new HashMap<>();
        private Map<Integer, Integer> drawableMap = new HashMap<>();

        Builder(ViewGroup parent) {
            this.parent = parent;
            this.context = parent.getContext();
            viewHelper = new ViewHelper();
        }

        public B create() {
            B bottomTabItem = createBottomTabItem();
            int layoutRes = bottomTabItem.getLayoutRes();
            itemView = viewHelper.setContentView(context, layoutRes, parent);
            for (Integer integer : textMap.keySet()) {
                viewHelper.setText(integer,textMap.get(integer));
            }
            for (Integer integer : drawableMap.keySet()) {
                viewHelper.setIcon(integer,drawableMap.get(integer));
            }

            return bottomTabItem;
        }

        public View getView(@IdRes int id) {
            return viewHelper.getView(id);
        }

        protected Builder setText(@IdRes int id, String text) {
            textMap.put(id, text);
            return this;
        }

        protected Builder setIcon(@IdRes int id, @DrawableRes int drawableId) {
            drawableMap.put(id, drawableId);
            return this;
        }

        abstract B createBottomTabItem();

    }

}
