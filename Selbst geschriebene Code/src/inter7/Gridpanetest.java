package inter7;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Gridpanetest extends Application {
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage stage) throws Exception {
		
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(10,10,10,10));
		gp.setVgap(0);
		gp.setHgap(10);
	 	
		javafx.scene.control.Label namelabel = new javafx.scene.control.Label("Username");
		GridPane.setConstraints(namelabel, 0, 0);
		
		TextField nameinput = new TextField("enter the password");
		
		GridPane.setConstraints(nameinput, 1, 0);
		
		javafx.scene.control.Label passlabel = new javafx.scene.control.Label("Passwort");
		GridPane.setConstraints(passlabel, 0, 1);
		
		TextField passinput = new TextField();
		passinput.setPromptText("passwort");
		GridPane.setConstraints(passinput, 1, 1);
		
		Button loginbutton = new Button("login");
		
		
		
		GridPane.setConstraints(loginbutton, 1, 2);
		gp.getChildren().addAll(namelabel,nameinput,passinput,loginbutton,passlabel);
		Scene scene = new Scene(gp,400,300);
		scene.getStylesheets().add("Gridpanecss.css");
		stage.setScene(scene);
		stage.show();		
	}

}
