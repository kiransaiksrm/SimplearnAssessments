package innerclassexp;

public class innerclassexp2 {
	private String msg="Inner Classes";
	void display(){ 
		class Inner{
			void msg() {
				System.out.println(msg);
				} 
		} 
		Inner l=new Inner(); 
		l.msg(); 
} 
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerclassexp2  k=new innerclassexp2(); 
		k.display(); 
	}
}
