package vip.ashes.water_meow.service;

import vip.ashes.water_meow.dao.UserDao;

import java.util.ArrayList;

public class UserService {
    UserDao userDao = new UserDao();


    public int raiseMoneyMount(String id, float value) {
        return userDao.increaseRaised(id,value);
    }

    public int userAdd(String account,String password,String name,String sex,String birth,String mob) {
        return userDao.addUser(account,password,name,sex,birth,mob);
    }

}
