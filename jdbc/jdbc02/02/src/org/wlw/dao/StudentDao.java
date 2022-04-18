package org.wlw.dao;

import org.wlw.models.Student;
import org.wlw.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IStudentDao{

    @Override
    public void add(Student stu) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtils.getConnection();
            String sql = "insert into t_stu(name,no,qq,icon,gender,address,mobile,cid) value (?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,stu.getName());
            ps.setString(2,stu.getNo());
            ps.setString(3,stu.getQq());
            ps.setString(4,stu.getIcon());
            ps.setInt(5,stu.getGender());
            ps.setString(6,stu.getAddress());
            ps.setString(7,stu.getMobile());
            ps.setInt(8,stu.getCid());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(ps);
            DBUtils.close(con);
        }
    }

    @Override
    public void delete(int id) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtils.getConnection();
            String sql = "delete from t_stu where id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(ps);
            DBUtils.close(con);
        }
    }

    @Override
    public void update(Student stu) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtils.getConnection();
            String sql = "update t_stu set name=?,no=?,qq=?,icon=?,gender=?,address=?,mobile=?,cid=? where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,stu.getName());
            ps.setString(2,stu.getNo());
            ps.setString(3,stu.getQq());
            ps.setString(4,stu.getIcon());
            ps.setInt(5,stu.getGender());
            ps.setString(6,stu.getAddress());
            ps.setString(7,stu.getMobile());
            ps.setInt(8,stu.getCid());
            ps.setInt(9,stu.getId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(ps);
            DBUtils.close(con);
        }
    }

    @Override
    public Student load(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Student stu = null;

        try {
            con = DBUtils.getConnection();
            String sql = "select * from t_stu where id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while(rs.next()) {
                stu = new Student();
                stu.setAddress(rs.getString("address"));
                stu.setCid(rs.getInt("cid"));
                stu.setName(rs.getString("name"));
                stu.setId(rs.getInt("id"));
                stu.setGender(rs.getInt("gender"));
                stu.setIcon(rs.getString("icon"));
                stu.setNo(rs.getString("no"));
                stu.setMobile(rs.getString("mobile"));
                stu.setQq(rs.getString("qq"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(rs);
            DBUtils.close(ps);
            DBUtils.close(con);
        }
        return stu;
    }

    @Override
    public List<Student> find() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Student> stus = new ArrayList<Student>();

        try {
            con = DBUtils.getConnection();
            String sql = "select * from t_stu";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                Student stu = new Student();
                stu.setAddress(rs.getString("address"));
                stu.setCid(rs.getInt("cid"));
                stu.setName(rs.getString("name"));
                stu.setId(rs.getInt("id"));
                stu.setGender(rs.getInt("gender"));
                stu.setIcon(rs.getString("icon"));
                stu.setNo(rs.getString("no"));
                stu.setMobile(rs.getString("mobile"));
                stu.setQq(rs.getString("qq"));
                stus.add(stu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(ps);
            DBUtils.close(con);
        }
        return stus;
    }
}
