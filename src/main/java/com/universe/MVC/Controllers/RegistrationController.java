package com.universe.MVC.Controllers;

import com.universe.DAO.Registry.RegistryDAO;
import com.universe.DAO.tools.ControllerTools;
import com.universe.Entity.Account;
import com.universe.Entity.Login;
import com.universe.Entity.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@Scope("session")
@RequestMapping(value = "/")
public class RegistrationController {

    @Autowired
    private RegistryDAO registryDAO;



    @Autowired
    private ResourceBundleMessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getWellcomePage(HttpSession session) {
        System.out.println((Account) session.getAttribute("account"));
        if (null != session.getAttribute("account")) {
            return new ModelAndView("home", "account", session.getAttribute("account"));
        }
        return new ModelAndView("wellcome");
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView doneRegistry(@Valid RegistrationForm registrationForm,
                                     BindingResult bindingResult,
                                     @RequestParam(value = "avatar", required = true) MultipartFile avatar,
                                     HttpSession session) {

        Login login = ControllerTools.fillLoginFields(registrationForm);
        Account account = login.getAccount();
        session.setAttribute("account", account);
        registryDAO.createAccount(login);
        return new ModelAndView("home", "account", account);
    }

    @RequestMapping(value = "/checkLogin/{login}", method = RequestMethod.GET)
    public @ResponseBody String checkLogin(@PathVariable String login) {
        return registryDAO.checkLoginName(login);
    }

    @RequestMapping(value = "/checkLogin/{login}", method = RequestMethod.POST)
    public @ResponseBody String checkLoginPost(@PathVariable String login) {
        return registryDAO.checkLoginName(login);
    }

}


