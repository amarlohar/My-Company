package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailValidation {
	
	
		   public static boolean isValidEmail(String email) {
			   String regex = "^(.+)@(.+)$";
			 //initialize the Pattern object
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();
		   }

		   public static void main(String[] args) {
		       List<String> emails = new ArrayList<String>();
		       // valid email addresses
		       emails.add("amar@example.com");
		       emails.add("onkar@example.com");
		       emails.add("mayur@example.me.org");
		       //invalid email addresses
		       emails.add("mahesh.example.com");
		       emails.add("anikit..bob@example.com");
		       emails.add("rupesh@.example.com");
		       System.out.println("");
		       for (String value : emails) {
		           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
		           
		           
		       }
		       System.out.println("");
		       System.out.println("Enter any email address to check : ");
		       
		       Scanner sc = new Scanner(System.in);
		       String input = sc.nextLine();
		       
		       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
		       System.out.println("");
		       
		   }
		   
}