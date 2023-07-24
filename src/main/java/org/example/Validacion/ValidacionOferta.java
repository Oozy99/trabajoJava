package org.example.Validacion;

import org.example.trabajo.Oferta;
import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidacionOferta {



    public ValidacionOferta() {
    }

    public Boolean ValidarTitulo(String titulo) throws Exception {
        if (titulo.length() < 20) {
            return true;
        } else {
            throw new Exception(Mensajes.TITULO_VALIDACION.getMensaje());
        }
    }

    public Boolean validarFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaInicio.isAfter(fechaFin)) {
            throw new Exception(Mensajes.FECHA_EVENTO.getMensaje());
        } else {
            return true;
        }
    }



    public Boolean validarFormatoFecha(String fecha) throws  Exception{
        try {
            LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return true;
        }catch (DateTimeParseException e ){
            throw new Exception(Mensajes.FECHA_OFERTA.getMensaje());
        }
    }
    public void costoPersona(double costoPorPersona) throws Exception {
        if(costoPorPersona < 0) {
            throw new Exception(Mensajes.COSTO_VALIDACION.getMensaje());
        }
    }


}


