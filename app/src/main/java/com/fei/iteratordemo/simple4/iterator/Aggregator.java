package com.fei.iteratordemo.simple4.iterator;

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
public interface Aggregator<U, T extends Iterator<U>> {

    public T iterator();
}
