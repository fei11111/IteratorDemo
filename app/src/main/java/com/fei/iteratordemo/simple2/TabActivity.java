package com.fei.iteratordemo.simple2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.fei.iteratordemo.R;
import com.fei.iteratordemo.simple2.bottom.BottomTabNavigationView;
import com.fei.iteratordemo.simple2.bottom.MainBottomTabItem;
import com.fei.iteratordemo.simple2.iterator.MainTabIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TabActivity
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 11:58
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 11:58
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class TabActivity extends AppCompatActivity {

    private BottomTabNavigationView mBottomTab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        mBottomTab = findViewById(R.id.bottom_tab);

        List<MainBottomTabItem> bottomTabItems = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            MainBottomTabItem mainBottomTabItem = new MainBottomTabItem.Builder(mBottomTab).setText("测试" + i).create();
            bottomTabItems.add(mainBottomTabItem);
        }
        MainTabIterator mainTabIterator = new MainTabIterator(bottomTabItems);
        mBottomTab.addBottomItems(mainTabIterator);
    }
}
