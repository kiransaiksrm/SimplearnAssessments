import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidation {
  
	public static boolean isEmailValid(String email) {
		String regex = "^(.+)@(.+)$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public static void main(String [] args) {
		List<String> emails = new ArrayList<String>();
		
//		Valid Email Address Type
		
		emails.add("janu@myapple.com");
		emails.add("jaggu@myapple.com");
		emails.add("vinay@myapple.com");
		emails.add("ramya@myapple.com");
		
//	    Invalid Email Address Type
		
		emails.add("suji.myapple.com");
		emails.add("kalyan.myapple.com");
		emails.add("raj.myapple.com");
		emails.add("shivani.myapple.com");
		
		System.out.println("Enter Email address you want to check");
		Scanner theChecker = new Scanner(System.in);
		String input = theChecker.nextLine();
		System.out.println("The Email address " + input + " is " + (isEmailValid(input) ? "valid" : "invalid"));
	}

}
