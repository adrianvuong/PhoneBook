package phoneBook;
import java.util.ArrayList;

public class phoneBook {
	
	public ArrayList <String> names = new ArrayList <String>();
	public ArrayList <String> phoneNumbers = new ArrayList <String>();
	private String name;
	private String phoneNumber;
	
	public phoneBook() {
		this.name="";
		this.phoneNumber="";
	}
	
	public String setName(String name) {
		this.name=name;
		return name;
	}
	public String setPhone(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		return phoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public ArrayList<String> getNames() {
		return names;
	}
	
	public ArrayList<String> getNums(){
		return phoneNumbers;
	}
	
	public void addName(String name, String phoneNumber) {
		names.add(name);
		phoneNumbers.add(phoneNumber);
	}
}
