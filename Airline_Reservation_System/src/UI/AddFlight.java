package UI;

import java.io.IOException;

import application.ARS;
import application.tempStatic;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class AddFlight {

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	TextField planetype = new TextField();
	@FXML
	TextField source = new TextField();
	@FXML
	TextField dest = new TextField();
	@FXML
	TextField depart = new TextField();
	@FXML
	TextField arrival = new TextField();
	@FXML
	TextField date = new TextField();
	@FXML
	TextField price = new TextField();
	@FXML
	TextField capacity = new TextField();
	@FXML
	Label incomplete = new Label();

	public void Addflight(MouseEvent event) throws IOException {
		
		
		if (capacity.getText() == "" || source.getText() == "" || dest.getText() == "" || planetype.getText() == "" ||  date.getText() == "" ||  depart.getText() == "" || arrival.getText() == "" || price.getText() == "") {
			
		    incomplete.setText("Fill all entries");	
		}
		else {
			
			int fid = 0;
			for (int i = 0; i < ARS.getInstance().Flight_list.size(); i++) {

				fid = ARS.getInstance().Flight_list.get(i).getFlightID();
			}

			fid = fid + 1;
			ARS.getInstance().AddFlight(fid, Integer.parseInt(capacity.getText()), source.getText(), dest.getText(),
					planetype.getText(), date.getText(), depart.getText(), arrival.getText(), price.getText());
			
			root = FXMLLoader.load(getClass().getResource("adminflights.fxml"));
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}

	public void switchToHome(MouseEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("adminMenu.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void logout(MouseEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("login.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void about(MouseEvent event) throws IOException {
        
		tempStatic.back = "Addflight.fxml";
		root = FXMLLoader.load(getClass().getResource("about.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void contact(MouseEvent event) throws IOException {
        
		tempStatic.back = "Addflight.fxml";
		root = FXMLLoader.load(getClass().getResource("contact.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
