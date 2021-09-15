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

    public void printNote(NoteBook noteBook) {
        StringBuilder sb = new StringBuilder();
        System.out.println(String.valueOf(sb.append(this.getFirstNameData()).append(" ").append(this.getLoginData())));
    }
}
