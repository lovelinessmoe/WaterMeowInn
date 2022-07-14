package vip.ashes.water_meow.dao;


import com.google.gson.Gson;
import vip.ashes.water_meow.bean.EchartBean;
import vip.ashes.water_meow.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EchartDao {
    public String getUserTypeList() {
        Connection conn = JDBCUtil.getConnection();
        String sql1 = "select count(*) as admin_cnt from user where type = 1";
        String sql2 = "select count(*) as user_cnt from user where type = 2";
        PreparedStatement pstm = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        String s = "";

        try {
            pstm = conn.prepareStatement(sql1);
            rs1 = pstm.executeQuery();
            pstm = conn.prepareStatement(sql2);
            rs2 = pstm.executeQuery();

            if (rs1 != null && rs2 != null && rs1.next() && rs2.next()) {
                EchartBean admin = new EchartBean();
                admin.setValue(rs1.getInt("admin_cnt"));
                admin.setName("管理员");
                EchartBean user = new EchartBean();
                user.setValue(rs2.getInt("user_cnt"));
                user.setName("用户");

                ArrayList<EchartBean> echartBeans = new ArrayList<>(2);
                echartBeans.add(admin);
                echartBeans.add(user);
                Gson gson = new Gson();
                s = gson.toJson(echartBeans);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs1);
            JDBCUtil.closeJDBC(conn, pstm, rs2);
        }
        return s;
    }

    public int[] getHotelStateList() {
        Connection conn = JDBCUtil.getConnection();
        String sql1 = "select count(*) as unchecked from hotel where state = 0";
        String sql2 = "select count(*) as booked from hotel where state = 1";
        String sql3 = "select count(*) as checked from hotel where state = 2";

        PreparedStatement pstm = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        int[] list = new int[3];

        try {
            pstm = conn.prepareStatement(sql1);
            rs1 = pstm.executeQuery();
            pstm = conn.prepareStatement(sql2);
            rs2 = pstm.executeQuery();
            pstm = conn.prepareStatement(sql3);
            rs3 = pstm.executeQuery();

            if (rs1 != null && rs2 != null && rs3 != null && rs1.next() && rs2.next() && rs3.next()) {
                list[0] = rs1.getInt("unchecked");
                list[1] = rs2.getInt("booked");
                list[2] = rs3.getInt("checked");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs1);
            JDBCUtil.closeJDBC(conn, pstm, rs2);
            JDBCUtil.closeJDBC(conn, pstm, rs3);
        }
        return list;
    }
}
