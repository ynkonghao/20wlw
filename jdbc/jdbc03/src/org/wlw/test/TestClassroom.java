package org.wlw.test;

import org.wlw.dao.IClassroomDao;
import org.wlw.dao.SimpleDAOFactory;
import org.wlw.models.Classroom;

import java.util.List;

public class TestClassroom {
    public static void main(String[] args) {
        Classroom cla = new Classroom();
        cla.setGrade("2022");
        cla.setName("2022计算机科学技术");
        cla.setSpecial("计算机科学技术");
        cla.setTeacher1("张三");
        cla.setMobile1("12323232");
        cla.setTeacher2("李四");
        cla.setMobile2("232324");
        IClassroomDao classroomDao = SimpleDAOFactory.getClassroomDao();
//        classroomDao.delete(7);
//        classroomDao.add(cla);
        cla = classroomDao.load(5);
        System.out.println(cla);
        cla.setTeacher1("赵柳");
        classroomDao.update(cla);
////        classroomDao.delete(4);
        List<Classroom> clas = classroomDao.find();
        for(Classroom c:clas) {
            System.out.println(c);
        }
    }
}
