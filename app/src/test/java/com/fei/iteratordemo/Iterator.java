package com.fei.iteratordemo;

/**
 * @ClassName: Iterator
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 9:53
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 9:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Iterator<T> {

    public T next();

    public boolean hasNext();

}
