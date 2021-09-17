package model.entities;

import model.DAO.Users;

public class NoteBook {
    private String firstNameData;
    private String loginData;

    public String getFirstNameData() {
        return firstNameData;
    }

    public String getLoginData() {
        return loginData;
    }

    public NoteBook(String firstName, String login) throws NotUniqueLoginException {
        if (Users.checkNickname(login)) {
            throw new NotUniqueLoginException(String.format("User with nickname %s is already registered", login), login);
        }
        firstNameData = firstName;
        loginData = login;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append("Name: ").append(this.getFirstNameData()).append(", login: ").append(this.getLoginData()));
    }
}
