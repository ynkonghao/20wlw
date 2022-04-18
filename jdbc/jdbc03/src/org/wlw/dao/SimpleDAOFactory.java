package org.wlw.dao;

public class SimpleDAOFactory {
    public static IStudentDao getStudentDao() {
        return new StudentDao();
    }

    public static IClassroomDao getClassroomDao() { return new ClassroomDao();}
}
