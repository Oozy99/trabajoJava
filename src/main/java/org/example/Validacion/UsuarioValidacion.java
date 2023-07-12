package org.example.Validacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {

    public UsuarioValidacion() {
    }

    // métodos ordinarios para validar datos
    public Boolean validarNombre(String nombres) throws Exception {
        String exprecionRegulas = "^[a-zA-Z]+$";
        Pattern patron = Pattern.compile(exprecionRegulas);
        Matcher coincidencia = patron.matcher(nombres);

        if (!coincidencia.matches()) {
            throw new Exception("Señor usuario su nombre solo puede tener letras ");
        } else if (nombres.length() < 10) {
            throw new Exception("Señor reviser la cantidad de caracteres es muy pequeña");
        } else {
            return true;
        }
    }
}

