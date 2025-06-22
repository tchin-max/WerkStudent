package inter7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Menutest extends Application {

	public static void main(String[] args) {
launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Menu fileMenu = new Menu("file");
		
		MenuItem Newfile = new MenuItem("New...");
		Newfile.setOnAction(t ->System.out.println("create new File...") );
		fileMenu.getItems().add(Newfile);
		
		
		fileMenu.getItems().add(new MenuItem("New project.."));
		fileMenu.getItems().add(new MenuItem("new Module"));
		fileMenu.getItems().add(new MenuItem("import Tools"));
		fileMenu.getItems().add(new SeparatorMenuItem());

		fileMenu.getItems().add(new MenuItem("Save..."));
		fileMenu.getItems().add(new SeparatorMenuItem());

		fileMenu.getItems().add(new MenuItem("Settings.."));
		MenuItem Exit = new MenuItem("Exit...");
		Exit.setOnAction(t -> System.exit(0));
fileMenu.getItems().add(Exit);
		
Menu Edit = new Menu("_Edit");
Edit.getItems().add(new MenuItem("Undo"));
Edit.getItems().add(new MenuItem("backin"));
MenuItem pastemenu =new MenuItem("paste");
pastemenu.setOnAction(e -> System.out.println("paste somthin") );
pastemenu.setDisable(true);
Edit.getItems().add(pastemenu);
Edit.getItems().add(new MenuItem("set.."));
Edit.getItems().add(new MenuItem("tofile"));

Menu helpmenu = new Menu("Help");
CheckMenuItem show = new CheckMenuItem("show lines Number");
show.setOnAction(d -> {
	
	if (show.isSelected()) System.out.println("Programm will not display"); 
	else System.out.println("hiding line number");
	;
} );
helpmenu.getItems().add(show);

Menu difficulty = new Menu("Difficulty");
ToggleGroup diffitoggle = new ToggleGroup();

RadioMenuItem easy = new RadioMenuItem("Easy");
RadioMenuItem normal = new RadioMenuItem("Normal");
RadioMenuItem Hard = new RadioMenuItem("Hard");
easy.setToggleGroup(diffitoggle);
normal.setToggleGroup(diffitoggle);
Hard.setToggleGroup(diffitoggle);

difficulty.getItems().addAll(easy,normal,Hard);


		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu,Edit,helpmenu,difficulty);

		
BorderPane bp = new BorderPane();
bp.setTop(menuBar);
bp.getChildren().addAll();
		
			Scene scene = new Scene(bp,300,200);
			stage.setScene(scene);
			stage.show();
		
	}

}
