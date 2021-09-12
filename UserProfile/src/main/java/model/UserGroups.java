package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum UserGroups {
        GENERAL("General"),
        SUPER_ADMIN("Super admin"),
        ADMIN("Admin"),
        EDITOR("Editor"),
        AUTHOR("Author");

        private final String name;
        private static final UserGroups[] VALUES = values();
        private static List<UserGroups> listOfUserGroups;
        private static String[] userGroups;

        UserGroups(String s) {
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
                                .map(UserGroups::toString)
                                .toArray(String[]::new);
                }
                return userGroups;
        }

        /**
         * Get enum by position
         * */
        public static UserGroups getGroup(int group) {
                if (listOfUserGroups == null & group >= 0) {
                        listOfUserGroups = Arrays.stream(values())
                                .collect(Collectors.toList());
                }
                return listOfUserGroups.get(group - 1);
        }
}
