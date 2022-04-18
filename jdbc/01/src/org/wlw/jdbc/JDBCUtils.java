package org.wlw.jdbc;

import java.sql.*;

public class JDBCUtils {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/20wlw_manager";
        String username = "20wlw";
        String password = "20wlw123";
        try {
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void close(ResultSet rs) {
        try {
            if(rs!=null) {
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(PreparedStatement ps) {
        try {
            if(ps!=null) ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(Connection con) {
        try {
            if(con!=null) con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
