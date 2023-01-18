package application;
	
import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class BilderwandAufgabe extends Application {
	 private Stage 		b�hne;
	   private AnchorPane 	grundPane;

	   @Override
	   public void start(Stage pPrimaryStage) throws IOException
	   {
	       this.b�hne = pPrimaryStage;
	       FXMLLoader lLoader = new FXMLLoader();

	       lLoader.setLocation(BilderwandAufgabe.class.getResource("BilderwandView.fxml"));
	       grundPane = lLoader.load();

	       Scene lScene = new Scene(grundPane);
	       b�hne.setScene(lScene);
	       b�hne.show();
	   }
	
	public static void main(String[] args) {
		launch(args);
	}
}
