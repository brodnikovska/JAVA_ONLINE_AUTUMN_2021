package model.entities;

public class NotUniqueLoginException extends Exception{
    private String loginData;

    public String getLoginData() {
        return loginData;
    }

    public NotUniqueLoginException(String message, String nicknameData) {
        super(message);
        this.loginData = nicknameData;
    }
}
