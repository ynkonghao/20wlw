package org.wlw.dao;

import org.wlw.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JDBCTemplate<E> {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void executeUpdate(String sql,Object[] values) {
        try {
            con = DBUtils.getConnection();
            executeSql(sql,values);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(ps);
            DBUtils.close(con);
        }
    }

    public abstract E rowMapper(ResultSet rs) throws SQLException;

    public List<E> executeQuery(String sql,Object[] values) {
        List<E> objs = new ArrayList<>();
        try {
            con = DBUtils.getConnection();
            querySql(sql,values);
            while(rs.next()) {
                objs.add(rowMapper(rs));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtils.close(ps);
            DBUtils.close(con);
        }
        return objs;
    }

    private void preparePs(String sql,Object[] values) throws SQLException {
        ps = con.prepareStatement(sql);
        if(values!=null) {
            for (int i = 0; i < values.length; i++) {
                ps.setObject(i + 1, values[i]);
            }
        }
    }

    private void executeSql(String sql,Object[] values) throws SQLException {
        preparePs(sql,values);
        ps.executeUpdate();
    }

    private void querySql(String sql, Object[] values) throws SQLException {
        preparePs(sql,values);
        rs = ps.executeQuery();
    }


}
