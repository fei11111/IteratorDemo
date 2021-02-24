package com.fei.iteratordemo.simple3;

/**
 * @ClassName: UserInfot
 * @Description: 描述
 * @Author: Fei
 * @CreateDate: 2021/2/23 9:56
 * @UpdateUser: Fei
 * @UpdateDate: 2021/2/23 9:56
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class UserInfo {

    private String userName;
    private String pwd;
    private int age;
    private String sex;

    public UserInfo(String userName, String pwd, int age, String sex) {
        this.userName = userName;
        this.pwd = pwd;
        this.age = age;
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
