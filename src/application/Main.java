package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root, 600, 600, Color.LIGHTBLUE);
		Stage stage = new Stage();
		
		Text text = new Text();
		text.setText("Hello World");
		text.setX(150);
		text.setY(100);
		text.setFont(Font.font("Segoe UI Black", 50));
		text.setFill(Color.LIGHTGREEN);
		
		Image image = new Image("pizza.png");
		ImageView imageView = new ImageView(image);
		imageView.setX(200);
		imageView.setY(200);
		
		root.getChildren().add(imageView);
		root.getChildren().add(text);
		stage.setScene(scene);
		stage.show();
	}
}
