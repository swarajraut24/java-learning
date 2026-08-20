package APP16.com.tca.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceC {
  
	@Autowired
	public ServiceB serviceb;
	
	public ServiceC() {
		System.out.println("Constructor-ServiceC");
	}
}
