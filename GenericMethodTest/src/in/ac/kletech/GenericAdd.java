package in.ac.kletech;

public class GenericAdd<U,V> {
    private U objUreff;
    private V objVreff;
    public GenericAdd(U objU, V objV){
    	this.objUreff = objU;
    	this.objVreff = objV;
    }
    public void printTypes(){
    	System.out.println("U type: "+this.objUreff.getClass().getName());
    	System.out.println("V type: "+this.objVreff.getClass().getName());
    }
    
	public static <U,V> void add(U a, V b) {
//		System.out.println(+(a+b));  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       GenericAdd a = new GenericAdd(10,20);
//        a.add(10,20);
       a.printTypes();
	}

}
