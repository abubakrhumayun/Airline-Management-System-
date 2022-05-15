package UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import application.*;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Login extends Application implements Runnable, Initializable {

	private Stage stage;
	private Scene scene;
	private Parent root;
	double x = 0, y = 0;

	@FXML
	private Text invetory = new Text();
	@FXML
	private Text management = new Text();
	@FXML
	private Text system = new Text();
	@FXML
	private Text noAccount = new Text();
	@FXML
	private Text noAccount1 = new Text();
	@FXML
	private Text log = new Text();
	@FXML
	private Button signup = new Button();
	@FXML
	private Button login = new Button();
	@FXML
	private TextField username = new TextField();
	@FXML
	private PasswordField password = new PasswordField();
	@FXML
	private Text Address = new Text();;
	@FXML
	private Text management1 = new Text();;
	@FXML
	private Text system1 = new Text();;
	@FXML
	private Text sign = new Text();;
	@FXML
	private Button signup2 = new Button();
	@FXML
	private Button login2 = new Button();
	@FXML
	private ImageView image = new ImageView();;
	@FXML
	private ImageView img = new ImageView();;
	@FXML
	private ImageView img1 = new ImageView();;
	@FXML
	private ImageView use = new ImageView();;
	@FXML
	private ImageView pass = new ImageView();;
	@FXML
	private ImageView image1 = new ImageView();;
	@FXML
	private ImageView use1 = new ImageView();;
	@FXML
	private ImageView pass1 = new ImageView();;
	@FXML
	private TextField username1 = new TextField();;
	@FXML
	private TextField password1 = new TextField();;
	@FXML
	private TextField address = new TextField();;
	@FXML
	private ImageView emailicon = new ImageView();
	@FXML
	private AnchorPane layer1 = new AnchorPane();
	@FXML
	private AnchorPane layer2 = new AnchorPane();
	@FXML
	private Label wrongpass = new Label();
	@FXML
	private Label create = new Label();
	@FXML
	private Text name = new Text();;
	@FXML
	private Text gender = new Text();;
	@FXML
	private Text age = new Text();;
	@FXML
	private Text phone = new Text();;
	@FXML
	private Text usern = new Text();;
	@FXML
	private Text passn = new Text();;
	@FXML
	private TextField name1 = new TextField();;
	@FXML
	private TextField age1 = new TextField();;
	@FXML
	private TextField phone1 = new TextField();;
	@FXML
	private Text additionaltext = new Text();;

	@FXML
	ChoiceBox<String> choicebox = new ChoiceBox<>();
	String[] disc = { "Male", "Female", "Other" };

	String Username;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		choicebox.getItems().addAll(disc);
		invetory.setVisible(true);
		management.setVisible(true);
		system.setVisible(true);
		noAccount.setVisible(true);
		log.setVisible(true);
		signup.setVisible(true);
		login.setVisible(true);
		image.setVisible(true);
		use.setVisible(true);
		pass.setVisible(true);
		additionaltext.setVisible(true);
		username.setVisible(true);
		password.setVisible(true);
		create.setVisible(false);
		management1.setVisible(false);
		system1.setVisible(false);
		login2.setVisible(false);
		image1.setVisible(false);
		use1.setVisible(false);
		pass1.setVisible(false);
		username1.setVisible(false);
		password1.setVisible(false);
		Address.setVisible(false);
		address.setVisible(false);
		emailicon.setVisible(false);
		noAccount1.setVisible(false);
		sign.setVisible(false);
		signup2.setVisible(false);
		wrongpass.setVisible(true);
		name.setVisible(false);
		age.setVisible(false);
		phone.setVisible(false);
		usern.setVisible(false);
		passn.setVisible(false);
		name1.setVisible(false);
		age1.setVisible(false);
		phone1.setVisible(false);
		choicebox.setVisible(false);
		gender.setVisible(false);
	}

	@FXML
	private void signupbutton(MouseEvent event) {

		TranslateTransition slide = new TranslateTransition();
		slide.setDuration(Duration.seconds(0.7));
		slide.setNode(layer1);

		slide.setToX(231);
		slide.play();

		layer2.setTranslateX(-850);
		
		choicebox.getItems().addAll(disc);
		choicebox.setOnMouseClicked(arg0 -> {
			try {
				signup(arg0);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		// choicebox.setOnAction(this::dispfinal);

		invetory.setVisible(false);
		management.setVisible(false);
		system.setVisible(false);
		noAccount.setVisible(false);
		log.setVisible(false);
		signup.setVisible(false);
		login.setVisible(false);
		image.setVisible(false);
		use.setVisible(false);
		pass.setVisible(false);
		username.setVisible(false);
		password.setVisible(false);
		wrongpass.setVisible(false);
		additionaltext.setVisible(false);

		Address.setVisible(true);
		address.setVisible(true);
		create.setVisible(true);
		img.setVisible(true);
		management1.setVisible(true);
		system1.setVisible(true);
		login2.setVisible(true);
		image1.setVisible(true);
		use1.setVisible(true);
		pass1.setVisible(true);
		username1.setVisible(true);
		password1.setVisible(true);
		emailicon.setVisible(true);
		noAccount1.setVisible(true);
		sign.setVisible(true);
		signup2.setVisible(true);
		name.setVisible(true);
		age.setVisible(true);
		phone.setVisible(true);
		usern.setVisible(true);
		passn.setVisible(true);
		name1.setVisible(true);
		age1.setVisible(true);
		phone1.setVisible(true);
		choicebox.setVisible(true);
		gender.setVisible(true);

		username.setText("");
		password.setText("");
		wrongpass.setText("");

		slide.setOnFinished((e -> {

		}));
	}

	@FXML
	private void loginbutton(MouseEvent event) {

		TranslateTransition slide = new TranslateTransition();
		slide.setDuration(Duration.seconds(0.7));
		slide.setNode(layer1);

		slide.setToX(0);
		slide.play();

		layer2.setTranslateX(0);
		invetory.setVisible(true);
		management.setVisible(true);
		system.setVisible(true);
		noAccount.setVisible(true);
		log.setVisible(true);
		signup.setVisible(true);
		login.setVisible(true);
		image.setVisible(true);
		use.setVisible(true);
		pass.setVisible(true);
		username.setVisible(true);
		password.setVisible(true);
		img.setVisible(true);
		wrongpass.setVisible(true);
		additionaltext.setVisible(true);

		create.setVisible(false);
		Address.setVisible(false);
		address.setVisible(false);
		management1.setVisible(false);
		system1.setVisible(false);
		login2.setVisible(false);
		image1.setVisible(false);
		use1.setVisible(false);
		pass1.setVisible(false);
		username1.setVisible(false);
		password1.setVisible(false);
		emailicon.setVisible(false);
		noAccount1.setVisible(false);
		sign.setVisible(false);
		signup2.setVisible(false);
		name.setVisible(false);
		age.setVisible(false);
		phone.setVisible(false);
		usern.setVisible(false);
		passn.setVisible(false);
		name1.setVisible(false);
		age1.setVisible(false);
		phone1.setVisible(false);
		choicebox.setVisible(false);
		gender.setVisible(false);

		slide.setOnFinished((e -> {

		}));
	}

	public void CheckLogin(MouseEvent event) throws IOException {

		// Customer login
		for (int i = 0; i < ARS.getInstance().Customer_list.size(); i++) {

			if (ARS.getInstance().Customer_list.get(i).getUsername().equals(username.getText())
					&& password.getText().equals(ARS.getInstance().Customer_list.get(i).getPassword())) {
				tempStatic.LoginID = ARS.getInstance().Customer_list.get(i).getCustomer_ID();
				root = FXMLLoader.load(getClass().getResource("Home.fxml"));
				stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			}

		}

		for (int i = 0; i < ARS.getInstance().Customer_list.size(); i++) {

			if (!ARS.getInstance().Customer_list.get(i).getUsername().equals(username.getText())
					|| !password.getText().equals(ARS.getInstance().Customer_list.get(i).getPassword())) {
				wrongpass.setText("Username or Password Incorrect");
			}
		}

		// Admin login

		for (int i = 0; i < ARS.getInstance().Admin_list.size(); i++) {

			if (ARS.getInstance().Admin_list.get(i).getUsername().equals(username.getText())
					&& password.getText().equals(ARS.getInstance().Admin_list.get(i).getPassword())) {
				
				tempStatic.LoginID = ARS.getInstance().Admin_list.get(i).getAdmin_ID();
				root = FXMLLoader.load(getClass().getResource("adminMenu.fxml"));
				stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			}
		}
		
		for (int i = 0; i < ARS.getInstance().Admin_list.size(); i++) {

			if (!ARS.getInstance().Admin_list.get(i).getUsername().equals(username.getText()) || !password.getText().equals(ARS.getInstance().Admin_list.get(i).getPassword())) {
				wrongpass.setText("Username or Password Incorrect");
			}
		}

		// FDO login
		for (int i = 0; i < ARS.getInstance().FDO_list.size(); i++) {
		   
			if (ARS.getInstance().FDO_list.get(i).getUsername().equals(username.getText())
				&& password.getText().equals(ARS.getInstance().FDO_list.get(i).getPassword())) {
				
			tempStatic.LoginID = ARS.getInstance().FDO_list.get(i).getFDO_ID();
			root = FXMLLoader.load(getClass().getResource("FDOmenu.fxml"));
			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		  }
		}
		
		for (int i = 0; i < ARS.getInstance().FDO_list.size(); i++) {
			   
			if (!ARS.getInstance().FDO_list.get(i).getUsername().equals(username.getText())
				|| !password.getText().equals(ARS.getInstance().FDO_list.get(i).getPassword())) {
				wrongpass.setText("Username or Password Incorrect");
		  }
		}

	}

	// ---------------------------------------Sign
	// Up------------------------------------------

	public void signup(MouseEvent event) throws IOException {
       
		String name = name1.getText();
		String Address = address.getText();
		String age = age1.getText();
		String number = phone1.getText();
		String user = username1.getText();
		String pass = password1.getText();
		String choice = choicebox.getValue();
		
		Pattern pattern = Pattern.compile(".*[a-zA-Z]+.*");
	    Matcher matcher = pattern.matcher(number);
	    
	    Pattern patt = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
	    Matcher match = patt.matcher(number);
	    
	    Pattern p = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
	    Matcher m = p.matcher(number);
		
		if(name == "" || Address == "" || age == "" || number == "" || user == "" || pass == "" || choice == "") {
			
			create.setText("Please fill all entries.");

		}
		
		else if(pass.length() < 4) {
			
			create.setText("Password lenght cannot be less than 4 ");
		}
        else if(pass.length() > 15) {
			
			create.setText("Password lenght too long");
		}
        else if(number.length() > 11 || number.length() < 11) {
			
			create.setText("Number should be 11 digits");
		}
        else if (matcher.matches()) {
             
        	create.setText("Number should be only digits");
        }
        else if (match.matches()) {
            
        	create.setText("Number should be only digits");
        }
        else if (Integer.parseInt(age) < 14 || Integer.parseInt(age) > 90) {
        	
        	create.setText("Age should be between 14-90");
        }
        else if (Integer.parseInt(age) < 14 || Integer.parseInt(age) > 90) {
        	
        	create.setText("Age should be between 14-90");
        }
        else if (m.matches()) {
        	
        	create.setText("Name must contain alphabets");
        	
        }
		
		else {
			
			int cid = 0;
			for (int i = 0; i < ARS.getInstance().Customer_list.size(); i++) {

				cid = ARS.getInstance().Customer_list.get(i).getCustomer_ID();
			}

			cid = cid + 1;
			ARS.getInstance().AddCustomer(name, Address, choice, number, user, pass, Integer.parseInt(age), cid);
			create.setText("Account Successfully created! Please login");
		}
		
	}
    

	
	@SuppressWarnings("exports")
	@Override
	public void start(Stage primaryStage) throws Exception {
		stage = new Stage();
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("start1.fxml"));
			Parent root = fxmlLoader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {

		launch();
	}

}
