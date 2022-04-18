package org.wlw.dao;

import org.wlw.models.Student;

import java.util.List;

public class StudentFileDao implements IStudentDao{
    @Override
    public void add(Student stu) {
        System.out.println("file add");
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
}
