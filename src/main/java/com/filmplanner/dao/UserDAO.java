package com.filmplanner.dao;


import com.filmplanner.User;

public interface UserDAO {
    User find(String email);
    String getPassword(String email);

}
