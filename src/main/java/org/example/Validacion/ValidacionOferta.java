package org.example.Validacion;

import org.example.trabajo.Oferta;
import org.example.utilidades.Util;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ValidacionOferta {


    protected Oferta oferta = new Oferta();

    public ValidacionOferta() {
    }

    public Boolean ValidarTitulo(String titulo) throws Exception {
        if (titulo.length() < 20) {
            return true;
        } else {
            throw new Exception("El titulo no puede sobrepasar los caracteres");
        }
    }

    public Boolean validarFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaInicio.isAfter(fechaFin)==false && fechaFin.isEqual(fechaInicio)==false) {
            return true;
        } else {
            throw new Exception("La fecha de inicio no puede ser mayor que la fecha de fin");

        }

    }

    public Boolean validarFormatoFecha(String fecha) throws  Exception{
        try {
            LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return true;
        }catch (DateTimeParseException e ){
            throw new Exception("las fechas deben ser de DD/MM/YYYY");
        }
    }
    public void costoPersona(double costoPorPersona) throws Exception {
        if(costoPorPersona < 0) {
            throw new Exception("El costo por persona no es valido");
        }
    }


}


