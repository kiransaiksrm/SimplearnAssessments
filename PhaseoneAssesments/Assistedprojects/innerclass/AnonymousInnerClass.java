package innerclassexp;
abstract class AnonymousInnerClassmain {
 public abstract void display();
 }
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInnerClassmain i = new AnonymousInnerClassmain() {
			public void display() {
				System.out.println("Anonymous Inner Class");
			}
		};
		i.display();
	}

}
