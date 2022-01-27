package constuctorsexp;
class employeeInfo{
	int id;
	String name;
   void display() {
	   System.out.println(id+" "+name);
   }
}
public class defalutConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeInfo emp=new employeeInfo();
		employeeInfo emp1=new employeeInfo();
		emp.display();
		emp1.display();

	}

}
