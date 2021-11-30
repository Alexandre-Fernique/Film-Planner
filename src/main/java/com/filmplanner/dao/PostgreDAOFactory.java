package com.filmplanner.dao;

import com.filmplanner.framework.AbstractDAOFactory;
import com.filmplanner.framework.UserDAO;

public class PostgreDAOFactory extends AbstractDAOFactory {

    private UserDAO userDAO;

    /**
     * Gets the PostgreUserDAO. This function makes sure only one instance
     * of PostgreUserDAO can exist at the same time.
     * @return the PostgreUserDAO instance
     */
    @Override
    public UserDAO getUserDAO() {
        if (userDAO == null) {
            this.userDAO = new PostgreUserDAO();
        }
        return this.userDAO;
    }
}
