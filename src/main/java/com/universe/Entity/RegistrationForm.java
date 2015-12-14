package com.universe.Entity;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;

/**
 * Created by boduill on 14.12.15.
 */
@Entity
public class RegistrationForm {
    private String login;
    private String password;
    private String universeName;
    private String description;
    private String firstName;
    private String lastName;
    private int birthDayDay;
    private int birthDayMounth;
    private int birthDayYear;
    private String eMail;
    private String hobbies;
    private String profession;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUniverseName() {
        return universeName;
    }

    public void setUniverseName(String universeName) {
        this.universeName = universeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getBirthDayDay() {
        return birthDayDay;
    }

    public void setBirthDayDay(int birthDayDay) {
        this.birthDayDay = birthDayDay;
    }

    public int getBirthDayMounth() {
        return birthDayMounth;
    }

    public void setBirthDayMounth(int birthDayMounth) {
        this.birthDayMounth = birthDayMounth;
    }

    public int getBirthDayYear() {
        return birthDayYear;
    }

    public void setBirthDayYear(int birthDayYear) {
        this.birthDayYear = birthDayYear;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


    @Override
    public String toString() {
        return "RegistrationForm{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", universeName='" + universeName + '\'' +
                ", description='" + description + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDayDay=" + birthDayDay +
                ", birthDayMounth=" + birthDayMounth +
                ", birthDayYear=" + birthDayYear +
                ", eMail='" + eMail + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
