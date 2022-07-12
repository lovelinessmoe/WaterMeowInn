package vip.ashes.water_meow.service;

import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.dao.LoginDao;

public class LoginService {
    LoginDao lgDao = new LoginDao();
    public UserBean Login(String user_account, String password) {
        return lgDao.Login(user_account,password);
    }
}
