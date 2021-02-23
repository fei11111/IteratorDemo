package com.fei.iteratordemo.simple1.iterator;

import com.fei.iteratordemo.simple1.UserInfo;

/**
 * @ClassName: QQIterator
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 9:54
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 9:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class QQIterator implements Iterator<UserInfo> {
    private final UserInfo[] userInfos;
    private int index;

    public QQIterator(UserInfo[] userInfos) {
        this.userInfos = userInfos;
    }

    @Override
    public UserInfo next() {
        return userInfos[index++];
    }

    @Override
    public boolean hasNext() {
        return index < userInfos.length;
    }
}
