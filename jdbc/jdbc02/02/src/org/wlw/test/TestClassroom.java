package org.wlw.test;

import org.wlw.dao.ClassroomDao;
import org.wlw.dao.IClassroomDao;
import org.wlw.dao.SimpleDaoFactory;
import org.wlw.models.Classroom;

import java.util.List;

public class TestClassroom {
    public static void main(String[] args) {
        Classroom cla = new Classroom();
        cla.setGrade("2021");
        cla.setName("2021数字媒体技术");
        cla.setSpecial("数字媒体技术");
        cla.setTeacher1("张三");
        cla.setMobile1("12323232");
        cla.setTeacher2("李四");
        cla.setMobile2("232324");
        IClassroomDao classroomDao = SimpleDaoFactory.getClassroomDao();
//        classroomDao.add(cla);
        cla = classroomDao.load(2);
        System.out.println(cla);
        cla.setMobile2("98765");
        classroomDao.update(cla);
//        classroomDao.delete(4);
        List<Classroom> clas = classroomDao.find();
        for(Classroom c:clas) {
            System.out.println(c);
        }
    }
}
