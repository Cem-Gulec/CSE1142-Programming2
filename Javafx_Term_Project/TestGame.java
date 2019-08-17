import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.*;

import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

public class TestGame extends Application{

	//creating level objects
	Level_1 level1 = new Level_1();
	Level_2 level2 = new Level_2();
	Level_3 level3 = new Level_3();
	Level_4 level4 = new Level_4();
	Level_5 level5 = new Level_5();

	@Override  //buttons that will jump to the next level
	public void start(Stage primaryStage) {
		Button continueButton1 = new Button("Continue");
		Button continueButton2 = new Button("Continue");
		Button continueButton3 = new Button("Continue");
		Button continueButton4 = new Button("Continue");
		Button continueButton5 = new Button("Continue");

		//positioning horizantal boxes and adding button into it
		HBox level1Hbox = new HBox();
		level1Hbox.setAlignment(Pos.TOP_CENTER);
		level1Hbox.getChildren().add(continueButton1);

		HBox level2Hbox = new HBox();
		level2Hbox.setAlignment(Pos.TOP_CENTER);
		level2Hbox.getChildren().add(continueButton2);

		HBox level3Hbox = new HBox();
		level3Hbox.setAlignment(Pos.TOP_CENTER);
		level3Hbox.getChildren().add(continueButton3);

		HBox level4Hbox = new HBox();
		level4Hbox.setAlignment(Pos.TOP_CENTER);
		level4Hbox.getChildren().add(continueButton4);

		HBox level5Hbox = new HBox();
		level5Hbox.setAlignment(Pos.TOP_CENTER);
		level5Hbox.getChildren().add(continueButton5);

		//setting final screen message and shape properties of the final screen
		Label finishLabel = new Label("GAME ÝS OVER\nCONGRATULATÝON!!");
		finishLabel.setRotate(-45);
		finishLabel.setFont(Font.font(STYLESHEET_CASPIAN, 35));

		BorderPane level1Pane = new BorderPane();
		BorderPane level2Pane = new BorderPane();
		BorderPane level3Pane = new BorderPane();
		BorderPane level4Pane = new BorderPane();
		BorderPane level5Pane = new BorderPane();
		BorderPane finishPane = new BorderPane();


		level1Pane.setTop(level1Hbox);
	    level1Pane.setCenter(level1);
	    Scene scene = new Scene(level1Pane, 600,600);// scene with 600*600 width and height



	    level2Pane.setTop(level2Hbox);
	    level2Pane.setCenter(level2);
	    Scene scene1 = new Scene(level2Pane,600,600);


	    level3Pane.setTop(level3Hbox);
	    level3Pane.setCenter(level3);
	    Scene scene2 = new Scene(level3Pane,600,600);


	    level4Pane.setTop(level4Hbox);
	    level4Pane.setCenter(level4);
	    Scene scene3 = new Scene(level4Pane,600,600);


	    level5Pane.setTop(level5Hbox);
	    level5Pane.setCenter(level5);
	    Scene scene4 = new Scene(level5Pane,600,600);


	    finishPane.setCenter(finishLabel);
	    Scene scene5 = new Scene(finishPane,600,600);


		primaryStage.setTitle("Brain Storming"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage


		continueButton1.setOnMouseClicked(e -> {primaryStage.setScene(scene1);});
		continueButton2.setOnMouseClicked(e -> primaryStage.setScene(scene2));
		continueButton3.setOnMouseClicked(e -> primaryStage.setScene(scene3));
		continueButton4.setOnMouseClicked(e -> primaryStage.setScene(scene4));
		continueButton5.setOnMouseClicked(e -> primaryStage.setScene(scene5));

		primaryStage.show(); // Display the stage


	}

	public static void main(String[] args) {

		launch(args);
	}


}
