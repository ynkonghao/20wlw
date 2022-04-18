package org.wlw.test;

import org.wlw.dao.IStudentDao;
import org.wlw.dao.SimpleDaoFactory;
import org.wlw.dao.StudentDao;
import org.wlw.models.Student;

import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("小张");
        stu.setNo("001");
        stu.setQq("6565654");
        stu.setMobile("19888888");
        stu.setIcon("/img/001.png");
        stu.setCid(1);
        stu.setAddress("云南昭通");
        stu.setGender(1);
        IStudentDao studentDao = SimpleDaoFactory.getStudentDao();
//        studentDao.add(stu);
//        studentDao.delete(2);
        stu = studentDao.load(1);
        stu.setAddress("云南昭通大关县");
//        studentDao.update(stu);
        List<Student> stus = studentDao.find();
        for(Student s:stus) {
            System.out.println(s);
        }
    }
}
