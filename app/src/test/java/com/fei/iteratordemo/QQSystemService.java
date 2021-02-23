package com.fei.iteratordemo;

import com.fei.iteratordemo.iterator.Aggregator;
import com.fei.iteratordemo.iterator.Iterator;
import com.fei.iteratordemo.iterator.QQIterator;

/**
 * @ClassName: QQSystemService
 * @Description: 模拟服务器获取用户数据，获取到的数据返回形式不一样
 * @Author: Fei
 * @CreateDate: 2021/2/23 9:53
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 9:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class QQSystemService implements Aggregator<UserInfo> {

    private UserInfo[] userInfos;

    public QQSystemService() {
        userInfos = new UserInfo[3];
        userInfos[0] = new UserInfo("测试1","123",23,"男");
        userInfos[1] = new UserInfo("测试2","124443",25,"男");
        userInfos[2] = new UserInfo("测试3","125553",10,"男");
    }

    @Override
    public Iterator<UserInfo> iterator() {
        return new QQIterator(userInfos);
    }
}
