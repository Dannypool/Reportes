package mx.com.ragna.dto;

import java.util.Date;

public class NotaRapidaDto {

    private Integer id;
    private String texto;
    private Date fecha;

    public NotaRapidaDto(Integer id, String texto, Date fecha) {
        this.id = id;
        this.texto = texto;
        this.fecha = fecha;
    }

    public NotaRapidaDto() { }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }
}
