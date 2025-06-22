package inter7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TreeViewresr extends Application {
public static void main(String[] args) {
	launch(args);
}

@Override
public void start(Stage stage) throws Exception {

	TreeItem<String> root,buck,pack;
	root= new  TreeItem<>();
	root.setExpanded(true);
	
	buck = makeBranch("Bucky",root);
	makeBranch("youtbe",buck);
	makeBranch("twiter",buck);
	makeBranch("viber",buck);
	
	pack = makeBranch("pack",root);
	makeBranch("pain",pack);
	makeBranch("boullie",pack);
	makeBranch("beignet",pack);
	
	TreeView<String> tv = new TreeView<>(root);
tv.setShowRoot(false);
	
	
	VBox vb = new VBox(10);

	vb.setPadding(new Insets(20,20,20,20));
	vb.getChildren().addAll(tv);
	
		Scene scene = new Scene(vb,400,210);
		stage.setScene(scene);
		stage.show();
}

private TreeItem<String> makeBranch(String title , TreeItem<String> parent) {

	TreeItem<String> item = new TreeItem<>(title);
	item.setExpanded(true);
	parent.getChildren().add(item);
	return item;
	
}
}

