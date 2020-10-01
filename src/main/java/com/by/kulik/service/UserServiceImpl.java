package com.by.kulik.service;

import com.by.kulik.domain.User;
import com.by.kulik.repository.UserRepo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    final static Logger logger = Logger.getLogger(UserServiceImpl.class);
  /*  private static final String FIND_BY_ID = "SELECT * FROM user WHERE id = ?";
    private static final String FIND_RICHEST_USER = "SELECT * FROM account LEFT JOIN " +
            "user ON account.userId = user.ID WHERE account = (SELECT MAX(account) FROM account)";
*/
@Autowired
private UserRepo userRepo;
    @Override
    public User getUserByID(int id) {
        return null;
    }

    @Override
    public List<User> getRichestUser() {
        List<User> richestUser = userRepo.getRichestUser();
        return richestUser;
    }

  /*  @Override
    public User getUserByID(int id) {
        User userFromDB = new User();
        try (Connection connection = DbConnector.connection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID)) {

            logger.info("Connection to DB");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            userFromDB.setId(resultSet.getInt(1));
            userFromDB.setName(resultSet.getString(2));
            userFromDB.setSurname(resultSet.getString(3));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            logger.error("error sql query", e);
        }
        return userFromDB;
    }

    @Override
    public List<User> getRichestUser() {
        List<User> richestUser = new ArrayList<>();

        try (Connection connection = DbConnector.connection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(FIND_RICHEST_USER)) {
            {
                logger.info("Connection to DB");
                logger.info("completed query ");
                while (resultSet.next()) {
                    User richestUserFromDB = new User();
                    richestUserFromDB.setId(resultSet.getInt(1));
                    richestUserFromDB.setName(resultSet.getString(5));
                    richestUserFromDB.setSurname(resultSet.getString(6));
                    richestUser.add(richestUserFromDB);
                }
                logger.info("created list with richest user from DB");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            logger.error("error sql query", e);
        }
        return richestUser;
    }*/
}