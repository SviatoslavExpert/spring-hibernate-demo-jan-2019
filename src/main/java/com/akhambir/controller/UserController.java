package com.akhambir.controller;

import com.akhambir.controller.external.model.UserRegistration;
import com.akhambir.model.User;
import com.akhambir.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(ModelAndView vm) {
        vm.addObject("user", new User());
        vm.setViewName("login");
        return vm;
    }

    /*@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute User user) {
        User u = userService.getByUsername(user.getUsername());
        // some logic
        return "login";
    }*/

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register(ModelAndView vm) {
        vm.addObject("userRegistration", new UserRegistration());
        vm.setViewName("register");
        return vm;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(@ModelAttribute @Valid UserRegistration ur, BindingResult br, ModelAndView vm) {
        if (br.hasErrors()) {
            return new ModelAndView("register", br.getModel());
        }
        User user = UserRegistration.of(ur);
        vm.addObject("user", userService.register(user));
        vm.setViewName("welcome");
        return vm;
    }
}
