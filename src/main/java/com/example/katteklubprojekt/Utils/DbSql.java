package com.example.katteklubprojekt.Utils;

import java.sql.*;

public class DbSql {
    public Connection connection;
    private PreparedStatement Pstmt;
    private Statement stmt;


    public DbSql() throws SQLException {
        connection = null;
        Statement stmt = null;

        try {
            String url = "jdbc:mysql://localhost:3306/kattedatabase";
            connection = DriverManager.getConnection(url,"root","");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }




}
