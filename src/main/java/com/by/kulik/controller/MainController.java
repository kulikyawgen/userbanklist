package com.by.kulik.controller;

import com.by.kulik.domain.User;
import com.by.kulik.repository.AccountRepo;
import com.by.kulik.repository.UserRepo;
import com.by.kulik.service.AccountRepoImpl;
import com.by.kulik.service.UserRepoImpl;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/dispatcher")
public class MainController extends HttpServlet {
    final static Logger logger = Logger.getLogger(MainController.class);
    private AccountRepo accountRepo = new AccountRepoImpl();
    private UserRepo userRepo = new UserRepoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doAction(req, resp);
    }

    public void doAction(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        logger.info("get parameter action");
        String action = req.getParameter("action");
      logger.info(action);
        switch (action) {
            case ("get accounts sum"):
                logger.info("case:get accounts sum");
                req.setAttribute("accountSum", accountRepo.getAccountsSum());
                req.getRequestDispatcher("accountSum.jsp").forward(req, resp);
                break;
            case ("get richest User"):
                logger.info("case: get richest User");
                List<User> richestUser = userRepo.getRichestUser();
                req.setAttribute("richestUser", richestUser);
                req.getRequestDispatcher("richUser.jsp").forward(req, resp);
                break;
        }
    }
}

