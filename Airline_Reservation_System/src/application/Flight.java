package application;

public class Flight {

	
	private int FlightID,capacity;
	private String Source,Plane_Type,Destination,Flight_Date,Departure_Time,Arrival_Time;
	
	
	Flight(int FID,int cap,String src,String dest,String ptype,String date,String depttime,String arrivaltime){
		FlightID=FID;
		capacity=cap;
		Source=src;
		Plane_Type=ptype;
		Destination=dest;
		Flight_Date=date;
		Departure_Time=depttime;
		Arrival_Time=arrivaltime;
		
	}
	public int getFlightID() {
		return FlightID;
	}
	public void setFlightID(int flightID) {
		FlightID = flightID;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getFlight_Date() {
		return Flight_Date;
	}
	public void setFlight_Date(String flight_Date) {
		Flight_Date = flight_Date;
	}
	public String getDeparture_Time() {
		return Departure_Time;
	}
	public void setDeparture_Time(String departure_Time) {
		Departure_Time = departure_Time;
	}
	public String getArrival_Time() {
		return Arrival_Time;
	}
	public void setArrival_Time(String arrival_Time) {
		Arrival_Time = arrival_Time;
	}
	public String getPlane_Type() {
		return Plane_Type;
	}
	public void setPlane_Type(String plane_Type) {
		Plane_Type = plane_Type;
	}
	
	public String displayFlights() {
		return (Integer.toString(FlightID) + "," +Integer.toString(capacity) + "," + Plane_Type+ "," +Source+ "," +Destination+ "," +Flight_Date+ "," +Departure_Time+ "," +Arrival_Time);
	}
}
