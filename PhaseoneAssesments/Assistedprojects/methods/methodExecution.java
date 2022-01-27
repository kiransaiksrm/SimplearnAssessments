package methodsref;

public class methodExecution {
    public int multiplication(int a,int b) {
    	int c=a*b;
    	return c;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodExecution m=new methodExecution();
		int d=m.multiplication(10,3);
		System.out.println("multiplication of two numbers is:"+d);
	}

}
