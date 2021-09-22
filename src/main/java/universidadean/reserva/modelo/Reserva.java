package universidadean.reserva.modelo;

import javax.persistence.*;
import java.sql.Time;
import java.util.*;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    private String nombreCompleto;
    private int celular;
    private int personas;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codReserva;
    private String documento;
    private Date fecha;
    public static int  aforo = 20;


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public Long getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(Long codReserva) {
        this.codReserva = codReserva;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
