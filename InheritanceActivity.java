
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Managerr peter=new Managerr(126534,"peter","Chennai India",234567,65000);
		Trainee jack=new Trainee(29846,"jack","Mumbai India",675489,45000);
		System.out.println("Managerr Details");
		peter.showdetails();
		peter.calculateSalary();
		System.out.println("Trainee Details");
		jack.getDetails();
		jack.calculateSalary();
		peter.calculateTransportAllowance();
		jack.calculateTransportAllowance();
		
		
		
	}

}
