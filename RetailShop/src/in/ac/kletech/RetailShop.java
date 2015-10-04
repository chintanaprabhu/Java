package in.ac.kletech;

class Customer{
	private String sCustName;
	static int counter;
	private long lTele[] = new long[2];
	private int iQty;
	
	
	public String getsCustName() {
		return sCustName;
	}
	public void setsCustName(String sCustName) {
		this.sCustName = sCustName;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Customer.counter = counter;
	}
	public long[] getlTele() {
		return lTele;
	}
	public void setlTele(long[] lTele) {
		this.lTele = lTele;
	}
	public int getiQty() {
		return iQty;
	}
	public void setiQty(int iQty) {
		this.iQty = iQty;
	}
	public long getlPrice() {
		return lPrice;
	}
	public void setlPrice(long lPrice) {
		this.lPrice = lPrice;
	}
	private long lPrice;
}

class RegularCustomer extends Customer
{
	static
	{
		counter=1000;
	}
	
	public RegularCustomer()
	{
		int iRegularCustId=++counter;
	}
	long calBill(int iQty,long lPrice)
	{
		return iQty*lPrice;
	}
}

class PrivilageCust extends Customer
{
	static
	{
		counter=2000;
	}
	
	public PrivilageCust()
	{
		int iPrivilageCustId=++counter;
	}
	double calBill(int iQty,long lPrice)
	{
		double lBill = iQty*lPrice;
		if(lBill>=500)
		{
			lBill = lBill-(lBill*0.5d);
		}
		return lBill;
		
	}
}


public class RetailShop {

public static void main(String[] args) {
	RegularCustomer r1= new RegularCustomer();
    PrivilageCust p1 = new PrivilageCust();
     r1.setsCustName("Chintana");
     long lTele[] = new long[2];
     lTele[0]=9663639129l;
    // r1.setlTele(lTele[0]);
     r1.setiQty(3);
     r1.setlPrice(300);
     r1.calBill(r1.getiQty(),r1.getlPrice());
     p1.setsCustName("Shrinidhi");
     p1.setiQty(5);
     p1.setlPrice(500);
    
     System.out.println("bill=" +p1.calBill(p1.getiQty(),p1.getlPrice()));
     
    
}	
}
