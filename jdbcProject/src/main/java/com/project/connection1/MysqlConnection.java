package com.project.connection1;

import java.sql.*;

public class MysqlConnection implements IDBService {
    private ILoggerService loggerService;
    private Connection connection = null;

    public MysqlConnection(ILoggerService loggerService) {
        this.loggerService = loggerService;
    }

    @Override
    public Connection connectToDatabase() {
        String urlDb = "jdbc:mysql://localhost:3306/world?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
        String userName = "root";
        String password = "root";

        try {
            connection = DriverManager.getConnection(urlDb, userName, password);
            loggerService.infoLog("Connection Successfully");
        } catch (SQLException e) {
            loggerService.warnLog("Connection Fail \n" + e.getMessage());
        }
        return connection;
    }

    @Override
    public void closeConnection(Connection connection , Statement statement) {
        if (connection!=null){
            try {
                connection.close();
                loggerService.infoLog("Connection closed succesfully");
            } catch (SQLException e) {
                loggerService.warnLog("Connection could not closed " + e.getMessage());
            }
        }
        if (statement!=null){
            try {
                statement.close();
                loggerService.infoLog("Statement closed succesfully");
            } catch (SQLException e) {
                loggerService.warnLog("Statement could not closed " + e.getMessage());
            }
        }
    }
    @Override
    public void closeConnection(Connection connection , PreparedStatement preparedStatement) {
        if (connection!=null){
            try {
                connection.close();
                loggerService.infoLog("Connection closed succesfully");
            } catch (SQLException e) {
                loggerService.warnLog("Connection could not closed " + e.getMessage());
            }
        }
        if (preparedStatement!=null){
            try {
                preparedStatement.close();
                loggerService.infoLog("Statement closed succesfully");
            } catch (SQLException e) {
                loggerService.warnLog("Statement could not closed " + e.getMessage());
            }
        }
    }
    @Override
    public void closeConnection(Connection connection , PreparedStatement preparedStatement,ResultSet resultSet) {
        if (connection!=null){
            try {
                connection.close();
                loggerService.infoLog("Connection closed succesfully");
            } catch (SQLException e) {
                loggerService.warnLog("Connection could not closed " + e.getMessage());
            }
        }
        if (preparedStatement!=null){
            try {
                preparedStatement.close();
                loggerService.infoLog("Statement closed succesfully");
            } catch (SQLException e) {
                loggerService.warnLog("Statement could not closed " + e.getMessage());
            }
        }
        if (resultSet !=null){
            try {
                resultSet.close();
                loggerService.infoLog("ResultSet closed succesfully");
            }catch (SQLException e){
                loggerService.warnLog("ResultSet could not closed " + e.getMessage());

            }
        }
    }

}
