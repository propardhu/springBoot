package com.pardhu.pardhuspace.user;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Date DOB;

    public static class Builder {
        private Integer id;
        private String name;
        private Date DOB;

        public Builder(Integer id) {
            this.id = id;
        }

        public Builder WithName(String name) {
            this.name = name;
            return this;
        }

        public Builder WithDOB(Date dob) {
            this.DOB = dob;
            return this;
        }

        public User build(){
            User user = new User();
            user.id =this.id;
            user.DOB =this.DOB;
            user.name =this.name;
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDOB() {
        return DOB;
    }
}
