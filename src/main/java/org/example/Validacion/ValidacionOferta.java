package org.example.Validacion;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidacionOferta {


    protected Util util = new Util();

    public ValidacionOferta() {
    }

    public Boolean ValidarTitulo(String titulo) throws Exception {
        if (titulo.length() < 10) {
            return true;
        } else {
            throw new Exception(Mensajes.TITULO_VALIDACION.getMensaje());
        }
    }

    public Boolean validarFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaFin.isBefore(fechaInicio)) {
            throw new Exception("la fecha de finalizacion debe ser despues de la de inicio");
        } else {
            return true;

        }
    }

    public Boolean validarFormatoFecha(String fecha) throws Exception {
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})";
        if (!util.buscarCoincidencias(regex, fecha)) {
            throw new Exception("el formato debe ser en dd/MM/yyyy");
        }else {
            return true;
        }
    }
    public void costoPersona(double costoPorPersona) throws Exception {
        if(costoPorPersona > 0) {
            throw new Exception(Mensajes.COSTO_VALIDACION.getMensaje());
        }
    }


    public void validarFechas(LocalDate fechaFin) {
    }
}


