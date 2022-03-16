package innerclassexp;

public class innerclassexp1 {
	private String msg="Welcome to Java";
	class Inner{ 
		void display(){
			System.out.println(msg+", Let us start learning Inner Classes"); 
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerclassexp1 obj=new innerclassexp1();
		innerclassexp1.Inner in=obj.new Inner(); 
		in.display(); 
	}

}
