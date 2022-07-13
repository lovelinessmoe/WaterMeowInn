package vip.ashes.water_meow.util;

import java.sql.*;

/**
 * @author loveliness
 */
public class JDBCUtil {
    private static final String url="jdbc:mysql://localhost:3306/WaterMeowInn?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false";
    private static final String user="root";
    private static final String password="123456";

    //注册驱动
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*获取数据库连接对象*/
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /*
        关闭数据库连接
        关闭Connection 数据库连接对象
        关闭PreparedStatement sql语句预处理对象
        关闭ResultSet 结果集
     */
    public static void closeJDBC(Connection conn,PreparedStatement pstm ,ResultSet rs) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (pstm != null) {
            try {
                pstm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

