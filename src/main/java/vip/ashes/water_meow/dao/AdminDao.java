package vip.ashes.water_meow.dao;

import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdminDao {
    //管理众筹
    /*public ArrayList<CFBean> getCFlist() {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from cf";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<CFBean> list = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                CFBean cfBean = new CFBean();
                cfBean.setId(rs.getInt("id"));
                cfBean.setPic(rs.getString("pic"));
                cfBean.setName(rs.getString("name"));
                cfBean.setExp(rs.getString("exp"));
                cfBean.setEst(rs.getInt("est"));
                cfBean.setRaised(rs.getInt("raised"));
                cfBean.setPct(rs.getInt("pct"));
                list.add(cfBean);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return list;
    }*/

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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return list;
    }

    /*public CFBean queryCFByID(String id) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from cf where id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        CFBean cfBean = null;

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                cfBean = new CFBean();
                cfBean.setId(rs.getInt("id"));
                cfBean.setPic(rs.getString("pic"));
                cfBean.setName(rs.getString("name"));
                cfBean.setExp(rs.getString("exp"));
                cfBean.setEst(rs.getInt("est"));
                cfBean.setRaised(rs.getInt("raised"));
                cfBean.setPct(rs.getInt("pct"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return cfBean;
    }*/

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
            // TODO Auto-generated catch block
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
            // TODO Auto-generated catch block
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
            // TODO Auto-generated catch block
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
            // TODO Auto-generated catch block
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
            // TODO Auto-generated catch block
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
            // TODO Auto-generated catch block
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn,pstm,null);
        }
        return rs;
    }
}
