package application;

import java.util.ArrayList;

public class ARS {

	 private static ARS single_instance = null;

	    public static ARS getInstance()
	    {
	        if (single_instance == null)
	            single_instance = new ARS();
	 
	        return single_instance;
	    }	
	
	    
	    
	 //Populating the classes
	    ArrayList<FDO> FDO_list = new ArrayList<FDO>();
	    ArrayList<Admin> Admin_list = new ArrayList<Admin>();
	    ArrayList<Customer> Customer_list = new ArrayList<Customer>();
	    ArrayList<Flight> Flight_list = new ArrayList<Flight>();
	    ArrayList<Booking> Booking_list = new ArrayList<Booking>();
	    ArrayList<Seat> Seat_list = new ArrayList<Seat>();
	    ArrayList<menushow> menushow_list = new ArrayList<menushow>();
	    
	    FileHandler F_Handler=new FileHandler();
	    
	    
	    void Populate() {
	    	FDO_list=F_Handler.Populate_FDO(FDO_list);
	    	Admin_list=F_Handler.Populate_Admin(Admin_list);
	    	Customer_list=F_Handler.Populate_Customer(Customer_list);
	    	Flight_list=F_Handler.Populate_Flight(Flight_list);
	    	Booking_list=F_Handler.Populate_Bookings(Booking_list);
	    	Seat_list=F_Handler.Populate_Seats(Seat_list);
	    	menushow_list=F_Handler.Populate_menushow(menushow_list);
	    	
	    	
	    
	    }
	    
	
}
