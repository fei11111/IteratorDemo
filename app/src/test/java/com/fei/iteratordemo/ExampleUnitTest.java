package com.fei.iteratordemo;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        WXIterator wxIterator = new WXSystemService().iterator();
        QQIterator qqIterator = new QQSystemService().iterator();
        wxIterator.setNextHandler(qqIterator);
        UserInfo userInfo = wxIterator.queryUserInfo("测试1", "1243");
        System.out.println(userInfo);
    }
}