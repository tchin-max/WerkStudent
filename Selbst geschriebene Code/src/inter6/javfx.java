package inter6;


import java.awt.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class javfx extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Stage stage2 = new Stage();
		Label label = new Label("");
		stage2.show();
BorderPane root = new BorderPane();
//root.setTop(new Label("top"));
//root.setBottom(new Label("bottom"));
//root.setLeft(new Label("left"));
//root.setRight(new Label("rigth"));

StackPane sp = new StackPane();
Button btn  = new Button("button1");


VBox vb = new VBox();
Button exit = new Button("exit");
exit.setOnAction( e->{System.exit(0);} );

btn.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent ea) {
		System.out.println("hollo w");
	}
});



vb.getChildren().addAll(btn,exit);
Scene scene = new Scene(vb,200,150);
stage.setScene(scene);
//stage.show();
		
	}



}
