/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Guardias;

/**
 *
 * @author Student
 */
public enum turno {
   
    dia("dia"),
    tarde("tarde"),
    noche("noche");
    
    private String turno;

    public void setTurno(String turno) {
        this.turno = turno;
    }

    private turno(String turno) {
        this.turno = turno;
    }

    
    
}
