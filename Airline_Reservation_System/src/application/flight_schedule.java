package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.Duration;

public class flight_schedule implements Initializable{
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	 @FXML
		TableView<Flight> tableView = new TableView<Flight>();
		@FXML
		TableColumn<Flight, Integer> FlightID = new TableColumn<>();
		@FXML
		TableColumn<Flight, Integer> capacity = new TableColumn<>();
		@FXML
		TableColumn<Flight, String> Plane_Type = new TableColumn<>();
		@FXML
		TableColumn<Flight, String> Source = new TableColumn<>();
		@FXML
		TableColumn<Flight, String> Destination = new TableColumn<>();
		@FXML
		TableColumn<Flight, String> Flight_Date = new TableColumn<>();
		@FXML
		TableColumn<Flight, String> Departure_Time = new TableColumn<>();
		@FXML
		TableColumn<Flight, String> Arrival_Time = new TableColumn<>();

		@FXML
		TextField rem = new TextField();


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

     
		FlightID.setCellValueFactory(new PropertyValueFactory<>("FlightID"));
		capacity.setCellValueFactory(new PropertyValueFactory<>("capacity"));
		Plane_Type.setCellValueFactory(new PropertyValueFactory<>("Plane_Type"));
		Source.setCellValueFactory(new PropertyValueFactory<>("Source"));
		Destination.setCellValueFactory(new PropertyValueFactory<>("Destination"));
		Flight_Date.setCellValueFactory(new PropertyValueFactory<>("Flight_Date"));
		Departure_Time.setCellValueFactory(new PropertyValueFactory<>("Departure_Time"));
		Arrival_Time.setCellValueFactory(new PropertyValueFactory<>("Arrival_Time"));
		
		tableView.getColumns().clear();
		tableView.getColumns().add(FlightID);
		tableView.getColumns().add(capacity);
		tableView.getColumns().add(Plane_Type);
		tableView.getColumns().add(Source);
		tableView.getColumns().add(Destination);
		tableView.getColumns().add(Flight_Date);
		tableView.getColumns().add(Departure_Time);
		tableView.getColumns().add(Arrival_Time);
		addButtonToTable();
		
		for(int i = 0; i < ARS.getInstance().Flight_list.size(); i++)
		{
			String[] stringarray = ARS.getInstance().Flight_list.get(i).displayFlights().split("\n");
			for (int j = 0; j < stringarray.length; j++) {
				
					String[] tokens = stringarray[j].split(",");
					tableView.getItems().add(new Flight(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]),tokens[2], tokens[3], tokens[4],tokens[5],tokens[6],tokens[7]));
				}
			}
		}
	
	private void addButtonToTable() {
		
	
        TableColumn<Flight, Void> colBtn = new TableColumn("Button");

        Callback<TableColumn<Flight, Void>, TableCell<Flight, Void>> cellFactory = new Callback<TableColumn<Flight, Void>, TableCell<Flight, Void>>() {
        	
            @Override
            public TableCell<Flight, Void> call(final TableColumn<Flight, Void> param) {
                final TableCell<Flight, Void> cell = new TableCell<Flight, Void>() {

                    private final Button btn = new Button("Book");

                    {
                    	
                        btn.setOnAction((ActionEvent event) -> {
                        	try {
                        		
								/*
								 * for (int i = 0; i < tableView.getItems().size(); i++) { if
								 * (tableView.getItems().get(i).getFlightID() == 22) {
								 * System.out.println("Selected Index : "+i); } }
								 */
                        		
                        		String a=tableView.getColumns().get(4).getCellObservableValue(0).getValue().toString(); 
                        		System.out.print(a);
                        		
								root = FXMLLoader.load(getClass().getResource("Home.fxml"));
								stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	                    		scene = new Scene(root);
	                    		stage.setScene(scene);
	                    		stage.show();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                    		
                        });
                    }

                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                        	
                            setGraphic(btn);
                            colBtn.setStyle("-fx-background-color:black");
                            btn.setStyle("-fx-background-color: #2ac451");
                            btn.setStyle("-fx-text-fill: #000000");
                        }
                    }
                };
               // System.out.println("hello");
                return cell;
            }
            
        };

        colBtn.setCellFactory(cellFactory);

        tableView.getColumns().add(colBtn);
	}

	
	public void switchToHome(MouseEvent event) throws IOException {

		root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
