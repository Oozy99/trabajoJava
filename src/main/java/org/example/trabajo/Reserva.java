package org.example.trabajo;

import org.example.Validacion.ReservaValidacion;

import java.time.LocalDate;

public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    private Integer numeroDePersonas;
    private ReservaValidacion validacion = new ReservaValidacion();

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva, Integer numeroDePersonas) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.numeroDePersonas = numeroDePersonas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) throws Exception {
        try {
            validacion.validarFecha(String.valueOf(fechaReserva));
            this.fechaReserva = fechaReserva;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public Integer getNumeroDePersonas() {
        return numeroDePersonas;
    }

    public void setNumeroDePersonas(Integer numeroDePersonas) throws Exception {
        try {
            validacion.validarNumeroDePersonas(numeroDePersonas);
            this.numeroDePersonas = numeroDePersonas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}

