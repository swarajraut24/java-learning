package com.tca.APP12;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class MessageSender implements InitializingBean , DisposableBean{
  private String Serverip;
  private String Serverport;
  
  
  public void setServerip(String serverip) {
	Serverip = serverip;
  }
  public void setServerport(String serverport) {
	Serverport = serverport;
  }
  
  public void myinit() {
	  System.out.println("this is myinit method");
  }
 
  public void mydestroy() {
	  System.out.println("this is mydestroy method");
  }
  @Override 
  public void destroy() throws Exception {
	 System.out.println("disconnecting the server");
	
  }
  @Override
  public void afterPropertiesSet() throws Exception {
	
	System.out.println("connection to the server");
  }
  
  
  
}
