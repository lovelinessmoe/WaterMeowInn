package vip.ashes.water_meow.dao;

import vip.ashes.water_meow.bean.Hotel;
import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.util.JDBCUtil;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminDao {
    public ArrayList<UserBean> getUserList() {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from user";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<UserBean> list = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                UserBean userBean = new UserBean();
                userBean.setId(Integer.parseInt(rs.getString("id")));
                userBean.setAccount(rs.getString("account"));
                userBean.setPassword(rs.getString("password"));
                userBean.setName(rs.getString("name"));
                userBean.setSex(rs.getString("sex"));
                userBean.setBirth(rs.getString("birth"));
                userBean.setMob(rs.getString("mob"));
                userBean.setType(rs.getString("type"));
                list.add(userBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return list;
    }

    public int editCF(String id, String pic, String name, String exp, String est, String raised, String pct) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "UPDATE cf SET pic=?,name=?,exp=?,est=?,raised=?,pct=? where id=?";
        PreparedStatement pstm = null;
        int rs = 0;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, pic);
            pstm.setString(2, name);
            pstm.setString(3, exp);
            pstm.setFloat(4, Float.parseFloat(est));
            pstm.setFloat(5, Float.parseFloat(raised));
            pstm.setFloat(6, Float.parseFloat(pct));
            pstm.setInt(7, Integer.parseInt(id));
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm,null);
        }
        return rs;
    }

    public int addCF(String pic, String name, String exp, String est, String raised, String pct) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "insert into cf(pic, name, exp, est, raised, pct) values (?,?,?,?,?,?)";
        PreparedStatement pstm = null;
        int rs = 0;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, pic);
            pstm.setString(2, name);
            pstm.setString(3, exp);
            pstm.setFloat(4, Float.parseFloat(est));
            pstm.setFloat(5, Float.parseFloat(raised));
            pstm.setFloat(6, Float.parseFloat(pct));
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn,pstm,null);
        }
        return rs;
    }

    public int deleteCF(String id) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "delete from cf where id=?";
        PreparedStatement pstm = null;
        int rs =0;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, id);
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn,pstm,null);
        }

        return rs;
    }










    //用户
    public UserBean queryUserByID(String id) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from user where id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        UserBean userBean = null;

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                userBean = new UserBean();
                userBean.setId(rs.getInt("id"));
                userBean.setAccount(rs.getString("account"));
                userBean.setPassword(rs.getString("password"));
                userBean.setName(rs.getString("name"));
                userBean.setSex(rs.getString("sex"));
                userBean.setBirth(rs.getString("birth"));
                userBean.setMob(rs.getString("mob"));
                userBean.setType(rs.getString("type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return userBean;
    }

    public int editUser(String id, String account, String password, String name, String sex, String birth, String mob, String type1) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "UPDATE user SET account=?,password=?,name=?,sex=?,birth=?,mob=?,type=? where id=?";
        PreparedStatement pstm = null;
        int rs = 0;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, account);
            pstm.setString(2, password);
            pstm.setString(3, name);
            pstm.setString(4, sex);
            pstm.setString(5, birth);
            pstm.setString(6, mob);
            pstm.setString(7,type1);
            pstm.setInt(8, Integer.parseInt(id));
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm,null);
        }
        return rs;
    }

    public int deleteUser(int id) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "delete from user where id=?";
        System.out.println(id);
        PreparedStatement pstm = null;
        int rs =0;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn,pstm,null);
        }
        return rs;
    }

    public int addUser(String account, String password, String name, String sex, String birth, String mob, String type1) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "insert into user(account,password,name,sex,birth,mob,type) values (?,?,?,?,?,?,?)";
        PreparedStatement pstm = null;
        int rs = 0;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, account);
            pstm.setString(2, password);
            pstm.setString(3, name);
            pstm.setString(4, sex);
            pstm.setString(5, birth);
            pstm.setString(6, mob);
            pstm.setString(7, type1);
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn,pstm,null);
        }
        return rs;
    }

    /**
     * 管理员添加房间
     * @return
     */
    public int addHotelInfo(String roomNum,BigDecimal price,String type,String state){
        Connection conn = JDBCUtil.getConnection();
        String sql = "insert into hotel(room_num,price,type,state) values (?,?,?,?)";

        PreparedStatement pstm = null;
        int res = 0;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,roomNum);
            pstm.setBigDecimal(2,price);
            pstm.setString(3,type);
            pstm.setString(4,state);
            res = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.closeJDBC(conn,pstm,null);
        }
        return res;
    }

    public ArrayList<Hotel> getHotelList() {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from hotel";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Hotel> list = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Hotel hotel = new Hotel();
                hotel.setRoomNum(rs.getString("room_num"));
                hotel.setPrice(rs.getBigDecimal("price"));
                hotel.setType(rs.getString("type"));
                hotel.setState(rs.getString("state"));
                list.add(hotel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return list;
    }

    public boolean editHotelInfo(String roomNum, BigDecimal price, String type, String state) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "UPDATE hotel SET price=?,type=?,state=? where room_num=?";
        PreparedStatement pstm = null;
        int rs = 0;
        try {
            pstm = conn.prepareStatement(sql);
//            pstm.setString(1, roomNum);
            pstm.setBigDecimal(1, price);
            pstm.setString(2, type);
            pstm.setString(3, state);
            pstm.setString(4, roomNum);
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm,null);
        }
        if(rs>0) return true;
        return false;
    }

    public Hotel queryByRoomNum(String roomNum) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from hotel where room_num=?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Hotel hotel= null;

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,roomNum);
            rs = pstm.executeQuery();
            while (rs.next()) {
                hotel = new Hotel();
                hotel.setRoomNum(rs.getString("room_num"));
                hotel.setPrice(rs.getBigDecimal("price"));
                hotel.setType(rs.getString("type"));
                hotel.setState(rs.getString("state"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return hotel;
    }

    /**
     * 管理员删除房子
     * @param roomNum
     * @return
     */
    public int delHotel(String roomNum) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "delete from hotel where room_num=?";
        System.out.println(roomNum);
        PreparedStatement pstm = null;
        int rs =0;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, roomNum);
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn,pstm,null);
        }
        return rs;
    }
}
