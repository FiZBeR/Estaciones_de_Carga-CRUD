package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Mantenimiento;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class EquipoCargaUltraRapida extends EquipoCargaRapida {

    /**
     * 
     */
    private int sistemaEnfriamiento;

    /**
     * 
     */
    private double capacidadBateriaMaxima;

    /**
     * 
     */
    private double voltajeMaximo;

    /**
     * 
     */
    private boolean proteccionSobrecarga;

    /**
     * 
     */
    private int tiempoCargaUltraRapidaMin;

    public EquipoCargaUltraRapida(String idEquipo, double potencia, String tipo, Mantenimiento[] mantenimiento, int tiempoCargaMin, String tipoConector, String nivelCarga, int sistemaEnfriamiento, double capacidadBateriaMaxima, double voltajeMaximo, boolean proteccionSobrecarga, int tiempoCargaUltraRapidaMin) {
        super(idEquipo, potencia, tipo, mantenimiento, tiempoCargaMin, tipoConector, nivelCarga);
        this.sistemaEnfriamiento = sistemaEnfriamiento;
        this.capacidadBateriaMaxima = capacidadBateriaMaxima;
        this.voltajeMaximo = voltajeMaximo;
        this.proteccionSobrecarga = proteccionSobrecarga;
        this.tiempoCargaUltraRapidaMin = tiempoCargaUltraRapidaMin;
    }

    public int getSistemaEnfriamiento() {
        return sistemaEnfriamiento;
    }

    public void setSistemaEnfriamiento(int sistemaEnfriamiento) {
        this.sistemaEnfriamiento = sistemaEnfriamiento;
    }

    public double getCapacidadBateriaMaxima() {
        return capacidadBateriaMaxima;
    }

    public void setCapacidadBateriaMaxima(double capacidadBateriaMaxima) {
        this.capacidadBateriaMaxima = capacidadBateriaMaxima;
    }

    public double getVoltajeMaximo() {
        return voltajeMaximo;
    }

    public void setVoltajeMaximo(double voltajeMaximo) {
        this.voltajeMaximo = voltajeMaximo;
    }

    public boolean isProteccionSobrecarga() {
        return proteccionSobrecarga;
    }

    public void setProteccionSobrecarga(boolean proteccionSobrecarga) {
        this.proteccionSobrecarga = proteccionSobrecarga;
    }

    public int getTiempoCargaUltraRapidaMin() {
        return tiempoCargaUltraRapidaMin;
    }

    public void setTiempoCargaUltraRapidaMin(int tiempoCargaUltraRapidaMin) {
        this.tiempoCargaUltraRapidaMin = tiempoCargaUltraRapidaMin;
    }

    @Override
    public String toString() {
        return "EquipoCargaUltraRapida{" +
                "sistemaEnfriamiento=" + sistemaEnfriamiento +
                ", capacidadBateriaMaxima=" + capacidadBateriaMaxima +
                ", voltajeMaximo=" + voltajeMaximo +
                ", proteccionSobrecarga=" + proteccionSobrecarga +
                ", tiempoCargaUltraRapidaMin=" + tiempoCargaUltraRapidaMin +
                '}';
    }
}