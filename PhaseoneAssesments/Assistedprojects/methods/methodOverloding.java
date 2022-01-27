package methodsref;

public class methodOverloding {
	void area(int breath,int height) {
		System.out.println("Area of trainagle is:"+(0.5*breath*height));
	}
	void area(int radius) {
		System.out.println("Area of circle is:"+(3.14*radius*radius));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloding mo=new methodOverloding();
		mo.area(10,12);
		mo.area(5);

	}

}
