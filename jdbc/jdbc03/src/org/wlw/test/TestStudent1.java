package org.wlw.test;

import org.wlw.dao.IStudentDao;
import org.wlw.dao.SimpleDAOFactory;
import org.wlw.dao.StudentDao;
import org.wlw.dao.StudentFileDao;

public class TestStudent1 {
    public static void main(String[] args) {
        add();
        update();
    }

    public static void add() {
        IStudentDao studentDao = SimpleDAOFactory.getStudentDao();
        studentDao.add(null);
    }

    public static void update() {
        IStudentDao studentDao = SimpleDAOFactory.getStudentDao();
        studentDao.add(null);
    }
}
