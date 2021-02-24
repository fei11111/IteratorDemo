package com.fei.iteratordemo.simple4.face;

import com.fei.iteratordemo.simple4.QQSystemService;
import com.fei.iteratordemo.simple4.UserInfo;
import com.fei.iteratordemo.simple4.WXSystemService;
import com.fei.iteratordemo.simple4.handler.AbsSystemServiceHandler;
import com.fei.iteratordemo.simple4.handler.IUserInfo;
import com.fei.iteratordemo.simple4.iterator.QQIterator;

/**
 * @ClassName: SystemServiceFace
 * @Description: 门面设计模式
 * @Author: Fei
 * @CreateDate: 2021/2/24 11:20
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/24 11:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SystemServiceFace implements IUserInfo {

    private AbsSystemServiceHandler mFirstHandler;

    public SystemServiceFace() {
        mFirstHandler = new WXSystemService().iterator();
        QQIterator qqIterator = new QQSystemService().iterator();
        mFirstHandler.setNextHandler(qqIterator);
    }


    @Override
    public UserInfo queryUserInfo(String userName, String pwd) {
        return mFirstHandler.queryUserInfo(userName, pwd);
    }
}
