package info.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype" ,proxyMode=ScopedProxyMode.DEFAULT)
public class SerializationImpl implements Serializable{
	@Autowired
	private DummyInterfaceTwo two;
	
	public SerializationImpl() {
		System.out.println("SerializationImpl created====");
	}
	
	public void testMethod() {
		System.out.println("testmethod==");
		System.out.println(two);
		two.methodTwo();
	}

}
