package yoon.crud;

public class User {

    private String name;
    private String loginId;
    private String nickName;
    private String password;

    public String getName() {
        return name;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getNickName() {
        return nickName;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String loginId, String nickName, String password) {
        this.name = name;
        this.loginId = loginId;
        this.nickName = nickName;
        this.password = password;
    }
}
