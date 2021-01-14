package com.pardhu.pardhuspace.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDataService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User.Builder(1).WithName("raman").WithDOB(new Date()).build());
        users.add(new User.Builder(2).WithName("load").WithDOB(new Date()).build());
        users.add(new User.Builder(3).WithName("athaliraa").WithDOB(new Date()).build());
    }

    public List<User> findall() {
        return users;
    }

    public User save(User user) {
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {               //new type of for loop
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }


}
