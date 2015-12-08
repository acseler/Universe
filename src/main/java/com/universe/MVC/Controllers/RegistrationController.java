//package com.universe.MVC.Controllers;
//
//import com.universe.DAO.Registry.RegistryDAO;
//import com.universe.DAO.tools.ControllerTools;
//import com.universe.Entity.Account;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.support.ResourceBundleMessageSource;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpSession;
//import java.util.GregorianCalendar;
//
//@Controller
//@Scope("session")
//@RequestMapping(value = "/")
//public class RegistrationController {
//
//    @Autowired
//    private RegistryDAO registryDAO;
//
//
//
//    @Autowired
//    private ResourceBundleMessageSource messageSource;
//
//    @RequestMapping(method = RequestMethod.GET)
//    public ModelAndView getWellcomePage(HttpSession session) {
//        System.out.println((Account) session.getAttribute("account"));
//        if (null != session.getAttribute("account")) {
//            return new ModelAndView("home", "account", session.getAttribute("account"));
//        }
//        return new ModelAndView("wellcome");
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public ModelAndView doneRegistry(@ModelAttribute("regForm") Account account,
//                                     @RequestParam("universeName") String name,
//                                     @RequestParam("description") String description,
//                                     @RequestParam("birthDayDay") int day,
//                                     @RequestParam("birthDayMounth") int mounth,
//                                     @RequestParam("birthDayYear") int year,
//                                     @RequestParam("login") String login,
//                                     @RequestParam("password") String password,
//                                     HttpSession session) {
//        account.setUniverse(ControllerTools.fillUniverseFields(name, description));
//        account.setBirthDay(new GregorianCalendar(year, mounth - 1, day).getTime());
//        System.out.println(account);
//        registryDAO.createAccount(account, ControllerTools.fillLoginFields(login, password, account));
//        session.setAttribute("account", account);
//        return new ModelAndView("home", "account", account);
//    }
//
//
//
//}
//
//
