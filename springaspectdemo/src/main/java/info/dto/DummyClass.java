package info.dto;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype",proxyMode=ScopedProxyMode.INTERFACES)
public class DummyClass implements DummyInterfaceOne, DummyInterfaceTwo {
	
	public DummyClass() {
		System.out.println("Dummyclass====");
	}

	public void methodTwo() {
		System.out.println("methodTwo");
	}

	public void methodOne() {
		System.out.println("methodOne");
	}

}
