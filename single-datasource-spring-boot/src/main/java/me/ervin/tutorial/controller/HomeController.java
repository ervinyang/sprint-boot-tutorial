package me.ervin.tutorial.controller;

import me.ervin.tutorial.pojo.UserInfo;
import me.ervin.tutorial.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author zhiyingyang
 * @version 2017-03-20 12:10
 */
@Controller
public class HomeController {

    @Resource
    private TestService testService;

    @GetMapping("/index")
    public ModelAndView list() {
        UserInfo userInfo = testService.selectRecentOne();
        return new ModelAndView("index", "userInfo", userInfo);
    }
}
