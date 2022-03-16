package methodsref;

public class callByValuemethod {
	int val=150;
	int operation(int val) {
		val=val*10/100;
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        callByValuemethod cm=new callByValuemethod();
        System.out.println("Before operation the value of data is:"+cm.val);
        cm.operation(100);
        System.out.println("After performing opearation value of data is:"+cm.val);
        
	}

}
