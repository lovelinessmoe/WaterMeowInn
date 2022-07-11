package vip.ashes.water_meow.service;

import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.dao.AdminDao;

import java.util.ArrayList;

public class AdminService {
    AdminDao adminDao = new AdminDao();
//    public ArrayList<CFBean> queryCFList() {
//        return adminDao.getCFlist();
//    }

    public ArrayList<UserBean> queryUserList() {
        return adminDao.getUserList();
    }

//    public CFBean getCFMsg(String id) {
//        return adminDao.queryCFByID(id);
//    }

    public int updateCF(String id, String pic, String name, String  exp, String est, String raised, String pct) {
        return adminDao.editCF(id,pic,name,exp,est,raised,pct);
    }

    public int insertCF(String pic, String name, String exp, String est, String raised, String pct) {
        return adminDao.addCF(pic,name,exp,est,raised,pct);
    }

    public int deleteCFProject(String id) {
        return adminDao.deleteCF(id);
    }



    public UserBean getUserMsg(String id) {
        return adminDao.queryUserByID(id);
    }

    public int insertUser(String account, String password, String name, String sex, String birth, String mob, String type1) {
        return adminDao.addUser(account,password,name,sex,birth,mob,type1);

    }

    public int deleteUser(int id) {
        return adminDao.deleteUser(id);
    }

    public int updateUser(String id, String account, String password, String name, String sex, String birth, String mob, String type1) {
        return adminDao.editUser(id,account,password,name,sex,birth,mob,type1);
    }
}
