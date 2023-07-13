package org.example.Validacion;

import org.example.utilidades.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    protected Util util=new Util(); //asi se crea el objeto
    public UsuarioValidacion() {
    }

    // métodos ordinarios para validar datos
    public Boolean validarNombre(String nombres) throws Exception {
        String exprecionRegular = "^[a-zA-Z]+$";

        if (!util.buscarCoincidencias(exprecionRegular,nombres)) {
            throw new Exception("Señor usuario su nombre solo puede tener letras ");
        } else if (nombres.length() < 10) {
            throw new Exception("Señor reviser la cantidad de caracteres es muy pequeña");
        } else {
            return true;
        }
    }

    public Boolean validarCorreo(String correo)throws Exception{
        String exprecionRegular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";


        if (!util.buscarCoincidencias(exprecionRegular,correo)) { //si o hay concidencia
            throw new Exception("Señor usuario su correo no es valido  ");
        }else
            return true;


    }
public Boolean validarUbicacion(Integer ubicacion){
    if (ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4)) {
        return true;
    } else {
        throw new IllegalArgumentException("La zona ingresada no es válida");
        }
}
}

