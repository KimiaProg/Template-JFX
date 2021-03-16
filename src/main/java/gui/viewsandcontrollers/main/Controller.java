package gui.viewsandcontrollers.main;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class Controller {

	@FXML
    private Label label;
	@FXML
	private Label label2;
	@FXML
	private TextField text;
    public void initialize() {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
    
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SecondFXML.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(text.getText());
        stage.setScene(new Scene(root1));  
        stage.show();
        
        //System.out.println();
        //label2.setText(text.getText());
        //label.setText("Hello World!");
        //FXMLLoader.load(getClass().getResource("BasicFXML.fxml"));
       // String textS=text.getCharacters().toString();
        
        
    }
    
  
    
    
}
