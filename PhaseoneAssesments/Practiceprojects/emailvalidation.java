package Emailidvalidationassignment;
import java.util.*;
public class emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		          Scanner sc = new Scanner(System.in); 
		          System.out.print("Enter the email.ID: ");  
		          String email = sc.nextLine();  
		          sc.close();
		          ArrayList<String> al=new ArrayList<String>();   
			      al.add("kiransai@gmail.com");
			      al.add("reddyajay@gmail.com");
			      al.add("pavithra@gmail.com");
			      al.add("ramesh@gmail.com");
			      al.add("suresh@gmail.com");
			      if (al.contains(email)){
			    	System.out.println("EMIAL WAS AVAILABLE");
			       }
			      else {
			    		System.out.println("EMAIL WAS UNAVAILABLE");
			       }
			      
	}
}
