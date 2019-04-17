package Project2;
//Help received: none - Robert DuPont
import java.util.*;

public class Customer {

	private int customerId;
	private String lastName;
	private String firstName;
	private String address;
	private String emailAddress;
	private String contactPhoneNumber;

	static Scanner input1 = new Scanner(System.in);

	Customer(){
		customerId = 0;
		lastName = "last";
		firstName = "first";
		address = "123 drive";
		emailAddress = "lastfirst@customer.com";
		contactPhoneNumber = "1234567";
	}
	Customer(int customerId, String lastName, String firstName, String address, String emailAddress, String contactPhoneNumber){
		this.customerId = customerId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.emailAddress = emailAddress;
		this.contactPhoneNumber = contactPhoneNumber;
	}
	public int getCustomerId(){
		return customerId;
	}
	public void setCustomerId(){
		System.out.print("Please enter customer ID: ");
		customerId = getInt(input1);
		String space = input1.nextLine();
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(){
		System.out.print("Please enter customer's last name: ");
		lastName = input1.nextLine();
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(){
		System.out.print("Please enter customer's first name: ");
		firstName = input1.nextLine();
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(){
		System.out.print("Please enter customer's address: ");
		address = input1.nextLine();
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	public void setEmailAddress(){
		System.out.print("Please enter customer's email address: ");
		emailAddress = input1.nextLine();
	}
	public String getContactPhoneNumber(){
		return contactPhoneNumber;
	}
	public void setContactPhoneNumber(){
		System.out.print("Please enter customer's contact phone number in (XXX)-XXX-XXXX format: ");
		contactPhoneNumber = input1.nextLine();
	}
	public String String(){
		return "1. Customer Id: " + getCustomerId() + "\n" + "2. Last name: " + getLastName() + "\n" + "3. First name: " + getFirstName() + "\n" +
				"4. Address: " + getAddress() + "\n" + "5. Email address: " + getEmailAddress() + "\n" + "6. Contact phone number: " + getContactPhoneNumber() + "\n7. Edit Reservation" + "\n8. Quit ";
	}
	public String CustomerReservationlist(){
				
		return address;
		
	}
	
	public int getInt(Scanner input){
		int entry = 0;
		while(true){
			try{
				entry = input.nextInt();
				break;
			}catch(InputMismatchException e){
				input.nextLine();
				System.out.println("Error: invalid entry. Please enter a number.");
				continue;
			}
		}
		return entry;
	}
}