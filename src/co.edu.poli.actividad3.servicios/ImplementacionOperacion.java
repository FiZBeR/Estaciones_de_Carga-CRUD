package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Equipo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.util.*;

/**
 * 
 */
public class ImplementacionOperacion implements Operacion {


    /**
     *
     */
    private Equipo [ ] Equipo;


    /**
     * Default constructor
     */
    public ImplementacionOperacion() {
        Equipo = new Equipo[1];
    }

    public void setEEquipo(Equipo[] Equipo) {
        this.Equipo = Equipo;
    }

    /**
     * @param x 
     * @return
     */
    public String create(Equipo x) {
        // TODO implement Operacion.create() here
        for (int i = 0; i < Equipo.length; i++) {
            if (Equipo[i] == null) {
                Equipo[i] = x;
                return "Save!";
            }
        }
        Equipo[] Equipoaux = new Equipo[Equipo.length * 2];
        System.arraycopy(Equipo, 0, Equipoaux, 0, Equipo.length);
        Equipoaux[Equipo.length] = x;
        Equipo = Equipoaux;
        return "Save!!";
    }

    /**
     * @param id_equipo 
     * @return
     */
    public Equipo read(String id_equipo) {
        // TODO implement Operacion.read() here
        for (int i = 0; i < Equipo.length; i++) {
            if (!(Equipo[i] == null))
                if (Equipo[i].getIdEquipo().equals(id_equipo))
                    return Equipo[i];
        }
        return null;
    }

    /**
     * @return
     */
    public Equipo [ ] readall() {
        // TODO implement Operacion.readall() here
        return Equipo;
    }

    /**
     * @param x 
     * @param id_equipo 
     * @return
     */
    public String update(Equipo x, String id_equipo) {
        // TODO implement Operacion.update() here
        for (int i = 0; i < Equipo.length; i++) {
            if (!(Equipo[i] == null))
                if (Equipo[i].getIdEquipo().equals(id_equipo)) {
                    Equipo[i] = x;
                    return "Update!";
                }
        }
        return "Cod is not in the array!";
    }

    /**
     * @param id_equipo 
     * @return
     */
    public Equipo delete(String id_equipo) {
        // TODO implement Operacion.delete() here
        Equipo temp = null;
        for (int i = 0; i < Equipo.length; i++) {
            if (!(Equipo[i] == null))
                if (Equipo[i].getIdEquipo().equals(id_equipo)) {
                    temp = Equipo[i];
                    Equipo[i] = null;
                    return temp;
                }
        }
        return temp;
    }

    /**
     * @param Equipo 
     * @param path 
     * @param name 
     * @return
     */
    public String serializar(Equipo [ ] Equipo, String path, String name) {
        // TODO implement Operacion.serializar() here
        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Equipo);
            oos.close();
            fos.close();
            return "File create!!";
        } catch (IOException ioe) {
            return "Error file " + ioe.getMessage();
        }
    }

    /**
     * @param path 
     * @param name 
     * @return
     */
    public Equipo [ ] deserializar(String path, String name) {
        // TODO implement Operacion.deserializar() here
        Equipo[] a = null;
        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);

            a = (Equipo[]) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return a;
    }

}