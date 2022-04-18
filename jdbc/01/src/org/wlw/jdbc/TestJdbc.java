package org.wlw.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJdbc {
    public static void main(String[] args) {
//        add2();
//        delete(3);
//        update();
//        load(1);
        find();
    }

    public static void find() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = JDBCUtils.getConnection();
            String sql = "select * from t_classroom";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"
                        + rs.getString("grade")+"\t"+rs.getString("teacher1")+"\t"+rs.getString("mobile1")+
                        "\t"+rs.getString("teacher2")+"\t"+rs.getString("mobile2"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(rs);
            JDBCUtils.close(ps);
            JDBCUtils.close(con);
        }
    }

    public static void load(int id) {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            con = JDBCUtils.getConnection();
            String sql = "select * from t_classroom where id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"
                + rs.getString("grade")+"\t"+rs.getString("teacher1")+"\t"+rs.getString("mobile1")+
                        "\t"+rs.getString("teacher2")+"\t"+rs.getString("mobile2"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(rs);
            JDBCUtils.close(ps);
            JDBCUtils.close(con);
        }
    }

    public static void update() {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = JDBCUtils.getConnection();
            String sql = "update t_classroom set teacher1=?,mobile1=? where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,"刘老师");
            ps.setString(2,"3232333");
            ps.setInt(3,1);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(ps);
            JDBCUtils.close(con);
        }
    }

    public static void delete(int id) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = JDBCUtils.getConnection();
            String sql = "delete from t_classroom where id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(ps);
            JDBCUtils.close(con);
        }
    }

    public static void add2() {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = JDBCUtils.getConnection();
            String sql = "insert into t_classroom (name,grade,special,teacher1,mobile1,teacher2,mobile2) " +
                    "value (?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,"2020计算机科学技术");
            ps.setString(2,"2020");
            ps.setString(3,"计算机科学技术");
            ps.setString(4,"张老师");
            ps.setString(5,"2929992");
            ps.setString(6,"李老师");
            ps.setString(7,"323332");
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(ps);
            JDBCUtils.close(con);
        }
    }

    public static void add() {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = JDBCUtils.getConnection();
            String sql = "insert into t_classroom (name,grade,special,teacher1,mobile1,teacher2,mobile2) value (" +
                    "'2021物联网','2020','物联网工程技术','张老师','3232','李老师','3233')";
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(ps);
            JDBCUtils.close(con);
        }
    }
}
