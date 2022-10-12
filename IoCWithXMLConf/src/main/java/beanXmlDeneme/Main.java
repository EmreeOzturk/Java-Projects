<<<<<<< HEAD
package beanXmlDeneme;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ICustomerService customerService = context.getBean("service", ICustomerService.class);
        customerService.add();
    }
}
=======
package beanXmlDeneme;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ICustomerService customerService = context.getBean("service", ICustomerService.class);
        customerService.add();
    }
}
>>>>>>> 5a45b80a4b76f18448383529c86f3446399865ac
