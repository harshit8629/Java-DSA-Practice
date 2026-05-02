class UserAccount {

    private String password;

    void setPassword(String password) {

        if (password.length() >= 8) {
            this.password = password;
            System.out.println("Password Updated");
        } else {
            System.out.println("Invalid Password");
        }
    }

    String getPassword() {
        return password;
    }

    public static void main(String[] args) {

        UserAccount account = new UserAccount();

        account.setPassword("java1234");

        System.out.println("Password: " + account.getPassword());
    }
}