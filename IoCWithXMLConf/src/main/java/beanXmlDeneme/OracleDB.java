package beanXmlDeneme;

public class OracleDB implements ICustomerDal{
    private String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    @Override
    public void add() {
        System.out.println("Oracle Eklendi");
        System.out.println(connectionString);
    }
}
