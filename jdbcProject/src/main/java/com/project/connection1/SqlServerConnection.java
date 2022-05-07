package com.project.connection1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlServerConnection implements IDBService {
    @Override
    public Connection connectToDatabase() {
        //SqlServer Connection Codes
        String urlDb ;
        String userName ;
        String password ;
        return null;
    }

    @Override
    public void closeConnection(Connection connection , Statement statement) {
        //close connection codes
    }

    @Override
    public void closeConnection(Connection connection, PreparedStatement preparedStatement) {
        //close connection codes
    }

    @Override
    public void closeConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        //close connection codes
    }


}
