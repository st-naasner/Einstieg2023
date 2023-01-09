package application;
	
import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class BilderwandAufgabe extends Application {
	 private Stage 		bühne;
	   private AnchorPane 	grundPane;

	   @Override
	   public void start(Stage pPrimaryStage) throws IOException
	   {
	       this.bühne = pPrimaryStage;
	       FXMLLoader lLoader = new FXMLLoader();

	       lLoader.setLocation(BilderwandAufgabe.class.getResource("BilderwandView.fxml"));
	       grundPane = lLoader.load();

	       Scene lScene = new Scene(grundPane);
	       bühne.setScene(lScene);
	       bühne.show();
	   }
	
	public static void main(String[] args) {
		launch(args);
	}
}
