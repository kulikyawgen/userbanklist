package com.by.kulik.service;

import com.by.kulik.repository.AccountRepo;
import com.by.kulik.util.DbConnector;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountRepoImpl implements AccountRepo {
    private final static Logger logger = Logger.getLogger(AccountRepoImpl.class);
    private static final String SQL_QUERY = "SELECT SUM(account) FROM account";

    @Override
    public int getAccountsSum() {
        int sum = 0;

        try (Connection connection = DbConnector.connection();
             Statement statement = connection.createStatement()
        ) {
            logger.info("Connection to DB");
            ResultSet resultSet = statement.executeQuery(SQL_QUERY);
            logger.info("completed query: SELECT SUM(account) FROM account");
            resultSet.next();
            sum = resultSet.getInt(1);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            logger.error("error sql query from DB", e);
        }
        return sum;
    }
}