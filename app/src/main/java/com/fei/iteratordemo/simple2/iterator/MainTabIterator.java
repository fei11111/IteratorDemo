package com.fei.iteratordemo.simple2.iterator;

import com.fei.iteratordemo.simple2.bottom.BottomTabItem;
import com.fei.iteratordemo.simple2.bottom.MainBottomTabItem;

import java.util.List;

/**
 * @ClassName: MainTabIterator
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 14:47
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 14:47
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MainTabIterator implements TabIterator<MainBottomTabItem> {

    private final List<MainBottomTabItem> bottomTabItems;
    private int index = 0;

    public MainTabIterator(List<MainBottomTabItem> bottomTabItems) {
        this.bottomTabItems = bottomTabItems;
    }

    @Override
    public MainBottomTabItem next() {
        return bottomTabItems.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < bottomTabItems.size();
    }
}
