package com.universe.MVC.Controllers;

import com.universe.DAO.Registry.EditProfileDAO;
import com.universe.DAO.tools.ControllerTools;
import com.universe.Entity.Account;
import com.universe.Entity.EditProfileForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

/**
 * Created by boduill on 14.12.15.
 */
@Controller
@Scope("session")
@RequestMapping("/edit")
public class EditController {

    @Autowired
    private EditProfileDAO editProfileDAO;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getChangeUserInfoPage(HttpSession session) {
        Account account = (Account) session.getAttribute("account");
        if (null == account) {
            return new ModelAndView("wellcome");
        }
        return new ModelAndView("edit", "account", account);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView changeUserInfo(@Valid EditProfileForm editProdfileForm,
                                       BindingResult bindingResult,
                                       @RequestParam(value = "avatar") MultipartFile avatar,
                                       HttpSession session) throws IOException {
        Account account = (Account) session.getAttribute("account");
        if (null == account) {
            return new ModelAndView("wellcome");
        }
        account = ControllerTools.editUserProfile(account, editProdfileForm);
        System.out.println(editProdfileForm);
        System.out.println(account);
        System.out.println("file name : " + avatar.getOriginalFilename());
        System.out.println("Content type " + avatar.getContentType());
        ControllerTools.saveImage(avatar);
        editProfileDAO.changeUserProfile(account);
        return new ModelAndView("edit", "account", account);
    }
}
