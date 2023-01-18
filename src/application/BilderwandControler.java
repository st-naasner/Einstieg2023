package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BilderwandControler {


    @FXML
    private Button btBatu;

    @FXML
    private Button btBoris;

    @FXML
    private Button btDaniel;

    @FXML
    private Button btJustin;

    @FXML
    private Button btKilian;

    @FXML
    private Button btLinas;

    @FXML
    private Button btMagnus;

    @FXML
    private Button btMohanad;

    @FXML
    private Button btNaasner;

    @FXML
    private Button btNiclas;

    @FXML
    private Button btNicolas;

    @FXML
    private Button btTim;

    @FXML
    private Button btfarid;

    @FXML
    private ImageView imBild;

    @FXML
    void anzeigenNaasner(ActionEvent event) {
    	Image bildNaasner = new Image("./Bilder/naasner.jpg");
    	imBild.setImage(bildNaasner);
    }
    @FXML
    void anzeigenTim(ActionEvent event) 
    {
    	Image bildTim = new Image("./Bilder/Tim.jpg");    
    	imBild.setImage(bildTim);
    }
    
}
