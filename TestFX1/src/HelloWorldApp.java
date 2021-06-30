import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorldApp extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("File Process Writer");
		Button btn = new Button();
		btn.setText("Write to file");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				createWriterProcess();
				System.out.println("Created process");

			}
		});
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}

	private void createWriterProcess() {
		try {
			// create a new process
			System.out.println("Creating Process");

			ProcessBuilder builder = new ProcessBuilder("java", "-jar", "FileModifier.jar");
			Process pro = builder.start();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
