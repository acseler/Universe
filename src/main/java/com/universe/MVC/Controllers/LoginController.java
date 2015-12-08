//package com.universe.MVC.Controllers;
//
//import com.universe.DAO.Registry.Logining;
//import com.universe.Entity.Account;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.support.ResourceBundleMessageSource;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpSession;
//import java.util.Locale;
//
///**
// * Created by boduill on 08.12.15.
// */
//@Controller
//@Scope("session")
//@RequestMapping(value = "/home")
//public class LoginController {
//
//    @Autowired
//    private Logining logining;
//
//    @Autowired
//    private ResourceBundleMessageSource messageSource;
//
//    @RequestMapping(method = RequestMethod.POST)
//    public ModelAndView doneAuthentication(@RequestParam("auLogin") String login,
//                                           @RequestParam("auPassword") String password,
//                                           HttpSession session) {
//        Account account = logining.checkLoginAndPassword(login, password);
//        if (null != account) {
//            session.setAttribute("account", account);
//            return new ModelAndView("home", "account", account);
//        } else {
//            return new ModelAndView("wellcome", "errorLogining", messageSource.getMessage("errorLogining", null, Locale.getDefault()));
//        }
//    }
//
//    @RequestMapping(method = RequestMethod.GET)
//    public ModelAndView getAccountPage(HttpSession session) {
//        Account account = (Account) session.getAttribute("account");
//        if (null != account) {
//            return new ModelAndView("home", "account", account);
//        } else {
//            return new ModelAndView("wellcome");
//        }
//    }
//}
