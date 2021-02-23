package com.fei.iteratordemo.simple2.iterator;

import com.fei.iteratordemo.simple2.bottom.BottomTabItem;

/**
 * @ClassName: TabIterator
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 12:02
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 12:02
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface TabIterator<T extends BottomTabItem> {

    public T next();

    public boolean hasNext();
}
