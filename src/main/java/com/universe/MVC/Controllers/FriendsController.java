package com.universe.MVC.Controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by boduill on 15.12.15.
 */
@Controller
@Scope("session")
@RequestMapping(value = "/friends")
public class FriendsController {

    public ModelAndView getFriendsList() {
        return null;
    }
}
