/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.in5bm.jorgeperez.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


/**
 *
 * @author Jorge Luis Pérez Canto
 * @date 7/06/2022
 * @time 08:04:20
 * 
 */

public class Cursos {
    private IntegerProperty id;
    private StringProperty nombreCurso;
    private IntegerProperty ciclo;
    private IntegerProperty cupoMaximo;
    private IntegerProperty cupoMinimo;
    private StringProperty carreraTecnicaId;
    private IntegerProperty horarioId;
    private IntegerProperty instructorId;
    private StringProperty salonId;

    public Cursos() {
        this.id = new SimpleIntegerProperty();
        this.nombreCurso = new SimpleStringProperty();
        this.ciclo = new SimpleIntegerProperty();
        this.cupoMaximo = new SimpleIntegerProperty();
        this.cupoMinimo = new SimpleIntegerProperty();
        this.carreraTecnicaId = new SimpleStringProperty();
        this.horarioId = new SimpleIntegerProperty();
        this.instructorId = new SimpleIntegerProperty();
        this.salonId = new SimpleStringProperty();
    }
}
