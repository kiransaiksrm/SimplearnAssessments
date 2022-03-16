package constuctorsexp;
class student{
	int id;
	String name;
	student(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}

public class parametrizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       student std=new student(1,"kiran");
       student std1=new student(2,"ramu");
       std.display();
       std1.display();
	}

}
