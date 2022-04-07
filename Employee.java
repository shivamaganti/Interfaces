
class Employee extends Person{
	
	double anual_sal;
	int start_year;
	String insurance_no;
	
	public Employee(String name) {
		super(name);
		System.out.println("Name: "+name);
	}
	
	public void setAnual_sal(double sal) {
		anual_sal = sal;
	}
	
	public double getAnual_sal() {
		return anual_sal;
	}
	public void setstart_year(int year) {
		start_year = year;
	}
	
	public double getstart_year() {
		return start_year;
	}
	public void setinsurance(String insur) {
		insurance_no = insur;
	}
	
	public String getinsurance() {
		return insurance_no;
	}
	
}
