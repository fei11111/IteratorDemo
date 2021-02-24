package com.fei.iteratordemo.simple4;

import com.fei.iteratordemo.simple4.face.SystemServiceFace;
import com.fei.iteratordemo.simple4.iterator.QQIterator;
import com.fei.iteratordemo.simple4.iterator.WXIterator;

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
        UserInfo userInfo =  new SystemServiceFace().queryUserInfo("测试1", "123");
        System.out.println(userInfo.toString());
    }


}
