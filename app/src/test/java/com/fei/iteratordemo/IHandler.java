package com.fei.iteratordemo;

/**
 * @ClassName: IHandler
 * @Description: 责任链设计模式
 * @Author: Fei
 * @CreateDate: 2021/2/24 9:46
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/24 9:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface IHandler<T extends IHandler> {

    public T getNextHandler();
}
