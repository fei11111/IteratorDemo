package com.fei.iteratordemo.simple2.bottom;

import android.view.ViewGroup;

import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;

import com.fei.iteratordemo.R;

/**
 * @ClassName: MainBottomTabItem
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 14:49
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 14:49
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MainBottomTabItem extends BottomTabItem {
    protected MainBottomTabItem(Builder mBuilder) {
        super(mBuilder);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.main_bottom_tab;
    }

    @Override
    public void setSelected(boolean selected) {
        mBuilder.getView(R.id.tv).setSelected(selected);
        mBuilder.getView(R.id.iv).setSelected(selected);
    }

    public static class Builder extends BottomTabItem.Builder<MainBottomTabItem>{
        public  Builder(ViewGroup parent) {
            super(parent);
        }

        @Override
        MainBottomTabItem createBottomTabItem() {
            return new MainBottomTabItem(this);
        }

        public Builder setText(String text){
            setText(R.id.tv,text);
            return this;
        }

        public Builder setIcon(@DrawableRes int drawableId) {
            setIcon(R.id.iv,drawableId);
            return this;
        }
    }
}
