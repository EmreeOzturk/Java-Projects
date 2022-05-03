import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

       /*ArrayList<Country> countries = getAllCountries();
        for (Country country:countries) {
            System.out.println("Name : "+country.getName()+" CountryCode : "+country.getCode()+" Region : "+country.getRegion()
            +" Continent : "+country.getContinent());
        }*/

        /*addCity("Duzce5", "TUR", "Duzce", 50000);*/

        /*updateCityPopulationbyID(99999,10000);*/
    }

    public static void updateCityPopulationbyID(int id, int newPopulation) {
        Connection connection = MysqlConnection.connectToDatabase();
        if (connection != null) {
            String query = "UPDATE city SET population = ? WHERE id = ?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1,newPopulation);
                preparedStatement.setInt(2,id);
                preparedStatement.executeUpdate();
                System.out.println("Succesfully update");
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Query or preparedStatement fail.");
                System.out.println(e.getMessage() + "\n" + e.getErrorCode());
            }
        } else {
            return;
        }
    }

    public static void addCity(String name, String countryCode, String district, int population) {
        Connection connection = MysqlConnection.connectToDatabase();
        if (connection != null) {
            try {
                String query = "INSERT INTO city(name,countrycode,district,population) VALUES(?,?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, countryCode);
                preparedStatement.setString(3, district);
                preparedStatement.setInt(4, population);
                preparedStatement.executeUpdate();
                System.out.println("Successfully added");
                connection.close();
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Query or preparedStatement fail.");
                System.out.println(e.getMessage() + "\n" + e.getErrorCode());
            }
        } else {
            return;
        }
    }


    public static ArrayList<Country> getAllCountries() {
        String query = "SELECT * FROM country";
        ArrayList<Country> countries = new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;
        Connection connection = MysqlConnection.connectToDatabase();
        if (connection != null) {
            try {
                statement = connection.createStatement();

            } catch (SQLException e) {
                System.out.println("Statement fail.");
                System.out.println(e.getMessage() + "\n" + e.getErrorCode());
            }
            try {
                resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    countries.add(new Country(resultSet.getString("code"), resultSet.getString("name"),
                            resultSet.getString("continent"), resultSet.getString("region")));
                }
                resultSet.close();
                connection.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("ResultSet fail.");
                System.out.println(e.getMessage() + "\n" + e.getErrorCode());
            }

        }
        return countries;
    }
}
