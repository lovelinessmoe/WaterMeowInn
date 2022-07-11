package vip.ashes.water_meow.dao;

import vip.ashes.water_meow.bean.Hotel;
import vip.ashes.water_meow.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author loveliness
 */
public class HotelDao {
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            JDBCUtil.closeJDBC(conn, pstm, rs);
        }
        return list;
    }
}
