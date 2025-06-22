package inter7;

import inter6.confirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CloseProgram extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage stage) throws Exception {
		stage.setOnCloseRequest(d -> closeProgramme() );
		
		StackPane root = new StackPane();
		Button button = new Button("click");
		button.setOnAction(e -> {closeProgramme();
		stage.close();
		});
		
		root.getChildren().addAll(button);
		Scene sccene = new Scene(root,300,100);
		stage.setScene(sccene);
		stage.setTitle("yo my g");
		stage.show();
	}
	public static  void closeProgramme() {
		//System.out.println("File is saved");
		  boolean answer= confirmBox.display("title", "sure exit?");
	

		
		
		
	}
	
}
