package BuilderPattern;

public class Employee {
	private String name;
	private String phoneNo;
	private int age;
	private String address;

	// No setters defined , only getters are defined to retain immutability
	public String getName() {
		return name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	private Employee(EmployeeBuilder builder) {
		this.name = builder.name;
		this.phoneNo = builder.phoneNo;
		this.address = builder.address;
		this.age = builder.age;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", phoneNo='" + phoneNo + '\'' + ", age=" + age + ", address='"
				+ address + '\'' + '}';
	}

	public static class EmployeeBuilder{
        private String name;
        private String phoneNo;
        private int    age ;
        private String address;

        public EmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }
        public EmployeeBuilder age(int age) {
            this.age = age;
            return this;
        }
        public EmployeeBuilder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public EmployeeBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public Employee build(){
            Employee employee = new Employee(this);
            return employee;
        }
        
    }
}
