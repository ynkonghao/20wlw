## JDBC基础

#### 一、JDBC的封装

为了比较方便访问数据库，一般喜欢把jdbc的代码进行简单的封装，基本的封装方式是创建一个JDBCUtils，创建一些static的方法进行封装。

```java
package org.wlw.jdbc;

import java.sql.*;

public class JDBCUtils {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/20wlw_manager";
        String username = "20wlw";
        String password = "20wlw123";
        try {
            return DriverManager.getConnection(url,username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void close(ResultSet rs) {
        try {
            if(rs!=null) {
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(PreparedStatement ps) {
        try {
            if(ps!=null) ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void close(Connection con) {
        try {
            if(con!=null) con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
```

#### 二、SQL注入攻击和预编译

假设在做用户登录的时候，一般会在数据库中编写如下一条sql

```java
String username = "admin";
String password = "123";
String = "select count(*) from t_user where username='"+username+"' and password ='"+password+"'";
```

此时如果`count(*)`的值为1，表示用户存在，可以登录，否则表示用户不存在，不可以登录。而username通常会从网页的表单中获取，此时如果用户名写成如下一种方式`admin"';//`，此时的sql语句会出现`select count(*) from t_user where username='"admin"';//"' and password='"+password+"';`此时主要用户名是admin就可以通过超级管理员登录系统。这种称为SQL注入攻击，所以在jdbc的程序中不能直接传入值，应该使用预编译。