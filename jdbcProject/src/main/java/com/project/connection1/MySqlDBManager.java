package com.project.connection1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlDBManager implements IDBManager {
    ILoggerService loggerService;
    MysqlConnection mysqlConnection = new MysqlConnection(new Log4j2Manager());

    public MySqlDBManager(ILoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void createPersonelTable() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = mysqlConnection.connectToDatabase();
            statement = connection.createStatement();
            String query = "CREATE TABLE personel(personalID INT PRIMARY KEY NOT NULL , adi VARCHAR(255), soyadi VARCHAR(255), dogumYili INT , personelNo varchar(20))";
            statement.execute(query);
            loggerService.infoLog("Personel Table create successfully");
        } catch (SQLException e) {
            loggerService.warnLog("Personel Table could not create successfully" + e.getMessage() + " " + e.getErrorCode());
        } finally {
            mysqlConnection.closeConnection(connection, statement);
        }
    }

    public void createPersonelTableWithPreparedStatement() {
        Connection connection = mysqlConnection.connectToDatabase();
        PreparedStatement preparedStatement = null;
        String query = "CREATE TABLE personel(personalID INT PRIMARY KEY NOT NULL , adi VARCHAR(255), soyadi VARCHAR(255), dogumYili INT , personelNo varchar(20))";

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();
            loggerService.infoLog("Personel Table create successfully");
        } catch (SQLException e) {
            loggerService.warnLog("Personel Table could not create successfully" + e.getMessage() + " " + e.getErrorCode());
        } finally {
            mysqlConnection.closeConnection(connection, preparedStatement);
        }
    }
    @Override
    public void savePersonel(Personel personel) {
        Connection connection = mysqlConnection.connectToDatabase();
        String query = "INSERT INTO personel(personalID,adi,soyadi,dogumYili,personelNo) VALUES(?,?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, personel.getPersonalID());
            preparedStatement.setString(2, personel.getAdi());
            preparedStatement.setString(3, personel.getSoyadi());
            preparedStatement.setInt(4, personel.getDogumYili());
            preparedStatement.setString(5, personel.getPersonelNo());
            preparedStatement.executeUpdate();
            loggerService.infoLog("Personel added successfully");
        } catch (SQLException e) {
            loggerService.warnLog("Personel could not add successfully" + e.getMessage() + " " + e.getErrorCode());

        } finally {
            mysqlConnection.closeConnection(connection, preparedStatement);
        }

    }
    @Override
    public void savePersonelList(List<Personel> personelList) {
        Connection connection = mysqlConnection.connectToDatabase();
        PreparedStatement preparedStatement = null;
        String query = "INSERT INTO personel(personalID,adi,soyadi,dogumYili,personelNo) VALUES(?,?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(query);
            for (Personel personel : personelList) {
                preparedStatement.setInt(1, personel.getPersonalID());
                preparedStatement.setString(2, personel.getAdi());
                preparedStatement.setString(3, personel.getSoyadi());
                preparedStatement.setInt(4, personel.getDogumYili());
                preparedStatement.setString(5, personel.getPersonelNo());
                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
            loggerService.infoLog("Personel list added successfully");
        } catch (SQLException e) {
            loggerService.warnLog("Personel list could not add successfully" + e.getMessage() + " " + e.getErrorCode());
        } finally {
            mysqlConnection.closeConnection(connection, preparedStatement);
        }
    }
    @Override
    public Personel updatePersonel(Personel personel) {
        Connection connection = mysqlConnection.connectToDatabase();
        PreparedStatement preparedStatement = null;
        String query = "UPDATE personel SET adi =? ,soyadi =? ,dogumYili =? ,personelNo=? WHERE personalID =?";
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, personel.getAdi());
            preparedStatement.setString(2, personel.getSoyadi());
            preparedStatement.setInt(3, personel.getDogumYili());
            preparedStatement.setString(4, personel.getPersonelNo());
            preparedStatement.setInt(5, personel.getPersonalID());
            preparedStatement.executeUpdate();
            loggerService.infoLog(personel.getPersonalID() + " idli personel güncellendi");
        } catch (SQLException e) {
            loggerService.warnLog(personel.getPersonalID() + " idli personel güncellenirken hata oluştu." + e.getMessage());
        }finally {
            mysqlConnection.closeConnection(connection,preparedStatement);
        }
        return personel;

    }
    public void deletePersonelByPersonelID(int id){
        String query = "DELETE FROM personel WHERE personalID=? ";
        Connection connection = mysqlConnection.connectToDatabase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            loggerService.infoLog(id+" idli personel is deleted");

        }catch (SQLException e){
            loggerService.infoLog("Delete process is fail "+e.getMessage());
        }
        finally {
            mysqlConnection.closeConnection(connection,preparedStatement);
        }
    }
    public void deletePersonelByadi(String adi){
        String query = "DELETE FROM personel WHERE adi=? ";
        Connection connection = mysqlConnection.connectToDatabase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,adi);
            preparedStatement.executeUpdate();
            loggerService.infoLog(adi+" adlı personel is deleted");

        }catch (SQLException e){
            loggerService.infoLog("Delete process is fail "+e.getMessage());
        }
        finally {
            mysqlConnection.closeConnection(connection,preparedStatement);
        }
    }
    @Override
    public Personel findPersonelByID(int id){
    Connection connection = mysqlConnection.connectToDatabase();
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    String query ="SELECT * FROM personel WHERE personalID = ?";
    Personel personel = null;

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                 personel = new Personel(id,resultSet.getString("adi"),resultSet.getString("soyadi"),
                        resultSet.getInt("dogumYili"),resultSet.getString("personelNo"));
            }
        }catch (SQLException e){
        loggerService.warnLog(id+" idli personel bulunamadı."+e.getMessage());
        }
        finally {
            mysqlConnection.closeConnection(connection,preparedStatement,resultSet);

        }
        return personel;
    }
    @Override
    public List<Personel> getPersonels(){
        Connection connection = mysqlConnection.connectToDatabase();
        String query = "SELECT * FROM personel";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Personel> personelList = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
               Personel personel = new Personel(resultSet.getInt("personalID"),resultSet.getString("adi"),resultSet.getString("soyadi"),
                       resultSet.getInt("dogumYili"),resultSet.getString("personelNo"));
               personelList.add(personel);
            }
        }catch (SQLException e){
            loggerService.warnLog("Personel Listesi Alınırken bir hata meydana geldi"+e.getMessage());

        }
        finally {
            mysqlConnection.closeConnection(connection,preparedStatement,resultSet);
        }
        return personelList;
    }

}
