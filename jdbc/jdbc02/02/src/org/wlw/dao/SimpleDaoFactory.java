package org.wlw.dao;

public class SimpleDaoFactory {
    public static IClassroomDao getClassroomDao() {
        return new ClassroomDao();
    }

    public static IStudentDao getStudentDao() {
        return new StudentDao();
    }
}
