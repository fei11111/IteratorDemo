package com.fei.iteratordemo;

import java.util.List;

/**
 * @ClassName: WXIterator
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 9:54
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 9:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class WXIterator extends AbsSystemServiceHandler {

    private final List<UserInfo> userInfos;
    public int index = 0;

    public WXIterator(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    @Override
    public UserInfo next() {
        return userInfos.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < userInfos.size();
    }


}
