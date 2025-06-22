package inter6;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class confirmBox {
	static boolean anwer;


	
	public static boolean display(String title, String message) {
		Stage win = new Stage();
		
		win.initModality(Modality.APPLICATION_MODAL);
		win.setTitle(title);
		win.setMinWidth(250);
		
		javafx.scene.control.Label label = new javafx.scene.control.Label();
		label.setText(message);
		

		Button yesbtn = new Button("yes");
		Button nobtn = new Button("no");
		
		yesbtn.setOnAction(w -> {
			
			 //anwer = true;
			 System.exit(0);
			
		} );
		
		nobtn.setOnAction(e ->{
			
			//anwer= false;
			win.close();
			
			
		} );
		VBox vb = new VBox(10);
		vb.getChildren().addAll(label,yesbtn,nobtn);
		vb.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vb);
		win.setScene(scene);
		win.showAndWait();
		return anwer;

}}
