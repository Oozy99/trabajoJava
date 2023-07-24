package org.example.trabajo;

import org.example.Validacion.ValidacionOferta;

import java.time.LocalDate;

public class Oferta {

    private Integer id;

    private String titulo;

    private String descripcion;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private Double costoPersona;

    private Integer idLocal;

    private ValidacionOferta Validacion = new ValidacionOferta();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) throws Exception {
        ValidacionOferta validacion = new ValidacionOferta();
        if (validacion.validarFechas(fechaInicio, this.fechaFin)) {
            this.fechaInicio = fechaInicio;
        }
    }



    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        try {
            this.Validacion.validarFechas(fechaFin);
            this.fechaFin = fechaFin;

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }



    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        this.costoPersona = costoPersona;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public void setFechaInicio(String s) {
    }

    public void setFechaFin(String s) {
    }
}
