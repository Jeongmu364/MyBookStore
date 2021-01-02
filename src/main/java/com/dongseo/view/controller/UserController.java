package com.dongseo.view.controller;

import com.dongseo.business.user.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.text.normalizer.NormalizerBase;

@Controller
public class UserController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginView(UserVo vo) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(UserVo vo) {
        ModelAndView mav = new ModelAndView();

        return null;
    }
}
