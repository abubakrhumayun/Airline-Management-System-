package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class bookingDisplay implements Initializable {

	@FXML
	private Label booking_ID;
	@FXML
	private Label seatnum;
	@FXML
	private Label cus_ID;
	@FXML
	private Label Flight_ID;

	@FXML
	private Label booking_ID1;
	@FXML
	private Label seatnum1;
	@FXML
	private Label cus_ID1;
	@FXML
	private Label Flight_ID1;
    
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void initialize(URL arg0, ResourceBundle arg1) {

		Boolean check = false;

		for (int i = 0; i < ARS.getInstance().Booking_list.size(); i++) {
			if (check == false) {
				booking_ID.setText(Integer.toString(ARS.getInstance().Booking_list.get(i).getBooking_ID()));
				Flight_ID.setText(Integer.toString(ARS.getInstance().Booking_list.get(i).getFlight_ID()));
				cus_ID.setText(Integer.toString(ARS.getInstance().Booking_list.get(i).getCustomer_ID()));
				seatnum.setText(Integer.toString(ARS.getInstance().Booking_list.get(i).getNum_Seats()));
				check = true;
			} else if (check == true) {
				booking_ID1.setText(Integer.toString(ARS.getInstance().Booking_list.get(i).getBooking_ID()));
				Flight_ID1.setText(Integer.toString(ARS.getInstance().Booking_list.get(i).getFlight_ID()));
				cus_ID1.setText(Integer.toString(ARS.getInstance().Booking_list.get(i).getCustomer_ID()));
				seatnum1.setText(Integer.toString(ARS.getInstance().Booking_list.get(i).getNum_Seats()));
			}
		}
	}

	public void switchToHome(MouseEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}



}
