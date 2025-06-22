package inter7;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewtest extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		ListView<String> lv = new ListView<>();
		lv.getItems().addAll("jumanjiu","ghjt","gds","wggv");
		lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);;
		
		VBox vb = new VBox(10);
		Button button = new Button("submit");
button.setOnAction(t -> {
	
	ONClick(lv);
} );
		vb.setPadding(new Insets(20,20,20,20));
		vb.getChildren().addAll(lv,button);
		
			Scene scene = new Scene(vb,400,210);
			stage.setScene(scene);
			stage.show();
	}

	private void ONClick(ListView<String> lv) {
		String message = "";
		ObservableList<String> movie = lv.getSelectionModel().getSelectedItems();
		for (String string : movie) {
			message+= string+"\n";
		}
		System.out.println(message);
	}


}
