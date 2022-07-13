package vip.ashes.water_meow.dao;

import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public UserBean Login(String account, String password) {
        Connection conn = JDBCUtil.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        String sql = "select * from user where account = ? and password = ?";
        UserBean userBean2 = new UserBean();
        try {
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, account);
            psmt.setString(2, password);
            rs = psmt.executeQuery();
            if(rs.next()) {
                userBean2.setAccount(rs.getString("account"));
                userBean2.setPassword(rs.getString("password"));
                userBean2.setType(rs.getString("type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.closeJDBC(conn,psmt,rs);
        }
        return userBean2;
    }
}
