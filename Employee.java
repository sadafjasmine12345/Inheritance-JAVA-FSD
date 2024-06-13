
public class Employee {
	int id;
	String name;
	String job;
	float salary,hra;
	//constructor
	public Employee(int id,String name,String job,float salary) {
		this.id=id;//refer to current object
		this.name=name;
		this.job=job;
		this.salary=salary;
	}
	public void showdetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(job);
		System.out.println(salary);
	}
	public void computeHra() {
		hra=salary*(20/100);
		System.out.println("Hra of employee"+hra);
		
	}

}


