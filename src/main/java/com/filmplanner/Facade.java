package com.filmplanner;

import com.filmplanner.dao.AbstractDAOFactory;
import com.filmplanner.dao.UserDAO;

public class Facade {
    private AbstractDAOFactory daoFactory;
    private UserDAO userDAO;

    public User login(String email, String password){
        return null;
    }
}
