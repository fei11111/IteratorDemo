package com.fei.iteratordemo;

import android.util.Log;

import com.fei.iteratordemo.iterator.Iterator;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        WXSystemService wxSystemService = new WXSystemService();

        UserInfo userInfo = queryInfo(wxSystemService.iterator(), "测试1", "123");

        if (userInfo == null) {
            QQSystemService qqSystemService = new QQSystemService();
            userInfo = queryInfo(qqSystemService.iterator(), "测试1", "123");
        }

        if (userInfo != null) {
           System.out.println(userInfo.toString());
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