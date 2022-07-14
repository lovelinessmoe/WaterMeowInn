package vip.ashes.water_meow.dao;

import vip.ashes.water_meow.bean.Order;
import vip.ashes.water_meow.bean.UserBean;
import vip.ashes.water_meow.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    public Order getOrderByID(String outTradeNo) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from `order` where order_id = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Order order = new Order();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, outTradeNo);
            rs = pstm.executeQuery();
            while (rs.next()) {
                order.setOrderId(rs.getString("order_id"));
                order.setAli_id(rs.getString("ali_id"));
                order.setUserId(rs.getInt("user_id"));
                order.setRoomNum(rs.getString("room_num"));
                order.setState(rs.getString("state"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return order;
    }

    public void updateOrderFinish(String outTradeNo, String tradeNo) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "update `order` set ali_id = ?,state = ? where order_id = ?";
        PreparedStatement pstm = null;
        Order order = new Order();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, tradeNo);
            pstm.setString(2, "1");
            pstm.setString(3, outTradeNo);
            int i = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, null);
        }
    }

    public void createOrder(String subject, String outTradeNo, String totalAmount, int id) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "insert into `order`" +
                "(order_id, user_id, room_num, price) value (?,?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, outTradeNo);
            pstm.setInt(2, id);
            pstm.setString(3, subject);
            pstm.setString(4, totalAmount);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, null);
        }
    }

    public ArrayList<Order> listAllOrder() {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from `order`";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Order> list = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Order orderbean = new Order();

                orderbean.setOrderId(rs.getString("order_id"));
                orderbean.setAli_id(rs.getString("ali_id"));
                orderbean.setUserId(rs.getInt("user_id"));
                orderbean.setRoomNum(rs.getString("room_num"));
                orderbean.setState(rs.getString("state"));
                orderbean.setPrice(rs.getBigDecimal("price"));
                list.add(orderbean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return list;
    }
}
