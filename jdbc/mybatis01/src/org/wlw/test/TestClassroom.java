package org.wlw.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.wlw.mapper.ClassroomMapper;
import org.wlw.model.Classroom;

import java.io.IOException;
import java.io.InputStream;

public class TestClassroom {
    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void init() {
        try {
            String xml = "mybatis-config.xml";
            //1、根据配置文件创建输入流
            InputStream is = Resources.getResourceAsStream(xml);
//            System.out.println(is);
            //2、创建SqlSessionFactory来完成数据库配置
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAdd() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Classroom cla = new Classroom();
            cla.setName("2020物联网工程");
            cla.setGrade("2020");
            cla.setSpecial("物联网工程技术");
            cla.setTeacher1("孔老师");
            cla.setMobile1("13908700156");
            cla.setTeacher2("李老师");
            cla.setMobile2("12344223");
            //根据SqlSession获取Mapper接口
            ClassroomMapper mapper = sqlSession.getMapper(ClassroomMapper.class);
            mapper.add(cla);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }
}
