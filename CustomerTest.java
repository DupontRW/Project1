package Project2;
//Help received: none - Robert DuPont
import java.util.*;
public class CustomerTest { // extends Reservation{
	 int count3 = 0;
	  int reservationSize = 100;
	  Reservation [] customerReservation = new Reservation[reservationSize];
	
	static Scanner input = new Scanner(System.in);
	static boolean menu = true;
	public static void main (String[]args){
		
		CustomerTest custTest = new CustomerTest();
		
		Customer [] list1 = custTest.mainMenu();
		while (menu){
			custTest.mainMenu2(list1);
		}
	}
	public Customer[] mainMenu(){
		
		for(int j = 0; j < customerReservation.length; j++){
		    customerReservation[j] = new Reservation();
	    }
		
		while(true){
			System.out.println("*****************************");
			System.out.println("Moody Hall Room Reservation System");
			System.out.println("*****************************");
			System.out.println(" ");
			System.out.println("1: Add Customers?");
			System.out.println("2: Quit");

			int response = getInt(input);

			if(response == 1){
				System.out.println(" ");
				System.out.print("How many customers would you like to add?: ");
				int n = getInt(input);
				System.out.println(" ");
				
				Customer [] customerList = new Customer[n];
				for(int j = 0; j < customerList.length; j++){
					customerList[j] = new Customer();
			    }	
				
				int p = 0;
				int count2 = 0;
				for(int i = 0; i < customerList.length; i++){
					int x = i + 1;
					System.out.println("Informaiton for customer " + x);
					customerList[i].setCustomerId();
					customerList[i].setLastName();
					customerList[i].setFirstName();
					customerList[i].setAddress();
					customerList[i].setEmailAddress();
					customerList[i].setContactPhoneNumber();
					System.out.println("");
					
					System.out.println("How many rooms does this customer want? :");
					int number = input.nextInt();
					
					for(int f = 0; f < number; f++){
						System.out.println("Information for Customer Id of " + customerList[i].getCustomerId() + " room " + (f + 1));
						int id = customerList[i].getCustomerId();
						customerReservation[count2].setCustomerId(id);
						customerReservation[count2].setRoomName();
						customerReservation[count2].setDateOfReservation();
						customerReservation[count2].setPeriodReservedFor();
						customerReservation[count2].setAvailablityFalse();
						customerReservation[count2].setCost();
						System.out.println(" ");
						count2++;
					}
					count3 += number;
				}
				return customerList;
			}
			else if(response == 2){
				System.out.println("Thanks for using!");
				System.exit(0);

			}  
			else{
				System.out.println("Invalid entry. Please enter 1 or 2: ");
				System.out.println(" ");
				continue;
			}
			return null;
		}
	}
	
	
	public void mainMenu2(Customer [] List){
		while(true){
			System.out.println("1: Edit costumer info/edit cusomter reservation");
			System.out.println("2: See all customers and reservations");
			System.out.println("3: Exit");
			int response = getInt(input);
			if (response == 1){
				editCustomerInfo(List);

			}
			else if(response == 2){
				for(int i = 0; i < customerReservation.length; i++ ){
					
					if(customerReservation[i].getCustomerId() != 0) {
					   System.out.println("");
					   System.out.println(customerReservation[i].toString());
					   System.out.println(" ");
					}
				}
			}
			else if (response == 3){
				System.out.println("Thanks for using!");
				menu = false;
			}
			else{
				System.out.println("Invalid entry. Please enter 1, 2, or 3:");
			}
		}
	}
	public void editCustomerInfo(Customer [] List){
		System.out.println("Enter customer ID:");
		int response = input.nextInt();
		Customer found = linearSearchCustomerId(List, response);
		System.out.println(found.String());
		editInfo(found);
	}
	public void editInfo(Customer found){
		int count = 0;
		while(true){
			if(count > 0){
				System.out.println(found.String());
			}
			System.out.println("What customer information would you like to edit? (enter number): ");
			int response = getInt(input);
			if (response == 1){
				found.setCustomerId();
			}
			else if (response == 2){
				found.setLastName();
			}
			else if (response == 3){
				found.setFirstName();
			}
			else if (response == 4){
				found.setAddress();
			}
			else if (response == 5){
				found.setEmailAddress();
			}
			else if (response == 6){
				found.setContactPhoneNumber();
			}
			else if(response == 7){
				boolean x = true;
				int count1 = 0;
				for(int i = 0; i < count3; i++){
					int room = 0;
					while(x){
						if(found.getCustomerId() == customerReservation[i].getCustomerId() && customerReservation[i].getAvailablity() == false){
							System.out.println(customerReservation[i].StringReservation()); 
							if(count1 >= 0 && count1 != count3 - 1){
								System.out.println("5. Next Room *only if customer has more than one room*");
								System.out.println("6. Delete room");
								System.out.println("7. Exit");
								System.out.println("What reservation information would you like to edit? (enter number):");
								int w = getInt(input);
								if (w == 1){
									customerReservation[i].setRoomName();
								}
								else if (w == 2){
									customerReservation[i].setDateOfReservation();
								}
								else if (w == 3){
									customerReservation[i].setPeriodReservedFor();
								}
								else if (w == 4){
									customerReservation[i].setCost();
								}
								else if(w == 5){
									break;
								}
								else if(w == 6){
									room = 1;
									break;
								}
								else if(w == 7){
									x = false;
									//break;
								}else{
									System.out.println("Invalid response.");
								}
							}
							if(count1 == count3 - 1){
								System.out.println("5. Delete room");
								System.out.println("6. Exit");
								System.out.println("What reservation information would you like to edit? (enter number):");
								int w = getInt(input);
								if (w == 1){
									customerReservation[i].setRoomName();
								}
								else if (w == 2){
									customerReservation[i].setDateOfReservation();
								}
								else if (w == 3){
									customerReservation[i].setPeriodReservedFor();
								}
								else if (w == 4){
									customerReservation[i].setCost();
								}
								else if (w == 5){
									room = 1;
									break;
								}
								else if(w == 6){
									x = false;
									break;
								}
								else{
									System.out.println("Invalid response.");
								}
							}
						}
					}
					if (room == 1){
						customerReservation[i].setAvailablityTrue();
						break;
					}
					count1++;
				}
			}
			else if(response == 8){
				System.out.println("Anything else?");
				break;
			}
			else{
				System.out.println("Invalid response please try again");
			}
		count++;
		}
	}
	public Customer linearSearchCustomerId(Customer [] List, int customerId){
		for(int i = 0; i < List.length; i++){
			if (List[i].getCustomerId() == customerId){
				return List[i];
			}
		}
		return null;
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