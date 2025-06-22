package inter7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Borderpanetest extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage stage) throws Exception {
		
	
	HBox Ontop = new HBox();
	
	Button file = new Button("File");
	Button edit = new Button("Edit");
	Button View = new Button("View");
	
	
	Ontop.getChildren().addAll(file,edit,View);
	
	VBox leftmenu = new VBox();
	
	Button file2 = new Button("File2");
	Button edit2 = new Button("Edit2");
	Button View2 = new Button("View2");
	leftmenu.getChildren().addAll(file2,edit2,View2);
	
	BorderPane bp = new BorderPane();
	bp.setTop(Ontop);
	bp.setLeft(leftmenu);
	
	Scene scene = new Scene(bp,400,300);
		stage.setScene(scene);
		stage.show();
	}

}
