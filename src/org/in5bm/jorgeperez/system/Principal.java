package org.in5bm.jorgeperez.system;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.in5bm.jorgeperez.controllers.AlumnosController;
import org.in5bm.jorgeperez.controllers.AsignacionAlumnosController;
import org.in5bm.jorgeperez.controllers.CursosController;
import org.in5bm.jorgeperez.controllers.MenuPrincipalController;

/**
 *
 * @author Jorge Luis Pérez Canto
 */

public class Principal extends Application {
    
    private Stage escenarioPrincipal;
    private final String PAQUETE_IMAGE = "org/in5bm/jorgeperez/resources/images/";
    private final String PAQUETE_VIEW = "../views/";
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.escenarioPrincipal = primaryStage;
        this.escenarioPrincipal.setTitle("Control Académico Kinal IN5BM");
        this.escenarioPrincipal.getIcons().add(new Image(PAQUETE_IMAGE + "colegio.png"));
        this.escenarioPrincipal.setResizable(false);
        this.escenarioPrincipal.centerOnScreen();
        mostrarEscenaPrincipal();
        //mostrarEscenaAsigacion();
    }
    
    public void mostrarEscenaCursos() {
        try {
            CursosController cursosController = (CursosController) cambiarEscena("CursosView.fxml", 1152, 648);
            cursosController.setEscenarioPrincipal(this);
        } catch (Exception ex) {
            System.err.println("\nSe ha un producido un error al mostrar la vista Cursos");
            ex.printStackTrace();
        }
    } 
    
    public void mostrarEscenaAsigacion() {
        try {
            AsignacionAlumnosController asignacionController = (AsignacionAlumnosController) cambiarEscena("AsignacionesAlumnosView.fxml", 1152, 648);
            asignacionController.setEscenarioPrincipal(this);
        } catch (Exception ex) {
            System.err.println("\nSe ha un producido un error al mostrar la vista Asignación alumnos");
            ex.printStackTrace();
        }
    }
    
    public void mostrarEscenaPrincipal() {
        try {
            MenuPrincipalController menuController = (MenuPrincipalController) cambiarEscena("MenuPrincipalView.fxml", 1152, 648);
            menuController.setEscenarioPrincipal(this);
        } catch (Exception ex) {
            System.err.println("\nSe ha un producido un error al mostrar la vista del Menú Principal");
            ex.printStackTrace();
        }
    }    

    public void mostrarEscenaAlumnos() {
        try {
            AlumnosController alumnosController = (AlumnosController) cambiarEscena("AlumnosView.fxml", 1152, 648);
            alumnosController.setEscenarioPrincipal(this);
        } catch (Exception ex) {
            System.err.println("\nSe ha producido un error al intentar mostrar la vista de Alumnos");
            ex.printStackTrace();
        }
    }

    /*
    public Initializable cambiarEscena(String vistaFxml, int ancho, int alto) throws IOException {
        Initializable resultado = null;
        
        // Cargador del archivo FXML
        FXMLLoader cargadorFXML = new FXMLLoader();
        
        // Cargador de fabrica para cargar el archivo FXML
        cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
        
        // Ubicación del archivo FXML que pintará en el escenario
        cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VIEW + vistaFxml));
        
        // Asignación de la lógica del archivo
        InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VIEW + vistaFxml);
        
        // Creación del nodo raíz
        AnchorPane root = cargadorFXML.load(archivo);
        
        // Creación de la escena
        Scene nuevaEscena = new Scene(root, ancho, alto);
        
        // Cargar la escena en el escenario principal
        this.escenarioPrincipal.setScene(nuevaEscena);

        this.escenarioPrincipal.sizeToScene();
        
        // Mostrar el escenario
        this.escenarioPrincipal.show();
        
        // Obtener una instancia del controlador de la vista
        resultado = (Initializable) cargadorFXML.getController();
        
        return resultado;
    }
    */

    
    public Initializable cambiarEscena(String vistaFxml, int ancho, int alto) throws IOException {
        System.out.println("Cambiando escena: " + PAQUETE_VIEW + vistaFxml);
        FXMLLoader cargadorFXML = new FXMLLoader(getClass().getResource(PAQUETE_VIEW + vistaFxml));
        Scene scene = new Scene((AnchorPane) cargadorFXML.load(), ancho, alto);
        this.escenarioPrincipal.setScene(scene);
        this.escenarioPrincipal.sizeToScene();
        this.escenarioPrincipal.show();
        return (Initializable) cargadorFXML.getController();
    }
    
}





