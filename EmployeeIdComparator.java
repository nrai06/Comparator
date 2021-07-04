import java.util.Comparator;

public  class EmployeeIdComparator implements Comparator<Employee>{

 
		
		 
	public int compare(Employee emp1,Employee emp2) {
			Integer empId1=emp1.getEmpId();
			Integer empId2=emp2.getEmpId();
			return empId1.compareTo(empId2);
	}





	 


	

}
