package com.fei.iteratordemo;

/**
 * @ClassName: IUserInfo
 * @Description: 业务处理接口
 * @Author: Fei
 * @CreateDate: 2021/2/24 9:48
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/24 9:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface IUserInfo {

    public UserInfo queryUserInfo(String userName, String pwd);

}
