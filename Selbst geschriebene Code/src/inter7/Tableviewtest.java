package inter7;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tableviewtest extends Application{

	public static void main(String[] args) {
launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		TableView<product> pr = new TableView<>();
		
		TableColumn<product, String> namecolomm = new TableColumn<>("name");
		namecolomm.setMinWidth(200);
		namecolomm.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		TableColumn<product, Double> pricecolomm = new TableColumn<>("price");
		namecolomm.setMinWidth(100);
		namecolomm.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		TableColumn<product, Integer> quantitycolomm = new TableColumn<>("quantity");
		namecolomm.setMinWidth(100);
		namecolomm.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		pr.setItems(getproducts());
		pr.getColumns().addAll(namecolomm,pricecolomm,quantitycolomm);
		
		VBox vb = new VBox();
		vb.getChildren().addAll(pr);
		
			Scene scene = new Scene(vb,300,200);
			stage.setScene(scene);
			stage.show();
	}
	public ObservableList<product> getproducts() {
		ObservableList<product> prd = FXCollections.observableArrayList();
		prd.add(new product("Laptop",545,20));
		prd.add(new product("Tootbrusch",554,2));
		prd.add(new product("Banana",48,8));
		prd.add(new product("Setop",23,26));
		prd.add(new product("OHIO",468,60));
		prd.add(new product("bitches",54,20));
		
		return prd;

	}

}
