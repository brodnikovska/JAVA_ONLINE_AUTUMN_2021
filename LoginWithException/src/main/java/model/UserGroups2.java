package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum UserGroups2 {
    GENERAL("General"),
    SUPER_ADMIN("Super admin"),
    ADMIN("Admin"),
    EDITOR("Editor"),
    AUTHOR("Author");

    private final String name;
    private static final UserGroups2[] VALUES = values();
    private static List<UserGroups2> listOfUserGroups;
    private static String[] userGroups;

    UserGroups2(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }

    /**
     * Get all enum values as string array
     * */
    public static String[] getUserGroups() {
        if (userGroups == null) {
            userGroups = Stream.of(VALUES)
                    .map(UserGroups2::toString)
                    .toArray(String[]::new);
        }
        return userGroups;
    }

    /**
     * Get enum by position
     * */
    public static UserGroups2 getGroup(int group) {
        if (listOfUserGroups == null & group >= 0) {
            listOfUserGroups = Arrays.stream(values())
                    .collect(Collectors.toList());
        }
        return listOfUserGroups.get(group - 1);
    }
}