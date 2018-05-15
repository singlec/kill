package com.imooc.kill.controller;

import com.imooc.kill.VO.ResultVO;
import com.imooc.kill.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create By 一条狗
 * 2018/5/12 16:22
 */
@Controller
public class HelloController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/hello/{id}")
    @ResponseBody
    public ResultVO hello(@PathVariable("id")String id) {
        
        return new ResultVO();
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        String name = userDao.findName(1);
        model.addAttribute("name", name);
        return "thymeleaf";
    }

}
