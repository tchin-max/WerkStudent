package inter7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class choiceboxtest extends Application {

	public static void main(String[] args) {
launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		ComboBox<String> combobox = new ComboBox<>();
		combobox.getItems().addAll("koki","ndole","eru","plantain","atchu","nkui","komkom");
		combobox.setPromptText("Favorite Food?");
		combobox.setEditable(true);
		
		
//		ChoiceBox<String> cb = new ChoiceBox<>();
//		cb.getItems().add("Apple");
//		cb.getItems().addAll("gogo","coco");
//		cb.getItems().add("banana");
//
//		cb.setValue("Apple");
		Button button = new Button("click");
		//button.setOnAction(t -> getchoicemovie(combobox) );
		
		//cb.getSelectionModel().selectedItemProperty().addListener((v, old, neu) -> System.out.println(neu));
		
		combobox.setOnAction(t -> System.out.println( "User selected: "+ combobox.getValue()));
		
		VBox vb = new VBox(10);
		vb.setPadding(new Insets(20,20,20,20));
			Scene scene = new Scene(vb,400,210);
			vb.getChildren().addAll(combobox,button);
			stage.setScene(scene);
			stage.show();
		
	}
//	private void getchoice(	ChoiceBox<String> cb) {
//		System.out.println(cb.getValue());
//
//	}
	private void getchoicemovie(ComboBox<String> combobox) {
		System.out.println(combobox.getValue());

	}
}
