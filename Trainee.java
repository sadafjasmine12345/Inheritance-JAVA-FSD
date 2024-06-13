
public class Trainee extends Employe {


	public Trainee(long id,String name, String address,long phone,double basicsalary) {
		super(id,name,address,phone,basicsalary);
		
		// TODO Auto-generated constructor stub
	}
	public void getDetails() {
		showdetails();//reusability
		
	}
	public void calculateTransportAllowance() {
		double transportallowance;
		transportallowance = 10*basicsalary/100;
		System.out.println("transportAllowance of trainee:"+transportallowance);
		
	}

}
