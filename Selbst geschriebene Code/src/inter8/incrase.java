package inter8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class incrase extends Application {
public static void main(String[] args) {
	launch(args);
}

@Override
public void start(Stage stage) throws Exception {

	VBox vb = new VBox(10);
	GridPane gp = new GridPane();
	gp.setAlignment(Pos.CENTER);
	gp.setPadding(new Insets(20,20,20,20));
	gp.setHgap(10);
	gp.setVgap(10);
	
	Label label = new Label("current value:");
	GridPane.setConstraints(label, 0, 0);
	TextField tf = new TextField("0");
	tf.setOnAction(f ->{
		
		Integer.parseInt(tf.getText());
	} );
	GridPane.setConstraints(tf, 1, 0);
	tf.setEditable(false);
	
	Button btn = new Button("click");
	
	GridPane.setConstraints(btn, 1, 3);
	btn.setOnAction(t -> {
		 int count = Integer.parseInt(tf.getText());
		 
		count++;
		tf.setText(String.valueOf(count));
	} );
	
	Button btn2 = new Button("decrease");
	btn2.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent eh) {
int count2 = Integer.parseInt(tf.getText())	;
count2--;
tf.setText(String.valueOf(count2));
		}
	});
GridPane.setConstraints(btn2, 1, 4);	
	gp.getChildren().addAll(label,tf,btn,btn2);
	
	
	
	vb.setPadding(new Insets(20,20,20,20));
	//vb.getChildren().add(btn);
	Scene scene = new Scene(gp,300,200);
	stage.setScene(scene);
	stage.show();
	
}
}
