package co.edu.poli.actividad3.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PuntoDeCarga {

    /**
     * 
     */
    private String idPdC;

    /**
     * 
     */
    private boolean esDisponible;

    /**
     * 
     */
    private Equipo  equipo;

    /**
     * 
     */
    private String conector;

    /**
     * 
     */
    private String estadoEquipo;

    public PuntoDeCarga(String idPdC, boolean esDisponible, Equipo equipo, String conector, String estadoEquipo) {
        this.idPdC = idPdC;
        this.esDisponible = esDisponible;
        this.equipo = equipo;
        this.conector = conector;
        this.estadoEquipo = estadoEquipo;
    }


    public String getIdPdC() {
        return idPdC;
    }

    public void setIdPdC(String idPdC) {
        this.idPdC = idPdC;
    }

    public boolean isEsDisponible() {
        return esDisponible;
    }

    public void setEsDisponible(boolean esDisponible) {
        this.esDisponible = esDisponible;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public String getEstadoEquipo() {
        return estadoEquipo;
    }

    public void setEstadoEquipo(String estadoEquipo) {
        this.estadoEquipo = estadoEquipo;
    }

    @Override
    public String toString() {
        return "PuntoDeCarga{" +
                "idPdC='" + idPdC + '\'' +
                ", esDisponible=" + esDisponible +
                ", equipo=" + equipo +
                ", conector='" + conector + '\'' +
                ", estadoEquipo='" + estadoEquipo + '\'' +
                '}';
    }

    /**
     * @return
     */
    public boolean vehiculoCargando() {
        // TODO implement here
        return false;
    }

}