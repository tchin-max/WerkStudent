package inter7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class checkbox extends Application {
public static void main(String[] args) {
	launch(args);
}

@Override
public void start(Stage stage) throws Exception {
CheckBox cb1 = new CheckBox("Bacon");
CheckBox cb2 = new CheckBox("Tacos");	
cb2.setSelected(true);

Button button = new Button("order!");
button.setOnAction(t -> handleOption(cb1, cb2) );
VBox vb = new VBox(10);
vb.setPadding(new Insets(20,20,20,20));
vb.getChildren().addAll(cb1,cb2,button);
	Scene scene = new Scene(vb,400,210);
	stage.setScene(scene);
	stage.show();
}
private void handleOption(CheckBox box1 , CheckBox box2 ) {
	String message = "User order:\n";
	if (box1.isSelected()) 
		System.out.print("User order: "+box1);
		//message+="Bacon\n";
		
	
	if (box2.isSelected()) 
		
		//message+= "Tacos\n";
		System.out.print("User order: "+box2);


}
}
