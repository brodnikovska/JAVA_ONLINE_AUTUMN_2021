package model.DAO;

public enum Users {
        ID_01("Iryna", "kravi01"),
        ID_02("Kateryna", "savck01"),
        ID_03("Vasyl", "obucv01");

        private final String firstName;
        private final String nickName;

        Users(String firstName, String nickName) {
                this.firstName = firstName;
                this.nickName = nickName;
        }

        public String getFirstName() {
                return firstName;
        }

        public String getNickName() {
                return nickName;
        }

        public static boolean checkNickname(String data) {
                for (Users user : Users.values()) {
                        if (user.getNickName().equals(data)) {
                                return true;
                        }
                }
                return false;
        }
}
