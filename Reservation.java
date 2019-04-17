package Project2;
//Help received: none - Robert DuPont
import java.util.*;

public class Reservation extends Customer{

	private int customerId;
	private String roomName;
	private String dateOfReservation;
	private String periodReservedFor;
	private boolean availablity;
	private double cost;

	Scanner i = new Scanner(System.in);

	Reservation(){
		customerId = 0;
		roomName = "empty";
		dateOfReservation = "empty";
		periodReservedFor = "empty";
		availablity = true;
		cost = 0.0;
	}


	Reservation(String roomName, String dateOfReservation, String periodReservedFor, boolean availablity, double cost){
		customerId = 0;
		this.roomName = roomName;
		this.dateOfReservation = dateOfReservation;
		this.periodReservedFor = periodReservedFor;
		this.availablity = availablity;
		this.cost = cost;
	}

	public int getCustomerId(){
		return customerId;
	}
	public void setCustomerId(int id){
		//System.out.println("Please enter customer ID: ");
		customerId = id;
	}

	public String getRoomName(){
		return roomName;
	}
	public void setRoomName(){
		System.out.print("Please enter room name: ");
		roomName = i.nextLine();
	}

	public String getDateOfReservation(){
		return dateOfReservation;
	}
	public void setDateOfReservation(){
		System.out.print("Please enter date of reservation in m/d/y format: ");
		dateOfReservation = i.nextLine();
		//String space = " ";
		//space = i.nextLine();
	}

	public  String getPeriodReservedFor(){
		return periodReservedFor;
	}
	public void setPeriodReservedFor(){
		System.out.print("Please enter the date that the customer is leaving in m/d/y format: ");
		periodReservedFor = i.nextLine();
	}

	public boolean getAvailablity(){
		return availablity;
	}
	public void setAvailablityTrue(){
			availablity = true;
	}
	public void setAvailablityFalse(){
		availablity = false;
	}

	public double getCost(){
		return cost;
	}
	public void setCost(){
		System.out.print("Please enter the cost: ");
		cost =  getDouble(i);
	}
	public String StringReservation(){
		return "1. Room name: " + getRoomName() + "\n" + "2. Date of reservation: " + getDateOfReservation() + "\n" + "3. Period reserved for: " + getPeriodReservedFor() + "\n" + 
				"4. Cost: " + getCost();
	}
	public String toString(){
		return "Customer Id: " + getCustomerId() + "\n" + "Room name: " + getRoomName() + "\n" + "Date of reservation: " + getDateOfReservation() + "\n" + "Period reserved for: " + getPeriodReservedFor() + "\n" +
				"Availablity: " + getAvailablity() + "\n" + "Cost: " + getCost() + "\n";
	}
	public double getDouble(Scanner input){
		double entry = 0;
		while(true){
			try{
				entry = input.nextDouble();
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