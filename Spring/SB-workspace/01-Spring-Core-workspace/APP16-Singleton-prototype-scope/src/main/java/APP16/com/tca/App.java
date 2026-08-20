package APP16.com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import APP16.com.tca.bean.ServiceA;
import APP16.com.tca.configuration.Appconfig;

public class App {
    public static void main(String[] args) {
        
    	ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
    	     
    	System.out.println("byee");
    }
}
