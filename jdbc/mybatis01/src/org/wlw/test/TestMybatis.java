package org.wlw.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.wlw.model.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    SqlSessionFactory sqlSessionFactory;
    //@Before表示执行任意的单元测试都要提前执行的代码，可以做一些数据的初始化操作
    @Before
    public void init() {
//        System.out.println("before");
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
    private String getId(String id) {
        return "org.wlw.mapper.Student."+id;
    }
    @Test
    public void selectList() {
        SqlSession session = null;
        try {
            String xml = "mybatis-config.xml";
            //1、根据配置文件创建输入流
            InputStream is = Resources.getResourceAsStream(xml);
//            System.out.println(is);
            //2、创建SqlSessionFactory来完成数据库配置
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //3、根据Factory创建SqlSession
            session = sqlSessionFactory.openSession();
            //4、执行sql
            List<Student> stus = session.selectList(getId("find"));
            for(Student stu:stus) {
                System.out.println(stu);
            }
            //5、关闭session
//            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭session
            if(session!=null) session.close();
        }
    }

    @Test
    public void selectOne() {
        SqlSession session = null;
        try {
            session = sqlSessionFactory.openSession();
            Student stu = session.selectOne("org.wlw.mapper.Student.load",1);
            System.out.println(stu);
            Logger.getRootLogger().debug(stu);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    @Test
    public void testUpdate() {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            Student stu = session.selectOne("org.wlw.mapper.Student.load",3);
            stu.setNo("0233");
            stu.setMobile("343434");
            session.update("org.wlw.mapper.Student.update",stu);
            session.commit();//提交事务
        }
    }

    @Test
    public void testInsert() {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            Student stu = new Student();
            stu.setName("王小二");
            stu.setNo("999");
            stu.setAddress("崂山区");
            stu.setCid(1);
            stu.setGender(1);
            stu.setIcon("002.png");
            stu.setQq("33333");
            stu.setMobile("2323333");
            session.insert("org.wlw.mapper.Student.add",stu);
            session.commit();
        }
    }

    @Test
    public void testDelete() {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            session.delete("org.wlw.mapper.Student.delete",3);
            session.commit();
        }
    }
}
