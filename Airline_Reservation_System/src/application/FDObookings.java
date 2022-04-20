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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FDObookings implements Initializable {

	@FXML
	private Rectangle box;
	@FXML
	private ImageView image;
	@FXML
	private Text txt;

	@FXML
	private TextField rem;
	@FXML
	private Label invalid;

	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	TableView<Booking> tableView = new TableView<Booking>();
	@FXML
	TableColumn<Booking, Integer> Booking_ID = new TableColumn<>();
	@FXML
	TableColumn<Booking, Integer> Customer_ID = new TableColumn<>();
	@FXML
	TableColumn<Booking, Integer> Flight_ID = new TableColumn<>();
	@FXML
	TableColumn<Booking, Integer> Num_Seats = new TableColumn<>();
	
	
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		Booking_ID.setCellValueFactory(new PropertyValueFactory<>("Booking_ID"));
		Customer_ID.setCellValueFactory(new PropertyValueFactory<>("Customer_ID"));
		Flight_ID.setCellValueFactory(new PropertyValueFactory<>("Flight_ID"));
		Num_Seats.setCellValueFactory(new PropertyValueFactory<>("Num_Seats"));

		tableView.getColumns().clear();
		tableView.getColumns().add(Booking_ID);
		tableView.getColumns().add(Customer_ID);
		tableView.getColumns().add(Flight_ID);
		tableView.getColumns().add(Num_Seats);
		for (int i = 0; i < ARS.getInstance().Booking_list.size(); i++) {
			String[] stringarray = ARS.getInstance().Booking_list.get(i).string_Booking().split("\n");
			for (int j = 0; j < stringarray.length; j++) {

				String[] tokens = stringarray[j].split(",");
					tableView.getItems().add(new Booking(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]),
							Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3])));
				
			}
		}
	}

	public void switchToHome(MouseEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("FDOmenu.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	

}