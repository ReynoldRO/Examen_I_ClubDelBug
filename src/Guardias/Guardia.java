/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guardias;

/**
 *
 * @author Student
 */
public class Guardia {
    private String cedula;
    private String nombre;
    private turno turno;
    private String zona;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public turno getTurno() {
        return turno;
    }

    public String getZona() {
        return zona;
    }

    
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTurno(turno turno) {
        this.turno = turno;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Guardia(String cedula, String nombre, turno turno, String zona) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.turno = turno;
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Guardia{" + "cedula:" + cedula + ", nombre:" + nombre + ", turno:" + turno + ", zona:" + zona + '}';
    }
  
    
}
