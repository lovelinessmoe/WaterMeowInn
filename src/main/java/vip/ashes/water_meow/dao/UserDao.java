package vip.ashes.water_meow.dao;

import vip.ashes.water_meow.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    public int increaseRaised(String id, float value) {
        Connection conn = JDBCUtil.getConnection();
        System.out.println("dao.value:"+value);
        String sql = "UPDATE cf SET raised = raised + ?,pct = raised / est * 100 where id=?";
        PreparedStatement pstm = null;
        int rs =0;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setFloat(1, value);
            pstm.setString(2, id);
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm,null);
        }

        return rs;
    }

    public int addUser(String account, String password, String name, String sex, String birth, String mob) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "insert into user(account, password, name, sex, birth, mob, type) values (?,?,?,?,?,?,2)";
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
            rs = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm,null);
        }
        return rs;
    }
}
