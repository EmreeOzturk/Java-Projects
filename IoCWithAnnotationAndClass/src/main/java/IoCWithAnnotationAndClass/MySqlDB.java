<<<<<<< HEAD
package IoCWithAnnotationAndClass;

import org.springframework.beans.factory.annotation.Value;

/*import org.springframework.stereotype.Component;

@Component("database")*/
public class MySqlDB implements ICustomerDal{
    @Value("${xx.connectionString}")
    private String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    @Override
    public void add() {
        System.out.println("MySql DB eklendi");
        System.out.println(connectionString);

    }
}
=======
package IoCWithAnnotationAndClass;

import org.springframework.beans.factory.annotation.Value;

/*import org.springframework.stereotype.Component;

@Component("database")*/
public class MySqlDB implements ICustomerDal{
    @Value("${xx.connectionString}")
    private String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    @Override
    public void add() {
        System.out.println("MySql DB eklendi");
        System.out.println(connectionString);

    }
}
>>>>>>> 5a45b80a4b76f18448383529c86f3446399865ac
