package inter6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Alertbox extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root,200,200);
		
		Button buttom = new Button("click");
	buttom.setOnAction(e ->{ 	boolean b = confirmBox.display("title of win", "areyoudone?");
	System.out.println(b);
	
	});
		root.getChildren().add(buttom);
		
		stage.setScene(scene);

		stage.show();

	}

}
