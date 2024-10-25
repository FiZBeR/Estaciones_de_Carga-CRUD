package co.edu.poli.actividad3.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Equipo {

    /**
     * 
     */
    private String idEquipo;

    /**
     * 
     */
    private double potencia;

    /**
     * 
     */
    private String tipo;

    /**
     * 
     */
    private Mantenimiento [ ] mantenimiento;

    public Equipo(String idEquipo, double potencia, String tipo, Mantenimiento[] mantenimiento) {
        this.idEquipo = idEquipo;
        this.potencia = potencia;
        this.tipo = tipo;
        this.mantenimiento = mantenimiento;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Mantenimiento[] getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento[] mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo='" + idEquipo + '\'' +
                ", potencia=" + potencia +
                ", tipo='" + tipo + '\'' +
                ", mantenimiento=" + Arrays.toString(mantenimiento) +
                '}';
    }

    /**
     * @return
     */
    public boolean requiereMantenimiento() {
        // TODO implement here
        return false;
    }

    /**
     * @param a 
     * @return
     */
    protected int Operation1(int a) {
        // TODO implement here
        return 0;
    }

    /**
     * @param a 
     * @return
     */
    protected double Operation2(double a) {
        // TODO implement here
        return 0.0d;
    }

    /**
     * 
     */
    public abstract void abstracta();

}