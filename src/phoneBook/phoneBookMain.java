package phoneBook;
import java.util.ArrayList;
import java.util.Scanner;

public class phoneBookMain {
	
	public static void main (String[]args) {
	
	phoneBook book=new phoneBook();
	Scanner input=new Scanner(System.in);
	
	
	System.out.println("How many names/numbers?");
	int length= input.nextInt();
	
	for (int i=0;i<length;i++) {
		System.out.println("Enter name");
		book.setName(input.next());
		String name=book.getName();
		System.out.println("Enter number");
		book.setPhone(input.next());
		String phoneNumber=book.getPhoneNumber();
		book.addName(name,phoneNumber);
	}
	
	ArrayList <String> names = book.getNames();
	ArrayList <String> phoneNumbers = book.getNums();
	
	System.out.println("Who would you like to call?");
	for (int l=0;l<length;l++) {
		System.out.println(names.get(l));
	}
	boolean exit=true;
	String choice = input.next();
	while (exit==true) {
	for (int c=0;c<names.size();c++) {
		if (choice.equals(names.get(c))) {
			System.out.println(phoneNumbers.get(c));
			exit=false;
		}
		else {
			System.out.println("invalid phone number");
			choice = input.next();
			c=0;
		}
	}
	}
	
	input.close();
	

	}
}
