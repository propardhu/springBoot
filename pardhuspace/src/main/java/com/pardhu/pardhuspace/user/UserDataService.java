package com.pardhu.pardhuspace.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDataService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "ram", new Date()));
        users.add(new User(2, "ramana", new Date()));
        users.add(new User(3, "load", new Date()));
    }

    public List<User> findall() {
        return users;
    }

    public User save(User user) {
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }


}
