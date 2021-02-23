package com.fei.iteratordemo.simple2.iterator;

import com.fei.iteratordemo.simple2.bottom.BottomTabItem;

import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName: SetTabIterator
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 15:08
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 15:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SetTabIterator implements TabIterator<BottomTabItem> {

    private final Set<BottomTabItem> bottomTabItemSet;
    private Iterator<BottomTabItem> iterator;

    public SetTabIterator(Set<BottomTabItem> bottomTabItemSet) {
        this.bottomTabItemSet = bottomTabItemSet;
        iterator  = bottomTabItemSet.iterator();
    }

    @Override
    public BottomTabItem next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
