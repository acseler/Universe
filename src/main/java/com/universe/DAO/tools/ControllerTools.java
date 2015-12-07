package com.universe.DAO.tools;

import com.universe.Entity.Account;
import com.universe.Entity.Login;
import com.universe.Entity.Universe;

/**
 * Created by boduill on 01.12.15.
 */
public class ControllerTools {
    public static Universe fillUniverseFields(String name, String descroption) {
        Universe universe = new Universe();
        universe.setUnverseName(name);
        universe.setDescription(descroption);
        universe.setUnTable(name.toLowerCase().trim().replace(' ', '_'));
        return universe;
    }

    public static Login fillLoginFields(String login, String password, Account account) {
        Login loginEn = new Login();
        loginEn.setLogin(login);
        loginEn.setPassword(password);
        loginEn.setAccount(account);
        return loginEn;
    }

    public static Account setAccountUniverse(Account account, Universe universe) {
        Account result = account;
        result.setUniverse(universe);
        return result;
    }
}
