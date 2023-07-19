package org.example.Validacion;

import org.example.trabajo.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReservaValidacion {

    protected Reserva ReservaValidacion = new Reserva();

    public ReservaValidacion() {
    }

    public Boolean validarFecha(String fecha) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(fecha);
            return true;
        } catch (ParseException e) {
            throw new Exception("La fecha ingresada no tiene el formato 'DD/MM/YYYY'");
        }
    }

    public Boolean validarNumeroDePersonas(int numeroDePersonas) throws Exception {
        if (numeroDePersonas > 4) {
            throw new Exception("El número de personas por reserva no puede ser mayor a 4");
        }
        return true;
    }
}
