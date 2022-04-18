package org.wlw.test;

import org.wlw.dao.IStudentDao;
import org.wlw.dao.SimpleDAOFactory;
import org.wlw.models.Student;

import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        IStudentDao studentDao = SimpleDAOFactory.getStudentDao();
        Student stu = new Student();
        stu.setName("李四");
        stu.setGender(0);
        stu.setNo("002");
        stu.setMobile("2323333");
        stu.setQq("66775555");
        stu.setCid(1);
        stu.setAddress("云南昆明");
        stu.setIcon("/img/002.png");
//        studentDao.add(stu);
        List<Student> stus = studentDao.find();
        for(Student s:stus) {
            System.out.println(s);
        }
        System.out.println(studentDao.load(1));
    }
}
