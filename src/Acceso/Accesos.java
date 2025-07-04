package Acceso;
import ListaAcceso.Lista; 
/**
 *
 * @author Student
 */
public class Accesos {
   private String codigo;
    private String residente;
    private Lista accesso;
    private String fecha_y_hora;
    private String autorizacion;

    public Accesos(String codigo, String residente, Lista accesso, String fecha_y_hora, String autorizacion) {
        this.codigo = codigo;
        this.residente = residente;
        this.accesso = accesso;
        this.fecha_y_hora = fecha_y_hora;
        this.autorizacion = autorizacion;
    }

   

    public String getCodigo() {
        return codigo;
    }

    public String getResidente() {
        return residente;
    }

    public Lista getAccesso() {
        return accesso;
    }

    public String getFecha_y_hora() {
        return fecha_y_hora;
    }

    public String getAutorizacion() {
        return "Nombre del guardia que lo autorizó: " + autorizacion;
    }

    public void setAccesso(Lista accesso) {
        this.accesso = accesso;
    }

    

    @Override
    public String toString() {
        return "ListaAccesos: " + "codigo=" + codigo + ", residente=" + residente + ", accesso=" + accesso + ", fecha_y_hora=" + fecha_y_hora + ", autorizacion=" + autorizacion;
    }
}
