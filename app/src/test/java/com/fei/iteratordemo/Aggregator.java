package com.fei.iteratordemo;

/**
 * @ClassName: Aggregator
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 9:54
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 9:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface Aggregator<T> {

    public T iterator();
}
