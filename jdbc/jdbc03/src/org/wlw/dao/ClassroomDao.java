package org.wlw.dao;

import org.wlw.models.Classroom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ClassroomDao extends JDBCTemplate<Classroom> implements IClassroomDao{
    @Override
    public void add(Classroom classroom) {
        String sql = "insert into t_classroom(name,grade,special,teacher1,mobile1,teacher2,mobile2) value (?,?,?,?,?,?,?)";
        Object[] values = new Object[]{classroom.getName(),classroom.getGrade(),classroom.getSpecial(),classroom.getTeacher1(),
            classroom.getMobile1(),classroom.getTeacher2(),classroom.getMobile2()};
        this.executeUpdate(sql,values);
    }

    @Override
    public void update(Classroom classroom) {
        String sql = "update t_classroom set name=?,grade=?,special=?,teacher1=?,mobile1=?,teacher2=?,mobile2=? where id=?";
        Object[] values = new Object[]{classroom.getName(),classroom.getGrade(),classroom.getSpecial(),classroom.getTeacher1(),
                classroom.getMobile1(),classroom.getTeacher2(),classroom.getMobile2(),classroom.getId()};
        this.executeUpdate(sql,values);
    }

    @Override
    public void delete(int id) {
        this.executeUpdate("delete from t_classroom where id=?",new Object[]{id});
    }

    @Override
    public Classroom load(int id) {
        return this.executeQuery("select * from t_classroom where id=?",new Object[]{id}).get(0);
    }

    @Override
    public List<Classroom> find() {
        return this.executeQuery("select * from t_classroom",null);
    }

    @Override
    public Classroom rowMapper(ResultSet rs) throws SQLException {
        Classroom cla = new Classroom();
        cla.setId(rs.getInt("id"));
        cla.setGrade(rs.getString("grade"));
        cla.setSpecial(rs.getString("special"));
        cla.setTeacher1(rs.getString("teacher1"));
        cla.setMobile1(rs.getString("mobile1"));
        cla.setTeacher2(rs.getString("teacher2"));
        cla.setMobile2(rs.getString("mobile2"));
        return cla;
    }
}
