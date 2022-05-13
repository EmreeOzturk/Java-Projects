package beanXmlDeneme;

public class MySqlDB implements ICustomerDal{
    private String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void add() {
        System.out.println("MySql Eklendi");
        System.out.println(connectionString);
    }
}
