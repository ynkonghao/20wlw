package org.wlw.dao;

import org.wlw.models.Classroom;
import org.wlw.util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassroomDao implements IClassroomDao {
    public void add(Classroom classroom) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtils.getConnection();
            String sql  = "insert into t_classroom (name,grade,special,teacher1,mobile1,teacher2,mobile2)" +
                    " value (?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1,classroom.getName());
            ps.setString(2,classroom.getGrade());
            ps.setString(3,classroom.getSpecial());
            ps.setString(4,classroom.getTeacher1());
            ps.setString(5,classroom.getMobile1());
            ps.setString(6,classroom.getTeacher2());
            ps.setString(7,classroom.getMobile2());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(ps);
            DBUtils.close(con);
        }
    }

    public void delete(int id) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtils.getConnection();
            String sql = "delete from t_classroom where id=?";
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

    public void update(Classroom classroom) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBUtils.getConnection();
            String sql = "update t_classroom set name=?,grade=?,special=?,teacher1=?,mobile1=?,teacher2=?,mobile2=? where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,classroom.getName());
            ps.setString(2,classroom.getGrade());
            ps.setString(3,classroom.getSpecial());
            ps.setString(4,classroom.getTeacher1());
            ps.setString(5,classroom.getMobile1());
            ps.setString(6,classroom.getTeacher2());
            ps.setString(7, classroom.getMobile2());
            ps.setInt(8,classroom.getId());
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(ps);
            DBUtils.close(con);
        }
    }

    public Classroom load(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Classroom cla = null;

        try {
            con = DBUtils.getConnection();
            String sql = "select * from t_classroom where id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while(rs.next()) {
                cla = new Classroom();
                cla.setId(rs.getInt("id"));
                cla.setName(rs.getString("name"));
                cla.setSpecial(rs.getString("special"));
                cla.setGrade(rs.getString("grade"));
                cla.setTeacher1(rs.getString("teacher1"));
                cla.setMobile1(rs.getString("mobile1"));
                cla.setTeacher2(rs.getString("teacher2"));
                cla.setMobile2(rs.getString("mobile2"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(rs);
            DBUtils.close(ps);
            DBUtils.close(con);
        }
        return cla;
    }

    public List<Classroom> find() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Classroom> clas = new ArrayList<Classroom>();

        try {
            con = DBUtils.getConnection();
            String sql = "select * from t_classroom";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                Classroom cla = new Classroom();
                cla.setId(rs.getInt("id"));
                cla.setName(rs.getString("name"));
                cla.setSpecial(rs.getString("special"));
                cla.setGrade(rs.getString("grade"));
                cla.setTeacher1(rs.getString("teacher1"));
                cla.setMobile1(rs.getString("mobile1"));
                cla.setTeacher2(rs.getString("teacher2"));
                cla.setMobile2(rs.getString("mobile2"));
                clas.add(cla);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(rs);
            DBUtils.close(ps);
            DBUtils.close(con);
        }
        return clas;
    }
}
