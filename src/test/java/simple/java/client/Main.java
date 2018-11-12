package simple.java.client;
/**
 * 
 */

import java.io.File;

import org.apache.log4j.Logger;

/**
 * @author 584326
 *
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class Main extends Application implements EventHandler<ActionEvent>{
	final static Logger logger = Logger.getLogger(Main.class);

	/**
	 * @param args
	 */
	BtnLogin btnLogin;
	BtnExit btnExit;
	Scene scene;
	Stage primaryStage;
	int dialogReturnValue;
	boolean autoRestartOption = false;
	boolean executionStatus;
	TextField txtFieldUserId ;
	TextField txtFieldPassword ;
	Label lblResults;
	Label lblUserId;
	Label lblPassword;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		logger.info("this is start of start method");
		primaryStage.setTitle("");
		
		this.primaryStage = primaryStage;
		
		lblUserId = new Label("UserId:");
		lblUserId.setLayoutX(60);
		lblUserId.setLayoutY(40);
		
		lblPassword = new Label("Password:");
		lblPassword.setLayoutX(60);
		lblPassword.setLayoutY(100);
		
		txtFieldUserId = new TextField();
		txtFieldUserId.setText("UserId");
		txtFieldUserId.setPrefColumnCount(20);
		
		txtFieldUserId.setLayoutX(60);
		txtFieldUserId.setLayoutY(60);
		txtFieldUserId.setOnAction(this);
		
		txtFieldPassword = new TextField();
		txtFieldPassword.setText("Password:");
		txtFieldPassword.setPrefColumnCount(20);
		
		txtFieldPassword.setLayoutX(60);
		txtFieldPassword.setLayoutY(120);
		txtFieldPassword.setOnAction(this);
 		

		lblResults = new Label("Results will come Here");
		lblResults.setLayoutX(60);
		lblResults.setLayoutY(220);
		
		btnLogin = new BtnLogin();
		btnLogin.setText("Login");
		btnLogin.setLayoutX(100);
		btnLogin.setLayoutY(175);
		btnLogin.setOnAction(this);
			
		btnExit = new BtnExit();
		btnExit.setText("Exit");
		btnExit.setLayoutX(175);
		btnExit.setLayoutY(175);
		btnExit.setOnAction(this);
			
		Pane layout = new Pane();
		layout.getChildren().add(btnLogin);
		layout.getChildren().add(txtFieldPassword);
		layout.getChildren().add(btnExit);
		layout.getChildren().add(lblUserId);
		layout.getChildren().add(txtFieldUserId);
		layout.getChildren().add(lblPassword);
		layout.getChildren().add(lblResults);
		
		scene = new Scene(layout,300,300);
		
		primaryStage.setTitle("Simple Java Client");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public void handle(ActionEvent event) {
		
		String whichButton = ((Button)event.getSource()).getText();
		
		switch (whichButton) {
		case "Login":{
			
			}				
		
			break;
			
		case "Exit":
			logger.info("Exit button was clicked");
			this.primaryStage.close();
			
			
			break;
		}
	}
}
