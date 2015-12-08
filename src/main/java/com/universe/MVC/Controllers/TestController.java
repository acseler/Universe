package com.universe.MVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by boduill on 20.09.15.
 */
@Controller
@RequestMapping(value = "/")
public class TestController {
    @RequestMapping (method = RequestMethod.GET)
    public ModelAndView getTestPage() {
        return new ModelAndView("home");
    }
}
