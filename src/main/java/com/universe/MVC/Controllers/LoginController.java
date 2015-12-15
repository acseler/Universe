package com.universe.MVC.Controllers;

import com.universe.DAO.Registry.LoginingDAO;
import com.universe.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
* Created by boduill on 08.12.15.
*/
@Controller
@Scope("session")
@RequestMapping(value = "/home")
public class LoginController {

    @Autowired
    private LoginingDAO loginingDAO;

    @Autowired
    private ResourceBundleMessageSource messageSource;

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView doneAuthentication(@RequestParam("auLogin") String login,
                                           @RequestParam("auPassword") String password,
                                           HttpSession session,
                                           RedirectAttributes redirectAttributes) {
        Account account = loginingDAO.checkLoginAndPassword(login, password);
        if (null != account) {
            session.setAttribute("account", account);
            return new ModelAndView("home", "account", account);
        } else {
            redirectAttributes.addFlashAttribute("errorLogining", messageSource.getMessage("errorLogining", null, Locale.getDefault()));
            return new ModelAndView("redirect:/");
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAccountPage(HttpSession session) {
        Account account = (Account) session.getAttribute("account");
        if (null != account) {
            return new ModelAndView("home", "account", account);
        } else {
            return new ModelAndView("wellcome");
        }
    }


}
