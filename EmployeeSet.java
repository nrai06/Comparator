import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeSet {
	public static void main(String[] args) {
		Set<Employee> empset=new  TreeSet<>(new  EmployeeIdComparator());//Hashset and linkedhashset are giving the output
		
		empset.add(new Employee(123,"john","Developer"));
		empset.add(new Employee(456, "smith", "Tester"));
		empset.add(new Employee(323,"Adam","Developer"));
		empset.add(new Employee(256, "Elon", "Tester"));
		
		for(Employee employee:empset) {
			System.out.println((employee));
		}
		
		
	}

}
