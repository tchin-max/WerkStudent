package inter6;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class switchstage extends Application {
	
public static void main(String[] args) {
	launch(args);
}

@Override
public void start(Stage stage) throws Exception {
	Stage stage2 = stage;
	VBox vb2 = new VBox(20);

	Scene scene2 = new Scene(vb2,600,300) ;

	Button bnt2 = new Button("switch to scene2"); 
	Label label1 = new Label("Welcome to scene1"); 
	vb2.getChildren().addAll(bnt2,label1);

	stage2.setScene(scene2);
	stage2.setTitle("this is scen2");
	
	
	Label label2 = new Label("welcome to scene2");
	Button bnt1 = new Button("switch to scene 2"); 
	
	bnt1.setOnAction(e -> stage.setScene(scene2));
	VBox vb1 = new VBox(20);
	vb1.getChildren().addAll(label2,bnt1);
	Scene scene1 = new Scene(vb1,200,100);
	bnt2.setOnAction(d -> stage2.setScene(scene1) );

	
	bnt1.setOnAction(e -> stage.setScene(scene1));

	stage2.show();
	
}
}
