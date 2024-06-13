
public class Employe {
	long id;
	String name;                                                    
	String address;
	long phone;
	double basicsalary;
	double specialallowance=250.80;
	double hra=1000.50;
	//constructor
	public Employe(long id,String name,String address,long phone,double basicsalary) {
		this.id=id;//refer to current object
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.basicsalary=basicsalary;
		
	}
	public void showdetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(phone);
		System.out.println(basicsalary);
	}
	public void calculateSalary() {
		double salary;
		salary = basicsalary + ( basicsalary * specialallowance/100) + ( basicsalary *hra/100);
        System.out.println("salary:"+salary);
	}
	public void calculateTransportAllowance() {
		double transportallowance;
		transportallowance = 10*basicsalary/100;
		System.out.println("transportAllowance:"+transportallowance);
		
	}

}
