package org.wlw.dao;

import org.wlw.models.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentTemplateDao extends JDBCTemplate implements IStudentDao{
    @Override
    public void add(Student stu) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Student stu) {

    }

    @Override
    public Student load(int id) {
        return null;
    }

    @Override
    public List<Student> find() {
        return null;
    }

    @Override
    public Object rowMapper(ResultSet rs) throws SQLException {
        return null;
    }
}
