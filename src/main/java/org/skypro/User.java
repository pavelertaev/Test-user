package org.skypro;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        if(!login.equals(email)){
            this.login = login;
        }else {
            throw  new LoginNotCorrectException();
        }

        if(email.contains("@")&& email.contains(".")){
            this.email = email;
        }else {
            throw new EmailCorrectException();
        }


    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
