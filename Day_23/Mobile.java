class Mobile {

    private String password;

    void setPassword(String password) {
        this.password = password;
    }

    String getPassword() {
        return password;
    }

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.setPassword("abcd123");

        System.out.println("Password: " + mobile.getPassword());
    }
}