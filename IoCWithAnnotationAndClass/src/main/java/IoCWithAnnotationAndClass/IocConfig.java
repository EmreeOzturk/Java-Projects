package IoCWithAnnotationAndClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("IoCWithAnnotationAndClass")
@PropertySource("classpath:application.properties")
public class IocConfig {
    //Artık newlenecek classımıza component vermemize gerek yok
    //Bean anotasyonu ile newlenecek classımızı (getBean metodu içinde) burada yapıyoruz.
    @Bean
    public ICustomerDal database22(){
        return new MySqlDB();
    }

    @Bean
    public ICustomerService customerService(){
        return new CustomerManager(database22());
    }
}
