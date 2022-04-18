package org.wlw.utils;

import java.sql.*;

public class DBUtils {
    public static Connection getConnection() throws SQLException {
        String username = "20wlw";
        String password = "20wlw123";
        String url = "jdbc:mysql://localhost:3306/20wlw_manager";
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void close(Connection con) {
        try {
            if(con!=null) con.close();
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

    public static void close(ResultSet rs) {
        try {
            if(rs!=null) rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
