<<<<<<< HEAD
package IoCWithAnnotationAndClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Artık xml'i devreden çıkartıp daha yaygın olan classlarla IoC yapıcaz
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
        ICustomerService customerService = context.getBean("customerService",ICustomerService.class);
        customerService.add();
    }
}
=======
package IoCWithAnnotationAndClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Artık xml'i devreden çıkartıp daha yaygın olan classlarla IoC yapıcaz
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
        ICustomerService customerService = context.getBean("customerService",ICustomerService.class);
        customerService.add();
    }
}
>>>>>>> 5a45b80a4b76f18448383529c86f3446399865ac
