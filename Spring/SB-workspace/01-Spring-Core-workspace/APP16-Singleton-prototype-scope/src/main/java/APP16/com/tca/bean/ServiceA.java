package APP16.com.tca.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ServiceA {
   
	public ServiceA() {
		System.out.println("ServiceA constructor");
	}
}
