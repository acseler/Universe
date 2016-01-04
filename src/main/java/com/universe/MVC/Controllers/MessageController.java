package com.universe.MVC.Controllers;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
import com.universe.DAO.DAOLayer.MessageDAO;
import com.universe.DAO.DAOLayer.MessageInfoDAO;
import com.universe.Entity.Account;
import com.universe.Entity.MessageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by boduill on 23.12.15.
 */
@Controller
@Scope("session")
@RequestMapping(value = "/message")
public class MessageController {

    @Autowired
    private MessageInfoDAO messageInfoDAO;

    @Autowired
    private MessageDAO messageDAO;

    @RequestMapping(value = "/{userId}", method = RequestMethod.POST)
    public void sendMessage(@RequestParam("message") String message,
                            @PathVariable long userId) {
        System.out.println(userId);
        System.out.println(message);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getMessagesPage(HttpSession session) {
        Account account = (Account) session.getAttribute("account");
        if (null != account) {
            Map<String, Object> attributes = new HashMap<>();
            session.setAttribute("account", account);
            attributes.put("account", account);
            attributes.put("messageInfo", messageInfoDAO.getMessageInfo(account));
            attributes.put("messages", messageDAO.getMessages(account));
            return new ModelAndView("messages", attributes);
        } else {
            return new ModelAndView("wellcome");
        }
    }
}
