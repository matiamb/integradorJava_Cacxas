
package logica;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Orador implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_orador;
    private String nombre;
    private String apellido;
    private String mail;
    private String tema;
    @Temporal (TemporalType.DATE)
    private LocalDate fecha_alta;

    public Orador() {
    }

    public Orador(int id_orador, String nombre, String apellido, String mail, String tema, LocalDate fecha_alta) {
        this.id_orador = id_orador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.tema = tema;
        this.fecha_alta = fecha_alta;
    }

    public int getId_orador() {
        return id_orador;
    }

    public void setId_orador(int id_orador) {
        this.id_orador = id_orador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(LocalDate fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
    
    
    
}
