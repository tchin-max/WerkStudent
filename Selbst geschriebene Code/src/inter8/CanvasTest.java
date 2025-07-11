package inter8;

import java.awt.Color;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CanvasTest extends Application{
public static void main(String[] args) {
	launch(args);
}
	@Override
	public void start(Stage stage) throws Exception {
		Canvas canvas = new Canvas(800,500);
		GraphicsContext gc = canvas.getGraphicsContext2D();
//		gc.setFill(javafx.scene.paint.Color.LIGHTBLUE);
//		gc.fillRect(0, 0, 400, 300);;
//		gc.setStroke(javafx.scene.paint.Color.ORANGE);
//		gc.strokeLine(0, 0, 400, 300);
		
		Rectangle rec = new Rectangle(500,500);
		
		rec.setStroke(javafx.scene.paint.Color.ORANGE);
rec.setStrokeWidth(8);
rec.setFill(javafx.scene.paint.Color.WHITE);

VBox vb = new VBox();
Menu file = new Menu("File");
file.getItems().add(new MenuItem("save"));
MenuItem quit = new MenuItem("quit");
quit.setOnAction(f ->{
	
	stage.close();
} );
file.getItems().add(quit);
MenuBar mb = new MenuBar();
mb.getMenus().add(file);
vb.getChildren().addAll(mb);

	BorderPane bp = new BorderPane();
	bp.setCenter(rec);
	bp.setTop(vb);
	Scene scene = new Scene(bp);
		stage.setScene(scene);
		stage.show();
	}

}
