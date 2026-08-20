 package APP16.com.tca.configuration;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import APP16.com.tca.bean.ServiceA;
import APP16.com.tca.bean.ServiceB;

@Configuration
@ComponentScan("APP16.com.tca")
public class Appconfig {

	@Bean
	public ServiceB serviceb() {
		System.out.println("bean method object");
		return new ServiceB();
	}
	
}
