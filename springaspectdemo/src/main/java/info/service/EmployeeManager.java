package info.service;

import info.dto.DummyInterfaceOne;
import info.dto.EmployeeDTO;
import info.dto.SerializationImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
	@Autowired
	private SerializationImpl serialization;
	
	@Autowired
	private DummyInterfaceOne one;
	
	public EmployeeManager() {
		System.out.println("component object is created===");
	}
	
	public EmployeeDTO getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        one.methodOne();
        System.out.println(one);
        serialization.testMethod();
        return new EmployeeDTO();
    }
 
    public List<EmployeeDTO> getAllEmployee() {
        System.out.println("Method getAllEmployee() called");
        return new ArrayList<EmployeeDTO>();
    }
 
    public void createEmployee(EmployeeDTO employee) {
        System.out.println("Method createEmployee() called");
    }
 
    public void deleteEmployee(Integer employeeId) {
        System.out.println("Method deleteEmployee() called");
    }
 
    public void updateEmployee(EmployeeDTO employee) {
        System.out.println("Method updateEmployee() called");
    }

}
