package in.ac.kletech;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PermanentEmp p1 = new PermanentEmp("Chintana",10000);
        TempEmp t1 = new TempEmp("Swati", 9000);
        System.out.println(p1.salary());
        System.out.println(t1.salary());
        
	}

}
