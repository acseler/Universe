package com.universe.MVC.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by boduill on 23.12.15.
 */
@Controller
@RequestMapping(value = "/message")
public class MessageController {

    @RequestMapping(value = "/{userId}", method = RequestMethod.POST)
    public void sendMessage(@RequestParam("message") String message,
                            @PathVariable long userId) {
        System.out.println(userId);
        System.out.println(message);
    }
}
