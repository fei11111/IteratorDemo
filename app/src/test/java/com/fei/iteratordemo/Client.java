package com.fei.iteratordemo;

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

        WXIterator wxIterator = new WXSystemService().iterator();
        QQIterator qqIterator = new QQSystemService().iterator();
        wxIterator.setNextHandler(qqIterator);
        UserInfo userInfo = wxIterator.queryUserInfo("测试1", "123");
        System.out.println(userInfo.toString());
    }


}
