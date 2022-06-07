package org.in5bm.jorgeperez.controllers;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import org.in5bm.jorgeperez.models.AsignacionesAlumnos;
import org.in5bm.jorgeperez.models.Alumnos;
import org.in5bm.jorgeperez.models.Cursos;


/**
 *
 * @author Jorge Luis Pérez Canto
 * @date 2/06/2022
 * @time 10:53:37
 * 
 */

public class AsignacionAlumnosController implements Initializable {

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
    private TextField txtId;
    @FXML
    private ImageView imgRegresar;
    @FXML
    private TableView<AsignacionesAlumnos> tblAsignacionesAlumnos;
    @FXML
    private TableColumn<AsignacionesAlumnos, Integer> colId;
    @FXML
    private TableColumn<AsignacionesAlumnos, String> colCarne;
    @FXML
    private TableColumn<Alumnos, String> colNombreAlumno;
    @FXML
    private TableColumn<AsignacionesAlumnos, Integer> colCursoId;
    @FXML
    private TableColumn<Cursos, String> colNombreCurso;
    @FXML
    private TableColumn<AsignacionesAlumnos, LocalDate> fechaAsignacion;
    @FXML
    private ComboBox<Alumnos> cmbAlumno;
    @FXML
    private ComboBox<Cursos> cmbCurso;
    
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
