
public class Employee {
 
	private int empId;
	private String empName;
	private String Designation;
	public Employee(int empId, String empName, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		Designation = designation;
		
		
		
	}
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String getDesignation() {
		return Designation;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Designation=" + Designation + "]";
	}
	
	
	
	
	
}
