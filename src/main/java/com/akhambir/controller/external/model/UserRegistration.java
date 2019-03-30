package com.akhambir.controller.external.model;

import com.akhambir.controller.validation.PasswordMatch;
import com.akhambir.model.User;

import javax.validation.constraints.Size;

@PasswordMatch.List(value =
        @PasswordMatch(fieldOne = "password", fieldTwo = "repeatPassword")
)
public class UserRegistration {

    @Size(min = 6, message = "Username must be greater or equal to 8")
    private String username;
    @Size(min = 6, message = "Password must be greater or equal to 8")
    private String password;
    private String repeatPassword;
    private String firstName;
    private String lastName;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static User of(UserRegistration ur) {
        User result = new User();
        result.setUsername(ur.getUsername());
        result.setPassword(ur.getPassword());
        result.setFirstName(ur.getFirstName());
        result.setLastName(ur.getLastName());
        return result;
    }
}
