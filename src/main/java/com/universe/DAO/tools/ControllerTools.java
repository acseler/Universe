package com.universe.DAO.tools;

import com.universe.Entity.Account;
import com.universe.Entity.Login;
import com.universe.Entity.RegistrationForm;
import com.universe.Entity.Universe;

import java.util.GregorianCalendar;

/**
 * Created by boduill on 01.12.15.
 */
public class ControllerTools {
    private static Universe fillUniverseFields(RegistrationForm registrationForm) {
        Universe universe = new Universe();
        universe.setUnverseName(registrationForm.getUniverseName());
        universe.setDescription(registrationForm.getDescription());
        universe.setUnTable(registrationForm.getUniverseName().
                toLowerCase().trim().replace(' ', '_'));
        return universe;
    }

    public static Login fillLoginFields(RegistrationForm registrationForm) {
        Login loginEn = new Login();
        loginEn.setLogin(registrationForm.getLogin());
        loginEn.setPassword(registrationForm.getPassword());
        loginEn.setAccount(fillAccountFields(registrationForm));
        return loginEn;
    }

    private static Account fillAccountFields(RegistrationForm registrationForm){
        Account account = new Account();
        account.setFirstName(registrationForm.getFirstName());
        account.setLastName(registrationForm.getLastName());
        account.setBirthDay(new GregorianCalendar(registrationForm.getBirthDayMounth(),
                registrationForm.getBirthDayDay(),
                registrationForm.getBirthDayYear()).getTime());
        account.seteMail(registrationForm.geteMail());
        account.setProfession(registrationForm.getProfession());
        account.setHobbies(registrationForm.getHobbies());
        account.setUniverse(fillUniverseFields(registrationForm));
        return account;
    }
}
