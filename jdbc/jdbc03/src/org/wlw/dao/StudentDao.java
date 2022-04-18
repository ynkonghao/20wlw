package org.wlw.dao;

import org.wlw.models.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDao extends JDBCTemplate<Student> implements IStudentDao {
    @Override
    public void add(Student stu) {
        this.executeUpdate("insert into t_stu(name,no,gender,mobile,address,qq,icon,cid) value (?,?,?,?,?,?,?,?)",new Object[]{
                stu.getName(),stu.getNo(),stu.getGender(),stu.getMobile(),stu.getAddress(),stu.getQq(),
                stu.getIcon(),stu.getCid()
        });
    }

    @Override
    public void delete(int id) {
        this.executeUpdate("delete from t_stu where id=?",new Object[]{id});
    }

    @Override
    public void update(Student stu) {
        Object[] values = new Object[] {
                stu.getName(),stu.getNo(),stu.getGender(),stu.getMobile(),stu.getAddress(),stu.getQq(),
                stu.getIcon(),stu.getCid(),stu.getId()
        };
        this.executeUpdate("update t_stu set name=?,no=?,gender=?,mobile=?,address=?,qq=?,icon=?,cid=? where id=?",values);
    }

    @Override
    public Student load(int id) {
        return this.executeQuery("select * from t_stu where id=?",new Object[]{id}).get(0);
    }

    @Override
    public List<Student> find() {
        return this.executeQuery("select * from t_stu",null);
    }

    @Override
    public Student rowMapper(ResultSet rs) throws SQLException {
        Student stu = new Student();
        stu.setId(rs.getInt("id"));
        stu.setName(rs.getString("name"));
        stu.setNo(rs.getString("no"));
        stu.setAddress(rs.getString("address"));
        stu.setQq(rs.getString("qq"));
        stu.setMobile(rs.getString("mobile"));
        stu.setCid(rs.getInt("cid"));
        stu.setGender(rs.getInt("gender"));
        return stu;
    }
}
