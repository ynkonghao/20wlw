package org.wlw.dao;

import org.wlw.models.Student;

import java.util.List;

public interface IStudentDao {
    public void add(Student stu);

    public void delete(int id);

    public void update(Student stu);

    public Student load(int id);

    public List<Student> find();
}
