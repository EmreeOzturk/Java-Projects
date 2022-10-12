<<<<<<< HEAD
package beanXmlDeneme;

public class CustomerManager implements ICustomerService {
    private ICustomerDal customerDal;
    //constructor injection
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    //setter injection
    public void setCustomerDal(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    @Override
    public void add(){
        customerDal.add();
    }

}
=======
package beanXmlDeneme;

public class CustomerManager implements ICustomerService {
    private ICustomerDal customerDal;
    //constructor injection
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    //setter injection
    public void setCustomerDal(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    @Override
    public void add(){
        customerDal.add();
    }

}
>>>>>>> 5a45b80a4b76f18448383529c86f3446399865ac
