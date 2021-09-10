package controller;

public interface RegexContainer {
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    String REGEX_EMAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    String REGEX_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    String REGEX_ZIP = "\\d{5}$";
    String REGEX_STREET_LAT = "(^[A-Z [0-9-]][a-z' [0-9-]]{1,30}){1,}";
    String REGEX_STREET_UKR = "(^[А-ЩЬЮЯҐІЇЄ [0-9-]][а-щьюяґіїє' [0-9-]]{1,30}){1,}";
    String REGEX_CITY_LAT = "(^[A-Z ][A-Z ]{2,30}){1,}";
    String REGEX_CITY_UKR = "(^[А-ЩЬЮЯҐІЇЄ ][а-щьюяґіїє' ]{2,30}){1,}";
}
