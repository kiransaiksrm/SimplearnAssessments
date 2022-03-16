package simplilearn_phase1;
class privateAccess{
	void display() {
		System.out.println("we are using private access modifer....");
	}
}
public class privateAccessmodifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PRIVATE ACCESS MODIFER..");
		privateAccess p=new privateAccess();
		p.display();
	}
}
