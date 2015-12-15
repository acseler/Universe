package com.universe.DAO.tools;

import com.universe.Entity.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
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

    private static Account fillAccountFields(RegistrationForm registrationForm) {
        Account account = new Account();
        account.setFirstName(registrationForm.getFirstName());
        account.setLastName(registrationForm.getLastName());
        account.setBirthDay(new GregorianCalendar(registrationForm.getBirthDayYear(),
                registrationForm.getBirthDayMounth() - 1,
                registrationForm.getBirthDayDay()
        ).getTime());
        account.seteMail(registrationForm.geteMail());
        account.setProfession(registrationForm.getProfession());
        account.setHobbies(registrationForm.getHobbies());
        account.setUniverse(fillUniverseFields(registrationForm));
        return account;
    }

    public static Account editUserProfile(Account account, EditProfileForm editProfileForm) {
        account.setFirstName(editProfileForm.getFirstName());
        account.setLastName(editProfileForm.getLastName());
        account.setBirthDay(new GregorianCalendar(editProfileForm.getBirthDayYear(),
                editProfileForm.getBirthDayMounth() - 1, editProfileForm.getBirthDayDay()).getTime());
        account.seteMail(editProfileForm.geteMail());
        account.setProfession(editProfileForm.getProfession());
        account.setHobbies(editProfileForm.getHobbies());
        return account;
    }

    public static void saveImage(MultipartFile image) throws IOException {
        File convFile = new File("../webapps/ROOT/pages/avatars/" + image.getOriginalFilename());
        convFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(image.getBytes());
        fos.flush();
        fos.close();
//            return convFile;
    }
}

