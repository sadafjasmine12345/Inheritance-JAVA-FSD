
public class MainCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee kumar=new Employee(1452,"Kumar","Developer",24563.25f);
		Manager Sadaf=new Manager(145875,"Sadaf jashmeen","Tech Manager",56321.25f,25);
		System.out.println("Employee Details");
		kumar.showdetails();
		System.out.println("Manager Details");
		Sadaf.getDetails();
		kumar.computeHra();
		Sadaf.computeHra();

	}
	

}
