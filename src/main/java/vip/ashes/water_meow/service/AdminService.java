package vip.ashes.water_meow.service;

import vip.ashes.water_meow.bean.Hotel;
import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.dao.AdminDao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AdminService {
    AdminDao adminDao = new AdminDao();

    /**
     * 管理员录入信息
     * @return
     */
    public int addHotelInfo(String roomNum, BigDecimal price,String type,String state){
        return adminDao.addHotelInfo(roomNum,price,type,state);
    }
    public ArrayList<Hotel> queryHotelList() {
        return adminDao.getHotelList();
    }

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

    public boolean editHotelInfo(String roomNum, String price1, String type, String state) {
        Double p = Double.parseDouble(price1);
        BigDecimal price = BigDecimal.valueOf(p);
        return adminDao.editHotelInfo(roomNum,price,type,state);
    }

    //根据RoomNum找到唯一房子
    public Hotel queryByRoomNum(String roomNum) {
        return adminDao.queryByRoomNum(roomNum);
    }

    public int delHotel(String roomNum) {

        return adminDao.delHotel(roomNum);
    }
}
