package controller;

public interface RegexContainer {
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    String REGEX_EMAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    String REGEX_MOBILE_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    String REGEX_PHONE = "^\\d{3}-\\d{2}-\\d{2}$";
    String REGEX_ZIP = "\\d{5}$";
    String REGEX_APARTMENT = "\\d{1,3}$";
    String REGEX_STREET_LAT = "^[A-Z [0-9-]][a-z' [0-9-]]*$";
    String REGEX_STREET_UKR = "^[А-ЩЬЮЯҐІЇЄ [0-9-]][а-щьюяґіїє' [0-9-]]*$";
    String REGEX_CITY_LAT = "^[A-Z ][a-z ]*$";
    String REGEX_CITY_UKR = "^[А-ЩЬЮЯҐІЇЄ ][а-щьюяґіїє' ]*$";
    String REGEX_HOUSE_UKR = "^[0-9[а-щьюяґіїє]]{1,4}$";
    String REGEX_HOUSE_LAT = "^[0-9[a-z]]{1,4}$";
    String REGEX_SKYPE = "^live:.cid.[0-9[a-z]]{16}$";
    String REGEX_GROUP_ENUM = "[12345]$";
}
