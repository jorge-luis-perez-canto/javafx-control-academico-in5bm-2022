package org.in5bm.jorgeperez.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


/**
 *
 * @author Jorge Luis Pérez Canto
 * @date 2/06/2022
 * @time 10:55:00
 * 
 */

public class CursosController implements Initializable {

    @FXML
    private Button btnNuevo;
    @FXML
    private ImageView imgNuevo;
    @FXML
    private Button btnModificar;
    @FXML
    private ImageView imgModificar;
    @FXML
    private Button btnEliminar;
    @FXML
    private ImageView imgEliminar;
    @FXML
    private Button btnReporte;
    @FXML
    private ImageView imgReporte;
    @FXML
    private TextField txtNombreCurso;
    @FXML
    private TextField txtId;
    @FXML
    private Spinner<?> spnCiclo;
    @FXML
    private Spinner<?> spnCupoMaximo;
    @FXML
    private Spinner<?> spnCupoMinimo;
    @FXML
    private ComboBox<?> cmbCarreraTecnica;
    @FXML
    private ComboBox<?> cmbHorario;
    @FXML
    private ComboBox<?> cmbInstructor;
    @FXML
    private ComboBox<?> cmbSalon;
    @FXML
    private ImageView imgRegresar;
    @FXML
    private TableView<?> tblCursos;
    @FXML
    private TableColumn<?, ?> colId;
    @FXML
    private TableColumn<?, ?> colNombreCurso;
    @FXML
    private TableColumn<?, ?> colCicloEscolar;
    @FXML
    private TableColumn<?, ?> colCupoMaximo;
    @FXML
    private TableColumn<?, ?> colCupoMinimo;
    @FXML
    private TableColumn<?, ?> colCarreraTecnica;
    @FXML
    private TableColumn<?, ?> colHorario;
    @FXML
    private TableColumn<?, ?> colInstructor;
    @FXML
    private TableColumn<?, ?> colSalon;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void clicNuevo(ActionEvent event) {
    }

    @FXML
    private void clicModificar(ActionEvent event) {
    }

    @FXML
    private void clicEliminar(ActionEvent event) {
    }

    @FXML
    private void clicReporte(ActionEvent event) {
    }

    @FXML
    private void seleccionarElemento(MouseEvent event) {
    }

    @FXML
    private void seleccionarElemento(KeyEvent event) {
    }

    @FXML
    private void clicRegresar(MouseEvent event) {
    }

}
