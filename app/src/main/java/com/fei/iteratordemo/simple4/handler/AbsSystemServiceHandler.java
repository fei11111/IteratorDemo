package com.fei.iteratordemo.simple4.handler;

import com.fei.iteratordemo.simple4.UserInfo;
import com.fei.iteratordemo.simple4.iterator.Iterator;

/**
 * @ClassName: SystemServiceHandler
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/24 9:50
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/24 9:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class AbsSystemServiceHandler implements IHandler<AbsSystemServiceHandler>, IUserInfo, Iterator<UserInfo> {

    private AbsSystemServiceHandler mNextHandler;

    public void setNextHandler(AbsSystemServiceHandler nextHandler) {
        this.mNextHandler = nextHandler;
    }

    @Override
    public AbsSystemServiceHandler nextHandler() {
        return mNextHandler;
    }

    @Override
    public UserInfo queryUserInfo(String userName, String pwd) {
        while (hasNext()) {
            UserInfo userInfo = next();
            if (userInfo.getUserName().equals(userName) && userInfo.getPwd().equals(pwd)) {
                return userInfo;
            }
        }
        AbsSystemServiceHandler absSystemServiceHandler = nextHandler();
        if (absSystemServiceHandler != null) {
            return absSystemServiceHandler.queryUserInfo(userName, pwd);
        }
        return null;
    }
}
