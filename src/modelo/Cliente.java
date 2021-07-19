/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author scorrea
 */
public class Cliente {
    
    private String cedula;
    private String nombre;
    private Double saldo;
    private String categoria;

    public Cliente(String cedula, String nombre, Double saldo, String categoria) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.saldo = saldo;
        this.categoria = categoria;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String mostrarInformacion()
    {
        return "Datos cliente: \ncedula=" + cedula + "\nnombre=" + nombre + "\nsaldo=" + saldo + "\n categoria=" 
                + categoria;
    }  
    
}
