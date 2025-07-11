package inter7;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
	 	
		Label Result = new Label("Result");
		GridPane.setConstraints(Result, 0, 3);
		TextField resulttestfield = new TextField();
		GridPane.setConstraints(resulttestfield, 1, 3);
		
		javafx.scene.control.Label namelabel = new javafx.scene.control.Label("Firstnumber");
		GridPane.setConstraints(namelabel, 0, 0);
		
		TextField firstNumberTextfield = new TextField("0");
		firstNumberTextfield.setOnAction(g ->{
			
			Integer.parseInt(firstNumberTextfield.getText());
		} );
		
		
		GridPane.setConstraints(firstNumberTextfield, 1, 0);
		
		javafx.scene.control.Label passlabel = new javafx.scene.control.Label("Secondnumber");
		GridPane.setConstraints(passlabel, 0, 1);
		
		TextField SeconNumberTextfield = new TextField("0");
		SeconNumberTextfield.setOnAction(q ->{
			Integer.parseInt(SeconNumberTextfield.getText());
			
		} );
		//passinput.setPromptText("passwort");
		GridPane.setConstraints(SeconNumberTextfield, 1, 1);
	
		
		Button Addbutton = new Button("Add");
		Addbutton.setOnAction(t ->{
			int first = Integer.parseInt(firstNumberTextfield.getText());
			int second = Integer.parseInt(SeconNumberTextfield.getText());
			int Additions = first+second;
			resulttestfield.setText(String.valueOf(Additions));
			
		} );
		GridPane.setConstraints(Addbutton, 0, 2);
		Button SubtractButton = new Button("Subtract");
		SubtractButton.setOnAction(d ->{
			int first = Integer.parseInt(firstNumberTextfield.getText());
			int second = Integer.parseInt(SeconNumberTextfield.getText());
			int Subtractions = first-second;
			resulttestfield.setText(String.valueOf(Subtractions));
		} );
		GridPane.setConstraints(SubtractButton, 1, 2);
Button DivideButton = new Button("Divide");
DivideButton.setOnAction(l ->{
	int first = Integer.parseInt(firstNumberTextfield.getText());
	int second = Integer.parseInt(SeconNumberTextfield.getText());
	int Subtractions = first/second;
	resulttestfield.setText(String.valueOf(Subtractions));

	//if (first==Integer.parseInt(firstNumberTextfield.getText()) && second==0) ;
	
} );
GridPane.setConstraints(DivideButton, 2,2);







gp.getChildren().addAll(namelabel,firstNumberTextfield,passlabel,SeconNumberTextfield,Addbutton,SubtractButton,DivideButton,Result,resulttestfield);
		Scene scene = new Scene(gp,400,300);
		scene.getStylesheets().add("Gridpanecss.css");
		stage.setScene(scene);
		stage.show();		
	}

}
