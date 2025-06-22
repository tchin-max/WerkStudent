package inter7;

import org.hamcrest.core.Is;
import org.junit.platform.engine.support.descriptor.DirectorySource;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Extrak_Valid extends Application {
public static void main(String[] args) {
	launch(args);
}

@Override
public void start(Stage stage) throws Exception {
	VBox vb = new VBox(10);
	TextField tf = new TextField();
	Button bnt = new Button("click");
	bnt.setOnAction(t -> isint(tf, tf.getText()) );

	vb.setPadding(new Insets(20,20,20,20));

	vb.getChildren().addAll(tf,bnt);
	
	
	Scene scene = new Scene(vb,400,200);
	stage.setScene(scene);
	stage.show();
}
private boolean isint(TextField text,String message) {
	try {
		int age = Integer.parseInt(text.getText());
		System.out.println("User ist :"+ age);
		return true;
	} catch (Exception e) {
		System.out.println("Eror " + "["+message +"]"+ " is not a number ");
	}
	return false;
	}
}
