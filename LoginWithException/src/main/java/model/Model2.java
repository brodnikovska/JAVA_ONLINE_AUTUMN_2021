package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Model2 {
    private String lastName;
    private String firstName;
    private String fathersName;
    private String login;
    private String usersName;
    private String email;
    private String phone;
    private String mobilePhone;
    private String zipCode;
    private String city;
    private String houseNumber;
    private String apartmentNumber;
    private String street;
    private String address;
    private String skypeName;
    private Date date;
    private UserGroups2 userGroup;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    /**
     * Method sets user's name as last name + 1-st letter of first name + dot from previously entered data
     * */
    public void setUsersName() {
        StringBuilder concatString = new StringBuilder();
        this.usersName = concatString.append(lastName).append(" ").append(firstName.charAt(0)).append(".").toString();
    }

    public String getUsersName() {
        return usersName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserGroups2 getUserGroup() {
        return userGroup;
    }

    /**
     * Method returns set current date and time in format comfortable for reading
     * */
    public String getDate() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        return formatter.format(date);
    }

    /**
     * Method sets current date and time
     * */
    public void setDate() {
        this.date = new Date(System.currentTimeMillis());
    }

    public String getAddress() {
        return address;
    }

    /**
     * Method sets user's address as zip code + city + street + house + apartment from previously entered data
     * */
    public void setAddress() {
        StringBuilder concatString = new StringBuilder();
        this.address = concatString.append(zipCode).append(", ").append(city).append(", ").append(street).append(", ")
                .append(houseNumber).append(", ").append(apartmentNumber).toString();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setSkypeName(String skypeName) {
        this.skypeName = skypeName;
    }

    /**
     * Method sets user group as one from the enum Class
     * */
    public void setUserGroup(UserGroups2 userGroup) {
        this.userGroup = userGroup;
    }
}