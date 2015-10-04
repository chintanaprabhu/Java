package in.ac.kletech;
//interface is compulsion and abstract is optional
public class Employee {

	private String empName;
    private float eSalary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float geteSalary() {
		return eSalary;
	}
	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}
}
interface Payable
{
    //variables shall not be declared in interface cuz it cannot be imolemented
	float salary();
}
 

class PermanentEmp extends Employee implements Payable
{
	public float salary()
	{
		float sal=(float) (geteSalary()+(0.2*geteSalary())+(0.2*geteSalary())+(0.3*geteSalary())-(0.35*geteSalary())+(0.1*geteSalary()));
		return sal;
	}
      PermanentEmp(String n, float s) {
		// TODO Auto-generated constructor stub
        setEmpName(n);
        seteSalary(s);
        }
}

class TempEmp extends Employee implements Payable
{
	public float salary()
	{
		float sal=(float) (geteSalary()-(0.1*geteSalary()));
		return sal;
	}
	 public TempEmp(String n, float s) {
			// TODO Auto-generated constructor stub
	        setEmpName(n);
	        seteSalary(s);
	        }
}
