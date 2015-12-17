package com.universe.MVC.Controllers;

import com.universe.DAO.Registry.FriendsDAO;
import com.universe.Entity.Account;
import com.universe.Entity.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by boduill on 15.12.15.
 */
@Controller
@Scope("session")
@RequestMapping(value = "/friends")
public class FriendsController {

    @Autowired
    private FriendsDAO friendsDAO;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getFriendsList(HttpSession session) {
        Account account = (Account) session.getAttribute("account");
        return new ModelAndView("friends", "friendList", friendsDAO.getAccountFriends(account));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView addFriend() {
        return null;
    }
}
