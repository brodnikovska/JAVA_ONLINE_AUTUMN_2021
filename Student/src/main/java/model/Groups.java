package model;

public enum Groups {
    FIRST_COURSE_MICROELECTRONICS("DM-35"),
    FIRST_COURSE_TELECOMMUNICATIONS("DZ-35"),
    SECOND_COURSE_SEMICONDUCTORS("DP-34"),
    THIRD_COURSE_BIOMEDICAL_ELECTRONICS("DM-31");

    private final String name;

    Groups(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
