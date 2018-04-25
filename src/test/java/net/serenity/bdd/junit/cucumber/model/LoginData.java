package net.serenity.bdd.junit.cucumber.model;

public class LoginData {


    private String emailAddress;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public void setLoginDetails(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }
}
