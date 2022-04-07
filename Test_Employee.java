
public class Test_Employee {

	public static void main(String[] args) {
		
		Employee em = new Employee("Shiva");
		
		em.setAnual_sal(432793.2);
		em.setstart_year(2012);
		em.setinsurance("13ehbf2");

		System.out.println("Anual salary :"+em.getAnual_sal()+"\nStart Year: "+em.getstart_year()+"\nInsurance Number: "+em.getinsurance());

	}

}
