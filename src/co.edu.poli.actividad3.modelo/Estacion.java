package co.edu.poli.actividad3.modelo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Estacion {

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String idEstacion;

    /**
     * 
     */
    private String ubicacion;

    /**
     * 
     */
    private String estado;

    /**
     * 
     */
    private int capacidad;

    /**
     * 
     */
    private PuntoDeCarga [ ] puntosDeCarga;

    public Estacion(String nombre, String idEstacion, String ubicacion, String estado, int capacidad, PuntoDeCarga[] puntosDeCarga) {
        this.nombre = nombre;
        this.idEstacion = idEstacion;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.capacidad = capacidad;
        this.puntosDeCarga = puntosDeCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion) {
        this.idEstacion = idEstacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public PuntoDeCarga[] getPuntosDeCarga() {
        return puntosDeCarga;
    }

    public void setPuntosDeCarga(PuntoDeCarga[] puntosDeCarga) {
        this.puntosDeCarga = puntosDeCarga;
    }

    @Override
    public String toString() {
        return "Estacion{" +
                "nombre='" + nombre + '\'' +
                ", idEstacion='" + idEstacion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", estado='" + estado + '\'' +
                ", capacidad=" + capacidad +
                ", puntosDeCarga=" + Arrays.toString(puntosDeCarga) +
                '}';
    }
}