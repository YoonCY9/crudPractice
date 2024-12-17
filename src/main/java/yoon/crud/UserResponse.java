package yoon.crud;

public class UserResponse {

    private String name;
    private String loginId;
    private String nickName;

    public String getName() {
        return name;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getNickName() {
        return nickName;
    }

    public UserResponse(String name, String loginId, String nickName) {
        this.name = name;
        this.loginId = loginId;
        this.nickName = nickName;
    }

}
