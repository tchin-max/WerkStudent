package inter8;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calcule extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(20));
		gp.setVgap(10);
		gp.setHgap(10);
		
		Label ResultLabel = new Label("Result:");
		GridPane.setConstraints(ResultLabel, 0, 3);
		
		TextField Resultfield = new TextField();
		GridPane.setConstraints(Resultfield, 1, 3);
		
		Label FirstnumberLabel = new Label("FirstNumber:");
		GridPane.setConstraints(FirstnumberLabel, 0, 0);
		
		TextField FirstnumbertTextfield = new TextField("0");
		FirstnumbertTextfield.setOnAction(t ->{
			Integer.parseInt(FirstnumbertTextfield.getText());
		} );
		GridPane.setConstraints(FirstnumbertTextfield, 1, 0);
		
		Label SecondnumberLabel = new Label("SecondNumber:");
		GridPane.setConstraints(SecondnumberLabel, 0, 1);
		
		TextField SecondnumbertTextfield = new TextField("0");
		SecondnumbertTextfield.setOnAction(k ->{
			Integer.parseInt(SecondnumbertTextfield.getText());

		} );
		GridPane.setConstraints(SecondnumbertTextfield, 1, 1);
		
		Button AddButton = new Button("Add");
		AddButton.setOnAction(l ->{
			int first = Integer.parseInt(FirstnumbertTextfield.getText());
			int second = Integer.parseInt(SecondnumbertTextfield.getText());
			int Result = first+second;
			Resultfield.setText(String.valueOf(Result));

		} );
		GridPane.setConstraints(AddButton,0,2);
		
		Button SubtractButton = new Button("Subtract");
		GridPane.setConstraints(SubtractButton,1,2);
		
		Button DivideButton = new Button("Divide");
		GridPane.setConstraints(DivideButton,3,2);
		
		Button MultiplieButton = new Button("Multiply");
		GridPane.setConstraints(MultiplieButton,4,2);
		
		
		
		


		gp.getChildren().addAll(FirstnumberLabel,FirstnumbertTextfield,SecondnumberLabel,SecondnumbertTextfield,AddButton,SubtractButton,DivideButton,MultiplieButton,ResultLabel,Resultfield);
		Scene scene = new Scene(gp,400,250);
		stage.setScene(scene);
		stage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}

}
