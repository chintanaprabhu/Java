package in.ac.kletech;

public class GenericMethodTest {

	public static <E> void printArray(E[] inputArray)     
	//generic methods must be static, no overriding required
	{
		for(E element : inputArray){
			System.out.print(element);   //printf("%s",element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer[] intArray={1,2,3,4,5};
        Double[] doubleArray={1.1,2.2,3.3,4.4,5.5};
        Character[] charArray={'H','E','L','L','O'};
        System.out.println("Array integerArray contains:");
        printArray(intArray);
        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);
        System.out.println("Array charArray contains:");
        printArray(charArray);
	}

}
