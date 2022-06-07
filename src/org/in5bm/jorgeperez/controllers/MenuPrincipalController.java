package org.in5bm.jorgeperez.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.in5bm.jorgeperez.system.Principal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuPrincipalController implements Initializable {

    private Principal escenarioPrincipal;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }
    
    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    @FXML
    public void clicAlumnos(ActionEvent event) {
        escenarioPrincipal.mostrarEscenaAlumnos();
    }
    
}






