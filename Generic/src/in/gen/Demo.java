package in.gen;

class GenericClass<T,E> {
      private T a;
      private E b;
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public E getB() {
		return b;
	}
	public void setB(E b) {
		this.b = b;
	}
	public GenericClass(T a, E b)
	{
		this.a=a;
		this.b=b;
	}
}

class Demo
{
	public static void main(String[] args) {
		GenericClass<Integer,String> p = new GenericClass<Integer,String>(10,"abc");
		System.out.println(p.getA());
		System.out.println(p.getB());
	}
}