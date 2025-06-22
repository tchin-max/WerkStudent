package inter6;

import java.awt.Label;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class alertboxtest {
public static void display(String title, String message) {
	Stage win = new Stage();
	
	win.initModality(Modality.APPLICATION_MODAL);
	win.setTitle(title);
	win.setMinWidth(250);
	
	javafx.scene.control.Label label = new javafx.scene.control.Label();
	label.setText(message);
	
	Button button = new Button("exit");
	button.setOnAction(e -> win.close() );
	Tooltip tt = new Tooltip("clivk here");
	button.setTooltip(tt);
	
	VBox vb = new VBox(10);
	vb.getChildren().addAll(button,label);
	vb.setAlignment(Pos.CENTER);
	
	Scene scene = new Scene(vb);
	win.setScene(scene);
	win.showAndWait();
}
}
