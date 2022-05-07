package com.project.connection1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public interface IDBService {

    Connection connectToDatabase();
    void closeConnection(Connection connection , Statement statement);
    void closeConnection(Connection connection , PreparedStatement preparedStatement);
    void closeConnection(Connection connection , PreparedStatement preparedStatement, ResultSet resultSet);

}
