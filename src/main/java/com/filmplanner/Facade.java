package com.filmplanner;

import com.filmplanner.dao.PostgreDAOFactory;
import com.filmplanner.framework.AbstractDAOFactory;
import com.filmplanner.framework.UserDAO;

public class Facade {

    private AbstractDAOFactory daoFactory;
    private UserDAO userDAO;

    /**
     * Instantiates a Facade which gives the UI access to the business logic.
     */
    public Facade() {
        this.daoFactory = new PostgreDAOFactory();
        this.userDAO = this.daoFactory.getUserDAO();
    }

    /**
     * Attempts to login with the given credentials.
     * @param email the user's email
     * @param password the user's password
     * @return the corresponding user instance if the credentials are correct; otherwise throws a RuntimeException
     */
    public User login(String email, String password) {
        User user = this.userDAO.find(email);
        if (user.getPassword().equals(password)) {
            return user;
        }
        throw new RuntimeException("Incorrect password.");
    }
}
