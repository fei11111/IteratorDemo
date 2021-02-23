package com.fei.iteratordemo.simple1;

import com.fei.iteratordemo.simple1.iterator.Aggregator;
import com.fei.iteratordemo.simple1.iterator.Iterator;
import com.fei.iteratordemo.simple1.iterator.WXIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: WXSystemService
 * @Description: 模拟服务器获取用户数据，获取到的数据返回形式不一样
 * @Author: Fei
 * @CreateDate: 2021/2/23 9:53
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 9:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class WXSystemService implements Aggregator<UserInfo> {

    private List<UserInfo> userInfos;

    public WXSystemService() {
        userInfos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            UserInfo userInfo = new UserInfo("测试1" + i, "123" + i, 23 + i, "男");
            userInfos.add(userInfo);
        }

    }

    @Override
    public Iterator<UserInfo> iterator() {
        return new WXIterator(userInfos);
    }

}
