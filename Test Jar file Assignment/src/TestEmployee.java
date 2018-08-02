// class to test the Employee class which is in a jar file Employee.jar
public class TestEmployee {

	public static void main(String[] args) {
		
		// this is due to the import of an external jar file(Employee.jar)
		Employee employee = new Employee(155358, "Mayur", "Analyst", 17000.0); 
		
		employee.information();

	}

}
