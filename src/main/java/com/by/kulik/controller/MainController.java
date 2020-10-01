package com.by.kulik.controller;

import com.by.kulik.domain.User;
import com.by.kulik.repository.AccountRepo;
import com.by.kulik.repository.UserRepo;
import com.by.kulik.service.AccountService;
import com.by.kulik.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    final static Logger logger = Logger.getLogger(MainController.class);
    @Autowired
    private AccountService accountService;
    @Autowired
    private UserService userService;

    @GetMapping
    public String mainPage() {
        return "view";
    }

    @GetMapping("/getRichestUser")
    public String getRichestUser(Model model) {
        logger.info("case: get richest User");
        List<User> richestUser = userService.getRichestUser();
        model.addAttribute("richestUser", richestUser);
        return "richUser";
    }

    @GetMapping("/getAccountSum")
    public String getAccountSum(Model model) {
        logger.info("case:get accounts sum");
         int accountsSum = accountService.getAccountsSum();
        model.addAttribute("accountSum", accountsSum);
        System.out.println(accountsSum);
        return "accountSum";
    }

}

