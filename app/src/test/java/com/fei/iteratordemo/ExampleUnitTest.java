package com.fei.iteratordemo;

import com.fei.iteratordemo.simple4.UserInfo;
import com.fei.iteratordemo.simple4.face.SystemServiceFace;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        UserInfo userInfo =  new SystemServiceFace().queryUserInfo("测试1", "123");
        System.out.println(userInfo);
    }
}