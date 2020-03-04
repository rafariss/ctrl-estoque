package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollpanel = loader.load();
			
			scrollpanel.setFitToHeight(true);
			scrollpanel.setFitToWidth(true);
			Scene mainScene = new Scene(scrollpanel);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("LJ JavaFX ctrlEstoque");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
