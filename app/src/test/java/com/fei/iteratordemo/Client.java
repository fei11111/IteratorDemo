package com.fei.iteratordemo;

import com.fei.iteratordemo.iterator.Iterator;

/**
 * @ClassName: Client
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 10:04
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 10:04
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Client {

    public static void main(String[] args) {


        WXSystemService wxSystemService = new WXSystemService();

        UserInfo userInfo = queryInfo(wxSystemService.iterator(), "测试1", "123");

        if (userInfo == null) {
            QQSystemService qqSystemService = new QQSystemService();
            queryInfo(qqSystemService.iterator(), "测试1", "123");
        }
    }

    private static UserInfo queryInfo(Iterator<UserInfo> iterator, String userName, String pwd) {
        if (iterator.hasNext()) {
            UserInfo userInfo = iterator.next();
            if (userInfo.getUserName().equals(userName) && userInfo.getPwd().equals(pwd)) {
                return userInfo;
            }
        }
        return null;
    }

}
