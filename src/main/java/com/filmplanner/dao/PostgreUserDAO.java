package com.filmplanner.dao;

import com.filmplanner.User;
import com.filmplanner.framework.UserDAO;

public class PostgreUserDAO implements UserDAO {

    @Override
    public User find(String email) {
        return null;
    }

    @Override
    public String getPassword(String email) {
        return null;
    }
}
