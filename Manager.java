
public class Manager extends Employee {
	int teamSize;
	//constructor
	public Manager(int id, String name, String job, float salary,int teamSize) {
		super(id, name, job, salary); //reusability
		this.teamSize=teamSize; //extendability
		// TODO Auto-generated constructor stub
	}
	public void getDetails() {
		showdetails();//reusability
		System.out.println(teamSize);
	}
	public void computeHra() {
		hra=salary*40/100;
		System.out.println("Hra of Manager"+hra);
		
	}




}
