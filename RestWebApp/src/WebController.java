
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/webservice")

public class WebController {
	
	private static Map<String, Employee> employees = new HashMap<String, Employee>();
	
	static {
		
		Employee employee1 = new Employee();
		employee1.setEmployeeId("11111");
		employee1.setEmployeeName("Guillermo");
		employee1.setJobType("Bioinformatician");
		employee1.setSalary(7000l);
		employee1.setAddress("MÃ¡laga");
		employees.put(employee1.getEmployeeId(), employee1);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeId("22222");
		employee2.setEmployeeName("Pepito");
		employee2.setJobType("Biologist");
		employee2.setSalary(5000l);
		employee2.setAddress("Barcelona");
		employees.put(employee2.getEmployeeId(), employee2);
		
	}
	
	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String hello() {
		return "Hello World!!! Guille";
	}
	
	@GET
	@Path("/message/{message}")
	@Produces("text/plain")
	public String showMsg(@PathParam("message") String message) {
		return message;
	}
	
	@GET
	@Path("/employees")
	@Produces("text/xml")
	public List<Employee> listEmployees() {
		return new ArrayList<Employee>(employees.values());
	}
	
	@GET
	@Path("/employees/id/{id}")
	@Produces("text/xml")
	public Employee listEmployeesID(@PathParam("id") String id) {
		return employees.get(id);
	}
	
	@GET
	@Path("/json/employees")
	@Produces("application/json")
	public List<Employee> listEmployeesJSON() {
		return new ArrayList<Employee>(employees.values());
	}
	
	@GET
	@Path("/json/employees/id/{id}")
	@Produces("application/json")
	public Employee listEmployeesJSONID(@PathParam("id") String id) {
		return employees.get(id);
	}

}
