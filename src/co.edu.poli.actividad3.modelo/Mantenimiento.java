package co.edu.poli.actividad3.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Mantenimiento {
    /**
     * 
     */
    private String fecha;

    /**
     * 
     */
    private String idTecnico;

    /**
     * 
     */
    private String tecnico;

    /**
     * 
     */
    private String observaciones;

    public Mantenimiento(String fecha, String idTecnico, String tecnico, String observaciones) {
        this.fecha = fecha;
        this.idTecnico = idTecnico;
        this.tecnico = tecnico;
        this.observaciones = observaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(String idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Mantenimiento{" +
                "fecha='" + fecha + '\'' +
                ", idTecnico='" + idTecnico + '\'' +
                ", tecnico='" + tecnico + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }

    /**
     * @param minutos 
     * @return
     */
    public double costoMantenimiento(int minutos) {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public String ahora() {
        // TODO implement here
        return "";
    }

}