package multithreadingexp;

public class myThread extends Thread {
    public void run() {
    	System.out.println("concurrent thread was started running..");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread mt = new  myThread();
  		mt.start();
	}

}
