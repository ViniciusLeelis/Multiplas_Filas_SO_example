
package fatec.so.multiplasfilas;

import java.awt.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;
import static javax.swing.text.StyleConstants.Background;
import fatec.so.multiplasfilas.Processo;
import fatec.so.multiplasfilas.Fila;

/**
 *
 * @author Vinicius Lelis
 */
public class FXMLDocumentController implements Initializable {
    
    Fila fila = new Fila();
    
    @FXML
    private Button sy01;
    @FXML
    private Button sy02;
    @FXML
    private Button sy03;
    @FXML
    private Button sy04;
    @FXML
    private Button int01;
    @FXML
    private Button int02;
    @FXML
    private Button int03;
    @FXML
    private Button int04;
    @FXML
    private Button batch01;
    @FXML
    private Button batch02;
    @FXML
    private Button batch03;
    @FXML
    private Button batch04;
    @FXML
    private Rectangle retangulo;
    @FXML
    private Button syLineB;
    @FXML
    private Button intLineB;
    @FXML
    private Button batchLineB;
    
    @FXML 
    private void addProcessoSistema(ActionEvent event) {
        fila.addSistema();
        
    }
    @FXML
    private void addProcessoInterativo(ActionEvent event) {
        fila.addInterativo();
        
    }
    @FXML
    private void addProcessoBatch(ActionEvent event) {
        fila.addBatch();
        
    }
   
    // Alterar cores dos botões
    private void setVazio(Button button) {
        button.setStyle("-fx-background-color:WHITE;");
    }
    private void setExecutando(Button button) {
        button.setStyle("-fx-background-color:#79ff75;");
    }
    private void setAguardando(Button button) {
        button.setStyle("-fx-background-color:#f1ff1f;");
    }
    private void setLineExecutando(Button button) {
        button.setStyle("-fx-background-color:#79ff75;");
    }
    private void setLineVazio(Button button) {
        button.setStyle("-fx-background-color:WHITE;");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
