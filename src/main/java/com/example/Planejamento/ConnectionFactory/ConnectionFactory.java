package com.example.Planejamento.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/planejamentofinanc", "root", ""
            );
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
