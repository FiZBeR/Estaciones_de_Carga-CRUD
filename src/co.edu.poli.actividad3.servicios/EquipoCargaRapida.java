package co.edu.poli.actividad3.servicios;

import co.edu.poli.actividad3.modelo.Equipo;
import co.edu.poli.actividad3.modelo.Mantenimiento;

/**
 * 
 */
public class EquipoCargaRapida extends Equipo {
    /**
     * 
     */
    private int tiempoCargaMin;

    /**
     * 
     */
    private String tipoConector;

    /**
     * 
     */
    private String nivelCarga;

    public EquipoCargaRapida(String idEquipo, double potencia, String tipo, Mantenimiento[] mantenimiento, int tiempoCargaMin, String tipoConector, String nivelCarga) {
        super(idEquipo, potencia, tipo, mantenimiento);
        this.tiempoCargaMin = tiempoCargaMin;
        this.tipoConector = tipoConector;
        this.nivelCarga = nivelCarga;
    }

    public int getTiempoCargaMin() {
        return tiempoCargaMin;
    }

    public void setTiempoCargaMin(int tiempoCargaMin) {
        this.tiempoCargaMin = tiempoCargaMin;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public String getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(String nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    @Override
    public String toString() {
        return "EquipoCargaRapida{" +
                "tiempoCargaMin=" + tiempoCargaMin +
                ", tipoConector='" + tipoConector + '\'' +
                ", nivelCarga='" + nivelCarga + '\'' +
                '}';
    }

    /**
     * @return
     */
    public boolean requiereMantenimiento() {
        // TODO implement here
        return "".isEmpty();
    }

    /**
     *
     */
    public void abstracta() {

    }

}