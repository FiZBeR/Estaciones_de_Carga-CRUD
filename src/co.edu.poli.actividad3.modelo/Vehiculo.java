package co.edu.poli.actividad3.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Vehiculo {
    /**
     * 
     */
    private String matricula;

    /**
     * 
     */
    private String marca;

    /**
     * 
     */
    private String modelo;

    /**
     * 
     */
    private int capacidadBateria;

    /**
     * 
     */
    private int cargaBateria;

    /**
     * 
     */
    private String estadoBateria;

    public Vehiculo(String matricula, String marca, String modelo, int capacidadBateria, int cargaBateria, String estadoBateria) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
        this.cargaBateria = cargaBateria;
        this.estadoBateria = estadoBateria;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getCargaBateria() {
        return cargaBateria;
    }

    public void setCargaBateria(int cargaBateria) {
        this.cargaBateria = cargaBateria;
    }

    public String getEstadoBateria() {
        return estadoBateria;
    }

    public void setEstadoBateria(String estadoBateria) {
        this.estadoBateria = estadoBateria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadBateria=" + capacidadBateria +
                ", cargaBateria=" + cargaBateria +
                ", estadoBateria='" + estadoBateria + '\'' +
                '}';
    }

    /**
     * @return
     */
    public String evaluacion() {
        // TODO implement here
        return "";
    }

}