package BuilderPattern;

public class Employee {
	private int empId;
	private String empName;
	private String Address;
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getAddress() {
		return Address;
	}
	private Employee(EmployeeBuilder employeeBuilder) {
		super();
		this.empId=employeeBuilder.empId;
		this.empName=employeeBuilder.empName;
		this.Address=employeeBuilder.Address;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Address=" + Address + "]";
	}



	//This inner class will create and provide the object for the outer class
	static class EmployeeBuilder{
		EmployeeBuilder(){
			
		}
		private int empId;
		private String empName;
		private String Address;
		public EmployeeBuilder setEmpId(int empId) {
			this.empId = empId;
			return this;
		}
		public EmployeeBuilder setEmpName(String empName) {
			this.empName = empName;
			return this;
		}
		public EmployeeBuilder setAddress(String address) {
			Address = address;
			return this;
		}
		
		public Employee build() {
			Employee e1=new Employee(this);
			return e1;
		}
	}
	
}
