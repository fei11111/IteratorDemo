package com.fei.iteratordemo.simple2.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.fei.iteratordemo.simple2.iterator.TabIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: BottomTabNavigationView
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 11:59
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 11:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BottomTabNavigationView extends LinearLayout {

    private List<BottomTabItem> mBottomTabItems;
    private int mCurrentIndex = 0;

    public BottomTabNavigationView(Context context) {
        this(context, null);
    }

    public BottomTabNavigationView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BottomTabNavigationView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mBottomTabItems = new ArrayList<>();
        setOrientation(HORIZONTAL);
    }

    /**
     * 添加
     *
     * @param tabIterator
     */
    public void addBottomItems(TabIterator tabIterator) {
        mBottomTabItems.clear();
        int index = 0;
        while (tabIterator.hasNext()) {
            BottomTabItem bottomTabItem = tabIterator.next();
            View contentView = bottomTabItem.getContentView();
            addView(contentView);
            setTabClickListener(index, bottomTabItem);
            mBottomTabItems.add(bottomTabItem);
            index++;
        }
        mBottomTabItems.get(mCurrentIndex).setSelected(true);
    }

    private void setTabClickListener(final int index, BottomTabItem bottomTabItem) {
        bottomTabItem.getContentView().setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCurrentIndex != index) {
                    mBottomTabItems.get(mCurrentIndex).setSelected(false);
                    mCurrentIndex = index;
                    mBottomTabItems.get(mCurrentIndex).setSelected(true);
                }
            }
        });
    }

    @Override
    public void addView(View child) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT);
        params.weight = 1;
        params.gravity = Gravity.CENTER;
        super.addView(child, params);
    }
}
