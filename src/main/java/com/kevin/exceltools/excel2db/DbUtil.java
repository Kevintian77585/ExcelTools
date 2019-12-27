package com.kevin.exceltools.excel2db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author kevin
 * @ClassName
 * @Date 2019/12/2523:47
 */
public class DbUtil {

    public static void main(String[] args) {

        DataBase();
    }



    public static void DataBase() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://url:3306/excel";
        Connection con = null;
        ResultSet res = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "用户名", "密码");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.err.println("装载 JDBC/ODBC 驱动程序失败。");
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.err.println("无法连接数据库");
            e.printStackTrace();
        }
    }
}
