package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Equipo;

import java.io.*;
import java.util.*;

/**
 * 
 */
public interface Operacion {

    /**
     * @param x 
     * @return
     */
    public String create(Equipo x);

    /**
     * @param id_equipo 
     * @return
     */
    public Equipo read(String id_equipo);

    /**
     * @return
     */
    public Equipo [ ] readall();

    /**
     * @param x 
     * @param id_equipo 
     * @return
     */
    public String update(Equipo x, String id_equipo);

    /**
     * @param id_equipo 
     * @return
     */
    public Equipo delete(String id_equipo);

    /**
     * @param Equipo 
     * @param path 
     * @param name 
     * @return
     */
    public String serializar(Equipo [ ] Equipo, String path, String name);

    /**
     * @param path 
     * @param name 
     * @return
     */
    public Equipo [ ] deserializar(String path, String name);

}